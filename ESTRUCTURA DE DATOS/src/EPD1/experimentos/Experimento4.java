package EPD1.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Experimento4 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterator it; // Referencia al iterador
        for (int i = 0; i <= 50; i++) // Rellenamos la coleccion
        {
            c.add(i);
        }
        it = c.iterator(); // Obtenemos un iterador para la colección
        while (it.hasNext()) // Mientras haya más elementos
        {
            System.out.println((Integer) it.next()); // Imprimimos el siguiente elemento
        }
    }
}
