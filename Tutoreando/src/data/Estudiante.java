
package data;

import java.io.Serializable;
import java.util.ArrayList;

public class Estudiante extends Usuario implements Serializable{
    public Estudiante(String documento, String clave, String nombres, String apellidos, String programa, String correo, ArrayList<Tutoria> listaTutorias) {
        super(documento, clave, nombres, apellidos, programa, correo, listaTutorias);
    }
    
@Override
    public String toString(){
        return "Nombres: " + super.getNombres() +"\nApellidos: " + super.getApellidos() + "\nDocumento: " + super.getDocumento() + "\nCarrera: " + super.getPrograma()+"\nCorreo: " + super.getCorreo()+ "\nContraseña: " + super.getClave();
    }
    
}
