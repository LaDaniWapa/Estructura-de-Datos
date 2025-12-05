package ed.epd3;

import java.util.*;

public class Experimento2 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Set<String> conjunto;
        String cadena = new String("hola");
        String hola = cadena;
        lista.add("yo");
        lista.add("soy");
        lista.add("yo");
        lista.add("tu");
        lista.add("eres");
        lista.add("tu");
        System.out.println("l: " + lista);
        conjunto = new HashSet<>(lista);
        System.out.println("s: " + conjunto);
    }
}
