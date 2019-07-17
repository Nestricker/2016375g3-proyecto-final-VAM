
package data;

import java.util.ArrayList;

public class Estudiante extends Usuario {

    public Estudiante(String documento, String clave, String nombres, String apellidos, String programa, String correo, ArrayList<Tutoria> listaTutorias) {
        super(documento, clave, nombres, apellidos, programa, correo, listaTutorias);
    }

    public Estudiante() {
        super(null,null,null,null,null,null,null);
    }
    
@Override
    public String toString(){
        return "Nombres: " + super.getNombres() +"\nApellidos: " + super.getApellidos() + "\nDocumento: " + super.getDocumento() + "\nCarrera: " + super.getPrograma()+"\nCorreo: " + super.getCorreo()+ "\nContraseña: " + super.getClave();
    }
    
}
