/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

/**
 *
 * @author EPS
 */
import java.util.*;

public class Experimento8 {

    public static void main(String[] args) {
        List<Character> l = new LinkedList<>();
        ListIterator it;
        for (int i = 0; i < 5; i++) { // Añadimos letras
            l.add(new Character((char) ('a' + i)));
        }
        System.out.println(l);
        it = l.listIterator(l.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
