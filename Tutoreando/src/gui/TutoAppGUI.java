package gui;

import data.Estudiante;
import data.Tutor;
import data.Tutoria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TutoAppGUI {
//Colecciones a usar
    static HashMap<String,Estudiante> Estudiantes= new HashMap<>();
    static HashMap<String,Tutor> Tutores= new HashMap<>();
//Lector :P
    static Scanner lector=new Scanner(System.in);
//Instanciación

//Metodos de instanciasion  
    static void crearUsuario(String documento, String clave, String nombres, String apellidos, String programa, String correo,String celular){
        ArrayList<Tutoria> tutorias = new ArrayList<>();
            Estudiante nuevo = new Estudiante(documento,clave,nombres,apellidos,programa,correo,tutorias);
                Estudiantes.put(correo, nuevo);
                
        ArrayList<Tutoria> tutoriasT = new ArrayList<>();
            Tutor nuevoT = new Tutor(celular,documento,clave, nombres, apellidos, programa, correo, tutoriasT);
                Tutores.put(correo,nuevoT);
    }
//Metodos para acceder cambios en la lista de tutorias en Tutor
    static void agregarTutoriaT(String a, String materia, String hora, String lugar){
        Tutores.get(a).getListaTutorias().add(new Tutoria(Tutores.get(a),materia,hora,lugar));
    }
    static void cancelarTutoriaT(String a, Tutoria tutoria){
        for(int i=0; i<Tutores.get(a).getListaTutorias().size() ; i++){
            if(Tutores.get(a).getListaTutorias().get(i) == tutoria){
                Tutores.get(a).getListaTutorias().remove(i);
            }
        }
    }
//Metodos para modificar perfil
    static void modificarDocumento(String a, String b){
        Estudiantes.get(a).setDocumento(b);
        Tutores.get(a).setDocumento(b);
    }
    static void modificarClave(String a, String b){
        Estudiantes.get(a).setClave(b);
        Tutores.get(a).setClave(b);
    }
    static void modificarNombres(String a, String b){
        Estudiantes.get(a).setNombres(b);
        Tutores.get(a).setNombres(b);
    }
    static void modificarApellidos(String a, String b){
        Estudiantes.get(a).setApellidos(b);
        Tutores.get(a).setApellidos(b);
    }
    static void modificarPrograma(String a, String b){
        Estudiantes.get(a).setPrograma(b);
        Tutores.get(a).setPrograma(b);
    }
    static void modificarCorreo(String a, String b){
        Estudiantes.get(a).setCorreo(b);
        Tutores.get(a).setCorreo(b);
        Estudiantes.put(b, Estudiantes.get(a));
        Estudiantes.remove(a);
        Tutores.put(b, Tutores.get(a));
        Tutores.remove(a);
    }
//Metodos para acceder cambios en la lista de tutorias en ESTUDIANTE    
    static void tomarTutoriaE(String a,Tutoria tutoria){
        tutoria.setEstudiante(Estudiantes.get(a));
        Estudiantes.get(a).getListaTutorias().add(tutoria);
    }
    static void cancelarTutoriaE(String a, int b){
        Estudiantes.get(a).getListaTutorias().get(b).setEstudiante(null);
        Estudiantes.get(a).getListaTutorias().remove(b);
        
    }
//Metodos para filtrar  
    static ArrayList<Tutoria> filtrarTutoria(String z, String a){
        ArrayList<Tutoria> zx = new ArrayList<>();
        for(Tutor tutor: Tutores.values()){
            for(Tutoria b : tutor.getListaTutorias()){
                if(b.getMateria().equals(a) && b.getEstudiante() == null && !b.getTutor().equals(Tutores.get(z))){
                    zx.add(b);
                }
            }
        }
        return zx;
    }
    static ArrayList<Tutoria> filtrarTutoriasModificables(String a){
        ArrayList<Tutoria> zx = new ArrayList<>();
        for(Tutoria b : Tutores.get(a).getListaTutorias()){
            if(b.getEstudiante() == null){
                    zx.add(b);
                }
        }
        return zx;
    }
    static ArrayList<Tutoria> filtrarTutoriasAsignada(String a){
        ArrayList<Tutoria> zx = new ArrayList<>();
        for(Tutoria b : Tutores.get(a).getListaTutorias()){
            if(b.getEstudiante() != null){
                    zx.add(b);
                }
        }
        return zx;
    }
//Otros metodos
    static boolean documentoRegistrado(String a){
        boolean j = false;
        for(Estudiante estudiante: Estudiantes.values()){
                if(estudiante.documentoExistente(a)){
                   j=true;
                }
        }
        return j;
    }
    static boolean correoRegistrado(String a){
        boolean j = false;
        if(Estudiantes.containsKey(a)){
            j=true;
        }
        return j;
    }
    static Tutor encontrarTutor(String a){
        Tutor z = new Tutor(null,null,null,null,null,null,null,null);
        for(Tutor b : Tutores.values()){
            if(b.getCorreo().equals(a)){
                z=b;
            }
        }
        return z;
    }
    
    static boolean VerificarDatos(String a, String b){
        boolean j = false;
        if(Estudiantes.containsKey(a) && Estudiantes.get(a).validarDatos(a,b)){
                        j= true;
        }
        return j;
    }
    
}
//  VERSION 2.4