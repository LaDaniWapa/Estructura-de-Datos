/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

import java.util.*;

public class Experimento2 {

    public static void main(String[] args) {
        List<Integer> lista1, lista2;
        lista1 = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            lista1.add(i);
        }
        System.out.println("l: " + lista1);
        lista2 = new ArrayList<>(lista1);
       
        lista2.addAll(lista1);
        //System.out.println("Capacidad lista2 " + lista2.size());
        //Collections.copy(lista2, lista1);
        System.out.println("m: " + lista2);
    }
}
