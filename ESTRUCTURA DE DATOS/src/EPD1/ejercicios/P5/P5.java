package EPD1.ejercicios.P5;

import java.util.Scanner;

public class P5 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        IDiccionario diccionario = new Diccionario();
        diccionario.addEntrada(new Entry("Jaime", "Wele peste"));
        diccionario.addEntrada(new Entry("Lupa", "Kome mierda"));
        diccionario.addEntrada(new Entry("JuanLuis", "Mi marido"));

        System.out.println("Introduce la palbra: ");
        String palabra = sc.nextLine();

        IEntry entrada = diccionario.getEntrada(palabra);

        if (entrada != null)
            System.out.printf(entrada.getDefinicion());
        else
            System.out.println("No se ha encontrado esta palabra en el diccionario");


        sc.close();
    }
}
