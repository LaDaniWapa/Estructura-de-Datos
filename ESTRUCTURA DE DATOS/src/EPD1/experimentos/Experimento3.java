package EPD1.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import poo.io.*;

public class Experimento3 {

    public static void main(String args[]) {
        Collection<Integer> c = new ArrayList<>();
        //int[] v;
        Object[] v;
        int elementos;
        System.out.println("Introduzca el número de datos: ");
        elementos = (int) IO.readNumber();
        for (int i = 0; i < elementos; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            c.add((int) IO.readNumber());
        }
        //v = new Integer[c.size()];
        v = c.toArray();
        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + v[i].toString());
        }
    }
        
   /* public static void main(String args[]) {
        Collection c = new ArrayList();
        int[] v;
        int elementos;
        System.out.println("Introduzca el número de datos: ");
        elementos = (int) IO.readLine();
        for (int i = 0; i < elementos; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            c.add((int) IO.readNumber());
        }
        v = c.toArray();
        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + v[i].toString());
        }
    }*/
}
