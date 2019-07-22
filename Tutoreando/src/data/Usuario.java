package data;

import java.util.ArrayList;
import ui.Tutofaz;

public abstract class Usuario implements Tutofaz {

    private String documento;
    private String clave;
    private String nombres;
    private String apellidos;
    private String programa;
    private String correo;
    private ArrayList<Tutoria> listaTutorias;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Tutoria> getListaTutorias() {
        return listaTutorias;
    }

    public void setListaTutorias(ArrayList<Tutoria> listaTutorias) {
        this.listaTutorias = listaTutorias;
    }

    public Usuario(String documento, String clave, String nombres, String apellidos, String programa, String correo, ArrayList<Tutoria> listaTutorias) {
        this.documento = documento;
        this.clave = clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.programa = programa;
        this.correo = correo;
        this.listaTutorias = listaTutorias;
    }

public boolean documentoExistente(String a){
    boolean j=false;
    if(this.documento.equals(a)){
    j=true;
}
    return j;
}

    @Override
    public boolean validarDatos(String correo, String clave) {
        boolean a=false;
        if(this.correo.equals(correo) && this.clave.equals(clave)){
            a=true;
        }
        return a;
    }
    
}
