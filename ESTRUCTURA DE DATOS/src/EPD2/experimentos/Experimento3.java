/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

import java.util.*;

public class Experimento3 {

    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>();
        for (int i = 5; i >= 0; i--) {
            l.add(i * 10);
        }
        Collections.sort(l);
        System.out.println("Lista: " + l);
        
        int posicion = Collections.binarySearch(l, 20);
        if (posicion >= 0) {
            System.out.println("El 20 está en la posición " + posicion + " de la lista");
        } else {
            System.out.println("No está el número 20 en la lista");
        }
        System.out.println("Máximo: " + Collections.max(l));
        System.out.println("Mínimo: " + Collections.min(l));
    }
}
