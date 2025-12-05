/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

import java.util.*;

public class Experimento5 {

    public static void main(String[] args) {
        Collection<IPersona> c = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(new Persona(i * 10));
        }
        System.out.println("Edades: " + c);
        System.out.println("Maxima edad: " + Collections.max(c));
        System.out.println("Minima edad: " + Collections.min(c));
    }
}
