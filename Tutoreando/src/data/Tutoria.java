
package data;

import java.io.Serializable;

public class Tutoria implements Serializable{
    private Tutor tutor;
    private Estudiante estudiante;
    private String materia;
    private String hora;
    private String lugar;


    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Tutoria(Tutor tutor, String materia, String hora, String lugar) {
        this.tutor = tutor;
        this.materia = materia;
        this.hora = hora;
        this.lugar = lugar;
    }
    
    public String impresionTutor(){
        String a;
        String b;
        if(this.estudiante==null){
            a = "Sin asignar";
            b = "";
        }else{
            a = estudiante.getNombres();
            b = estudiante.getApellidos();
        }
        return "Estudiante: " + a + " " + b +"\nMateria: " + this.materia + "\nHora: " + this.hora + "\nLugar: " + this.lugar+"\n\n";
    }
    public String impresionEstudiante(){
        return "Tutor: " + tutor.getNombres() + " " + tutor.getApellidos() +"\nMateria: " + this.materia +"\nHora: " + this.hora + "\nLugar: " + this.lugar+"\n\n";
    }
}
