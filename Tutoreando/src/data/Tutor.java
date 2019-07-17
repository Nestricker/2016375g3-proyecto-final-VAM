
package data;

import java.util.ArrayList;

public class Tutor extends Usuario {
    
    private String numeroCelular;

    public Tutor() {
        super(null,null,null,null,null,null,null);
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Tutor(String numeroCelular, String documento, String clave, String nombres, String apellidos, String programa, String correo, ArrayList<Tutoria> listaTutorias) {
        super(documento, clave, nombres, apellidos, programa, correo, listaTutorias);
        this.numeroCelular = numeroCelular;
    }

@Override
public String toString(){
    return "\nNombres: " + super.getNombres() + "\nApellidos: " + super.getApellidos() +"\nNumero de contacto: "+ this.numeroCelular + "\n";
    }
}
