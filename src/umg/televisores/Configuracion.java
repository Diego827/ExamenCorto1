package umg.televisores;

/**
 * Created by alumno on 5/07/2017.
 */
public class Configuracion {
    private int canal;
    private String tematica;
    private boolean menorEdad;

    //get and setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public boolean isMenorEdad() {
        return menorEdad;
    }

    public void setMenorEdad(boolean menorEdad) {
        this.menorEdad = menorEdad;
    }

    //Constructor


    public Configuracion(int canal, String tematica, boolean menorEdad) {
        this.canal = canal;
        this.tematica = tematica;
        this.menorEdad = menorEdad;
    }


}
