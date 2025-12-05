package EPD1.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Experimento6 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterator it; // Referencia al iterador
        for (int i = 1; i <= 10; i++) // Rellenamos la coleccion
        {
            c.add(i);
        }
        it = c.iterator(); // Obtenemos un iterador para la colección
        while (it.hasNext()) { // Mientras haya más elementos
            Integer i = (Integer) it.next();
            if (i.intValue() % 2 == 0 || i.intValue() % 3 == 0) {
                it.remove();
            }
           /* if (i.intValue() % 3 == 0) {
                it.remove();
            }*/
        }
        it = c.iterator(); // Obtenemos un iterador para la colección
        while (it.hasNext()) // Mientras haya más elementos
        {
            System.out.println((Integer) it.next()); // Imprimimos el siguiente elemento
        }
    }
}
