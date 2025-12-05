package EPD1.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class Experimento1 {

    public static void main(String[] args) {
        Collection<Integer> collectionEnteros = new ArrayList<>();
        
        

        System.out.println("La colección tiene " + collectionEnteros.size() + " elementos");
        if (collectionEnteros.isEmpty()) {
            System.out.println("La colección está vacía");
        }

        for (int i = 0; i < 5; i++) // Añadimos elementos a la colección
        {
            collectionEnteros.add(i * 3);
        }

        System.out.println("La colección tiene " + collectionEnteros.size() + " elementos");

        System.out.println("La colección contiene: " + collectionEnteros);
    }
}
