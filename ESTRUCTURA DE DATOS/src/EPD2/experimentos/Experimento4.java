/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

import java.util.*;

public class Experimento4 {

    public static void main(String[] args) {
        List<Numero> l = new ArrayList<>();
        Iterator it;
        for (int i = 0; i < 10; i++) {
            l.add(new Numero());
        }
        System.out.println("Antes de ordenar:");
        it = l.iterator();
        while (it.hasNext()) {
            System.out.print((Numero) it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println("\nDespués de ordenar:");
        ComparadorNumero comparador = new ComparadorNumero();
        Collections.sort(l, comparador);
        it = l.iterator();
        while (it.hasNext()) {
            System.out.print((Numero) it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}
