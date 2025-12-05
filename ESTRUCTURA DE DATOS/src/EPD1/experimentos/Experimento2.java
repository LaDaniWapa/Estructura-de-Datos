package EPD1.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Experimento2 {

    public static void main(String[] args) {
        Collection <Integer> c = new ArrayList<>();
        Collection <String> d = new ArrayList<>();
        Iterator<Integer> it;
        for (int i = 0; i < 5; i++) { // Añadimos elementos a las colecciones
            c.add(i * 3);
            d.add(String.valueOf(3.1416 * i));
        }
        System.out.println("La colección c contiene: " + c);
        System.out.println("La colección d contiene: " + d);
        it=c.iterator();
        while(it.hasNext())
        {
            d.add(String.valueOf(it.next()));
        }
        
        /*d.addAll(c);*/
        d.retainAll(d); 
        System.out.println("Despues de d.addAll(c) la colección d contiene: " + d);
        d.retainAll(c);
        System.out.println("Despues de d.retainAll(c) la colección d contiene: " + d);
        d.removeAll(c);
        System.out.println("Despues de d.removeAll(c) la colección d contiene: " + d);
        
      
    }
}
