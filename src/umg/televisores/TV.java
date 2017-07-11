package umg.televisores;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 5/07/2017.
 */
public class TV {
    private String marca;
    private int pulgadas;
    private boolean plano;
    //List configuracion = new ArrayList();
    private List <Configuracion> configuracion;

    //funciones

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isPlano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }

    public List<Configuracion> getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(List<Configuracion> configuracion) {
        this.configuracion = configuracion;
    }


    //constructores


    public TV(String marca, int pulgadas, boolean plano, List<Configuracion> configuracion) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.plano = plano;
        this.configuracion = configuracion;
    }

    public void verificarCanales(TV televisor, int canal){

        for (Configuracion configuracion:televisor.configuracion
             ) {
            if (configuracion.getTematica()=="dibujos animados" && configuracion.getCanal()== canal)
            {
                System.out.println("Verdadero");
            }

        }
    }
}
