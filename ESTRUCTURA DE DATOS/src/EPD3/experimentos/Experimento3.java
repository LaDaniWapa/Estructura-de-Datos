/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.epd3;

import java.util.*;

public class Experimento3 {

    public static void main(String[] args) {
        String[] palabras = {"en", "un", "lugar", "de", "la", "mancha"};
        SortedSet<String> ss = new TreeSet<>();
        for (int i = 0; i < palabras.length; i++) {
            ss.add(palabras[i]);
        }
        System.out.println("ss: " + ss);
        System.out.println("Primera palabra: " + ss.first());
        System.out.println("Última palabra: " + ss.last());
        System.out.println("Palabras entre la letra g y la r: " + ss.subSet("g", "r"));
        System.out.println("Palabras desde la palabra \"lugar\" : " + ss.tailSet("lugar"));
        System.out.println("Palabras hasta la palabra \"lugar\" : " + ss.headSet("lugar"));
    }
}
