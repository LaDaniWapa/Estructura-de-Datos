package EPD3.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author EPS
 */
public class EDEPD3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortedSet<IPersona> conjuntoPersonas = new TreeSet<>();
        SortedSet<IPersona> conjuntoEdad = new TreeSet<>(new OrdenarPersonasPorEdad());
        conjuntoPersonas.add(new Persona("1234", "Antonio", 30));
    }
    
}
