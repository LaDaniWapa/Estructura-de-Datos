package ed.epd3;

import java.util.*;

public class Experimento1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Set<Integer> conjunto = new HashSet<>();
        Iterator<Integer> it;
        for (int i = 5; i >= 1; i--) {
            lista.add(i);
            conjunto.add(i);
        }
        it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
        it = conjunto.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
