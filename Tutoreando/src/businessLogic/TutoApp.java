package businessLogic;



import data.Estudiante;
import data.Tutor;
import data.Tutoria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import gui.TutoFrame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TutoApp {
    static String rutaE = "MySaveFileE.obj";
    static String rutaT = "MySaveFileT.obj";
//Colecciones a usar
    public static HashMap<String,Estudiante> Estudiantes = new HashMap<>();
    public static HashMap<String,Tutor> Tutores = new HashMap<>();
//Lector :P
    static Scanner lector=new Scanner(System.in);
//Metodos de instanciasion  
    public static void crearUsuario(String documento, String clave, String nombres, String apellidos, String programa, String correo,String celular){
        ArrayList<Tutoria> tutorias = new ArrayList<>();
            Estudiante nuevo = new Estudiante(documento,clave,nombres,apellidos,programa,correo,tutorias);
                Estudiantes.put(correo, nuevo);
                
        ArrayList<Tutoria> tutoriasT = new ArrayList<>();
            Tutor nuevoT = new Tutor(celular,documento,clave, nombres, apellidos, programa, correo, tutoriasT);
                Tutores.put(correo,nuevoT);
    }
//Metodos para acceder cambios en la lista de tutorias en Tutor
    public static void agregarTutoriaT(String a, String materia, String hora, String lugar){
        Tutores.get(a).getListaTutorias().add(new Tutoria(Tutores.get(a),materia,hora,lugar));
    }
    public static void cancelarTutoriaT(String a, Tutoria tutoria){
        for(int i=0; i<Tutores.get(a).getListaTutorias().size() ; i++){
            if(Tutores.get(a).getListaTutorias().get(i) == tutoria){
                Tutores.get(a).getListaTutorias().remove(i);
            }
        }
    }
//Metodos para modificar perfil
    public static void modificarDocumento(String a, String b){
        Estudiantes.get(a).setDocumento(b);
        Tutores.get(a).setDocumento(b);
    }
    public static void modificarClave(String a, String b){
        Estudiantes.get(a).setClave(b);
        Tutores.get(a).setClave(b);
    }
    public static void modificarNombres(String a, String b){
        Estudiantes.get(a).setNombres(b);
        Tutores.get(a).setNombres(b);
    }
    public static void modificarApellidos(String a, String b){
        Estudiantes.get(a).setApellidos(b);
        Tutores.get(a).setApellidos(b);
    }
    public static void modificarPrograma(String a, String b){
        Estudiantes.get(a).setPrograma(b);
        Tutores.get(a).setPrograma(b);
    }
//Metodos para acceder cambios en la lista de tutorias en ESTUDIANTE    
    public static void tomarTutoriaE(String a,Tutoria tutoria){
        tutoria.setEstudiante(Estudiantes.get(a));
        Estudiantes.get(a).getListaTutorias().add(tutoria);
    }
    public static void cancelarTutoriaE(String a, int b){
        Estudiantes.get(a).getListaTutorias().get(b).setEstudiante(null);
        Estudiantes.get(a).getListaTutorias().remove(b);
        
    }
//Metodos para filtrar  
    public static ArrayList<Tutoria> filtrarTutoria(String z, String a){
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
    public static ArrayList<Tutoria> filtrarTutoriasModificables(String a){
        ArrayList<Tutoria> zx = new ArrayList<>();
        for(Tutoria b : Tutores.get(a).getListaTutorias()){
            if(b.getEstudiante() == null){
                    zx.add(b);
                }
        }
        return zx;
    }
    public static ArrayList<Tutoria> filtrarTutoriasAsignada(String a){
        ArrayList<Tutoria> zx = new ArrayList<>();
        for(Tutoria b : Tutores.get(a).getListaTutorias()){
            if(b.getEstudiante() != null){
                    zx.add(b);
                }
        }
        return zx;
    }
//Otros metodos
    public static boolean documentoRegistrado(String a){
        boolean j = false;
        for(Estudiante estudiante: Estudiantes.values()){
                if(estudiante.documentoExistente(a)){
                   j=true;
                }
        }
        return j;
    }
    public static boolean correoRegistrado(String a){
        boolean j = false;
        if(Estudiantes.containsKey(a)){
            j=true;
        }
        return j;
    }
    public static boolean verificarDatos(String a, String b){
        boolean j = false;
        if(Estudiantes.containsKey(a) && Estudiantes.get(a).validarDatos(a,b)){
                        j= true;
        }
        return j;
    }
    public static void main(String[] args) {
        new TutoFrame();
    }
}
//  VERSION 3.4