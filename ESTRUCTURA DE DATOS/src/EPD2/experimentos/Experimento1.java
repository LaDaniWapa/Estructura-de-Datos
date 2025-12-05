/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

import java.util.*;

public class Experimento1 {

    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lista.add(i * Math.PI);
        }
        System.out.println(lista);
        for (int i = 0; i < 5; i++) {
            lista.add(i * 2, i * Math.E);
        }
        System.out.println(lista);
        for (int i = 0; i < 5; i++) {
            System.out.println(lista.get(i * 2));
        }
        for (int i = 0; i < 5; i++) {
            lista.remove(i + 1);
        }
        System.out.println(lista);
    }
}
