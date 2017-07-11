package umg.televisores;

import java.util.List;
import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */





public class Main {



    public static void main(String[] args) {
        // write your code here

        TV televisor = new TV("test",14,true,null);
        //televisor = null;
        Configuracion configuracion = new Configuracion(15,"test",true);
    //Configuracion configuracion = null;

    televisor.setMarca("Panasonic");
    televisor.setPlano(true);
    televisor.setPulgadas(16);
    configuracion.setCanal(12);
    configuracion.setMenorEdad(true);
    configuracion.setTematica("country");
    televisor.setConfiguracion((List<Configuracion>) configuracion);

    configuracion.setCanal(13);
    configuracion.setMenorEdad(false);
    configuracion.setTematica("country");
    televisor.setConfiguracion((List<Configuracion>) configuracion);

    configuracion.setCanal(25);
    configuracion.setMenorEdad(false);
    configuracion.setTematica("dibujos animados");
    televisor.setConfiguracion((List<Configuracion>) configuracion);

    //Scanner sn = new Scanner(System.in);
    televisor.verificarCanales(televisor,25);

    }
}
