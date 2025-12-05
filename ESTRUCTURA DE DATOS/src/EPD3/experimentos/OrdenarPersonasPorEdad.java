package EPD3.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;

public class OrdenarPersonasPorEdad implements Comparator<IPersona> {

    public int compare(IPersona persona1, IPersona persona2) {

        return persona1.getEdad() - persona2.getEdad();
        /*
        if (persona1.getEdad() < persona2.getEdad()) {
            return -1;
        } else if (persona1.getEdad() > persona2.getEdad()) {
            return +1;
        } else {
            return 0;
        }*/
    }
}
