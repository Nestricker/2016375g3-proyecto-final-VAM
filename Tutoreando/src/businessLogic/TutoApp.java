package businessLogic;



import data.Estudiante;
import data.Tutor;
import data.Tutoria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TutoApp {
//Colecciones a usar
    static HashMap<String,Estudiante> Estudiantes= new HashMap<>();
    static HashMap<String,Tutor> Tutores= new HashMap<>();
//Lector :P
    static Scanner lector=new Scanner(System.in);
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
    
    public static void main(String[] args) {
        /*TutoApp.crearUsuario("123", "123", "david", "Aguilar", "Ing. pa gays", "waguilar",311678639);
        Tutoria lab = new Tutoria(Tutores.get("waguilar"),"Fisica","12","CyT");
        Tutores.get("waguilar").getListaTutorias().add(lab);*/
        int z=1;
        do{
            System.out.println("1. Ingresar\n2. Registrarse\n3. Salir");
            switch(lector.nextInt()){
                
                case 1:
                    lector.nextLine();
                    System.out.println("Correo: ");
                    String correoA = lector.nextLine();
                    System.out.println("Contraseña: ");
                    String clave = lector.nextLine();
                    if(Estudiantes.containsKey(correoA)){
                        if(Estudiantes.get(correoA).validarDatos(correoA, clave)){
                            int y=1;
                            do{
                                System.out.println("1. Perfil\n2. Solicitar tutorias\n3. Adiministrar mis tutorias\n4. Yo tutor\n5. Salir");
                                switch(lector.nextInt()){
                                    case 1:
                                        int j=1;
                                        do{
                                      System.out.println(Estudiantes.get(correoA)+"\n\n¿Desea modificar algun dato?"+"\n1. Sí"+"\n2. Volver");
                                                  
                                      switch(lector.nextInt()){
                                                    case 1:
                                                        System.out.println("¿Cual?\n1. Nombres\n2. Apellidos\n3. Documento\n4. Carrera\n5. Correo\n6. Contraseña");                                                        
                                                            switch(lector.nextInt()){
                                                            case 1:
                                                                lector.nextLine();
                                                                System.out.println("Ingrese nuevo(s) nombre(s)");
                                                                String nombresm = lector.nextLine();
                                                                TutoApp.modificarNombres(correoA,nombresm);
                                                                
                                                                break;
                                                            case 2:
                                                                lector.nextLine();
                                                                System.out.println("Ingrese nuevo(s) apellidos(s)");
                                                                String apellidom = lector.nextLine();
                                                                TutoApp.modificarApellidos(correoA,apellidom);                                                                
                                                                break;
                                                            case 3:
                                                                lector.nextLine();
                                                                System.out.println("Ingrese nuevo documento");
                                                                String docum = lector.nextLine();
                                                                TutoApp.modificarDocumento(correoA,docum);
                                                                break;
                                                            case 4:
                                                                lector.nextLine();
                                                                System.out.println("Ingrese nueva carrera");
                                                                String programam = lector.nextLine();
                                                                TutoApp.modificarPrograma(correoA,programam);                                                                
                                                                break;
                                                            case 5:
                                                                lector.nextLine();
                                                                System.out.println("Ingrese nuevo correo");
                                                                String correom = lector.nextLine();
                                                                TutoApp.modificarCorreo(correoA,correom);
                                                                y=j=0;
                                                                break;
                                                            case 6:
                                                                lector.nextLine();
                                                                System.out.println("Ingrese nueva contraseña");
                                                                String clavem = lector.nextLine();
                                                                TutoApp.modificarClave(correoA,clavem);
                                                                y=j=0;
                                                                break;
                                                        }
                                                        
                                                        break;
                                                    case 2:
                                                        j=0;
                                                        break;
                                                }
                                        }while(j!=0);
                                        break;
                                    case 2:
                                        int w=1;
                                        do{
                                        System.out.println("¿Que area?\n1. Matematica\n2. Física\n3. Quimica\n4. Volver");
                                        switch(lector.nextInt()){
                                            case 1:
                                                if(TutoApp.filtrarTutoria(correoA,"Matematicas").isEmpty()){
                                                    System.out.println("No hay tutorias disponibles en esta area");
                                                }else{
                                                for(Tutoria yu : TutoApp.filtrarTutoria(correoA,"Matematicas")){
                                                    int i=1;
                                                    System.out.println("\n" + i + ".");
                                                    System.out.println(yu.impresionEstudiante());
                                                    i++;
                                                }
                                                    System.out.println("¿Cual quiere tomar?");
                                                    int a = lector.nextInt();
                                                    lector.nextLine();
                                                    System.out.println(TutoApp.encontrarTutor(TutoApp.filtrarTutoria(correoA,"Matematicas").get(a-1).getTutor().getCorreo()));
                                                    TutoApp.tomarTutoriaE(correoA, TutoApp.filtrarTutoria(correoA,"Matematicas").get(a-1));                                                    
                                                }
                                                break;
                                            case 2:
                                                if(TutoApp.filtrarTutoria(correoA,"Fisica").isEmpty()){
                                                    System.out.println("No hay tutorias disponibles en esta area");
                                                }else{
                                                for(Tutoria yu : TutoApp.filtrarTutoria(correoA,"Fisica")){
                                                    int i=1;
                                                    System.out.println("\n" + i + ".");
                                                    System.out.println(yu.impresionEstudiante());
                                                    i++;
                                                }
                                                    System.out.println("¿Cual quiere tomar?");
                                                    int b = lector.nextInt();
                                                    lector.nextLine();
                                                    System.out.println("Este es su Tutor");
                                                    System.out.println(TutoApp.encontrarTutor(TutoApp.filtrarTutoria(correoA,"Fisica").get(b-1).getTutor().getCorreo()));
                                                    TutoApp.tomarTutoriaE(correoA, TutoApp.filtrarTutoria(correoA,"Fisica").get(b-1));
                                                    
                                                }
                                                break;
                                            case 3:
                                                if(TutoApp.filtrarTutoria(correoA,"Qumica").isEmpty()){
                                                    System.out.println("No hay tutorias disponibles en esta area");
                                                }else{
                                                for(Tutoria yu : TutoApp.filtrarTutoria(correoA,"Quimica")){
                                                    int i=1;
                                                    System.out.println("\n" + i + ".");
                                                    System.out.println(yu.impresionEstudiante());
                                                    i++;
                                                }
                                                    System.out.println("¿Cual quiere tomar?");
                                                    int c = lector.nextInt();
                                                    lector.nextLine();
                                                    System.out.println(TutoApp.encontrarTutor(TutoApp.filtrarTutoria(correoA,"Quimica").get(c-1).getTutor().getCorreo()));
                                                    TutoApp.tomarTutoriaE(correoA, TutoApp.filtrarTutoria(correoA,"Quimica").get(c-1));
                                                }
                                                break;
                                            case 4:
                                                w=0;
                                                break;
                                        }
                                        }while(w!=0);
                                        break;
                                    case 3:
                                        int hj=1;
                                        do{
                                            if(Estudiantes.get(correoA).getListaTutorias().isEmpty()){
                                                System.out.println("No tiene tutorias asignadas");
                                            }else{
                                        for(Tutoria a : Estudiantes.get(correoA).getListaTutorias()){
                                            System.out.println(a.impresionEstudiante());
                                        }}
                                            System.out.println("¿Que desea hacer?\n1. Cancelar Tutoria\n2. Volver");
                                        switch(lector.nextInt()){
                                            case 1:
                                                lector.hasNextLine();
                                                int b=lector.nextInt();
                                                TutoApp.cancelarTutoriaE(correoA, b-1);
                                                break;
                                            case 2:
                                                hj=0;
                                                break;
                                        }
                                        }while(hj!=0);
                                        break;
                                        //TUTOR
                                    case 4:
                                        int lk=1;
                                        do{
                                            System.out.println("\n1. Adiministrar tutorias\n2. Ver tutorias asignadas\n3. Yo estudiante\n4. Salir");
                                        switch(lector.nextInt()){
                                            case 1:
                                            lector.nextLine();
                                            int jh = 1;
                                            do{ 
                                                if(TutoApp.filtrarTutoriasModificables(correoA).isEmpty()){
                                                    System.out.println("~~~* No tiene tutorias modificables *~~~\n");
                                                }else{
                                                System.out.println("~~~* Estan son las tutorias modificables *~~~\n");
                                                for(Tutoria b : TutoApp.filtrarTutoriasModificables(correoA)){
                                                    System.out.println(b.impresionTutor());
                                                }}
                                                System.out.println("1. Agregar tutoria\n2. Eliminar Tutoria\n3. Editar tutoria\n4. Volver");
                                                
                                                switch(lector.nextInt()){
                                                    case 1:
                                                    lector.nextLine();
                                                        System.out.println("Materia:");
                                                    String materia = lector.nextLine();
                                                    System.out.println("Hora:");
                                                    String hora = lector.nextLine();
                                                    System.out.println("Lugar:");
                                                    String lugar = lector.nextLine();
                                                    TutoApp.agregarTutoriaT(correoA, materia, hora, lugar);
                                                        break;
                                                    case 2:
                                                        lector.nextLine();
                                                        System.out.println("¿Cual desea eliminar?");
                                                        int a = lector.nextInt();
                                                        TutoApp.cancelarTutoriaT(correoA, TutoApp.filtrarTutoriasModificables(correoA).get(a-1));
                                                        break;
                                                    case 3:
                                                        int kl=1;
                                                        
                                                        System.out.println("¿Cual?");
                                                        int fg = lector.nextInt();
                                                        do{
                                                            System.out.println("¿Que desea editar?\n1. Materia\n2. Hora\n3. Lugar\n4. Volver");
                                                            switch(lector.nextInt()){
                                                                case 1:
                                                                    lector.nextLine();
                                                                    System.out.println("Digite nueva Materia");
                                                                    String materiaE = lector.nextLine();
                                                                    TutoApp.filtrarTutoriasModificables(correoA).get(fg-1).setMateria(materiaE);
                                                                    break;
                                                                case 2:
                                                                    lector.nextLine();
                                                                    System.out.println("Digite nueva Hora");
                                                                    String horaE = lector.nextLine();
                                                                    TutoApp.filtrarTutoriasModificables(correoA).get(fg-1).setHora(horaE);
                                                                    break;
                                                                case 3:
                                                                    lector.nextLine();
                                                                    System.out.println("Digite nuevo Lugar");
                                                                    String lugarE = lector.nextLine();
                                                                    TutoApp.filtrarTutoriasModificables(correoA).get(fg-1).setHora(lugarE);
                                                                    break;
                                                                case 4:
                                                                    kl=0;
                                                                    break;
                                                            }
                                                        }while(kl!=0);
                                                        break;
                                                    case 4:
                                                        jh=0;
                                                        break;
                                                }
                                               
                                            }while(jh!=0);
                                            
                                                break;
                                            case 2:
                                                if(TutoApp.filtrarTutoriasAsignada(correoA).isEmpty()){
                                                    System.out.println("No hay tutorias asignadas");
                                                }
                                                for(Tutoria a: TutoApp.filtrarTutoriasAsignada(correoA)){
                                                    System.out.println(a.impresionTutor());
                                                }
                                                break;
                                            case 3:
                                                lk=0;
                                                break;
                                            case 4:        
                                                lk=y=0;
                                                break;
                                            
                                        }
                                        }while(lk!=0);
                                        break;
                                    case 5:
                                        y=0;
                                        break;
                                }
                            }while(y!=0);
                        }else{
                            System.out.println("Contraseña incorrecta");
                        }
                    }else{
                        System.out.println("No se encuentra registrado");
                    }
                    break;
                case 2:
                    lector.nextLine();
                    int op=1;
                    int op2=1;
                    String correoV = "";
                    System.out.println("Correo: ");
                    do{
                    String correo = lector.nextLine();
                    if(!TutoApp.correoRegistrado(correo)){
                        correoV=correo;
                        op2=0;
                    }else{
                        System.out.println("Ya hay un usuario con este correo");
                    }
                    }while(op2!=0);
                    
                    String documentoV = "";
                    System.out.println("Documento: ");
                    do{
                    String doc1 = lector.nextLine();
                    if(!TutoApp.documentoRegistrado(doc1)){
                        documentoV=doc1;
                        op=0;
                    }else{
                        System.out.println("Ya hay un usuario con este documento");
                    }
                    }while(op!=0);
                    System.out.println("Contraseña: ");
                    String clave1 = lector.nextLine();
                    System.out.println("Nombres: ");
                    String nombres = lector.nextLine();
                    System.out.println("Apellidos: ");
                    String apellidos = lector.nextLine();
                    System.out.println("Carrera: ");
                    String programa = lector.nextLine();
                    System.out.println("Numero celular: ");
                    String celular = lector.nextLine();
                    
                    TutoApp.crearUsuario(documentoV, clave1, nombres, apellidos, programa, correoV, celular);
                    
                    break;
                case 3:
                    lector.nextLine();
                    z=0;
                    break;
        }
        }while(z!=0);
    }
}
//  VERSION 2.4