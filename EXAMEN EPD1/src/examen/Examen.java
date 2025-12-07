package examen;

public class Examen {
    public static void main(String[] args) {
        TenistasATP tenistas = new TenistasATP();

        tenistas.tenistaNuevo(new Tenista("Rafael", 67, 33, 2));
        tenistas.tenistaNuevo(new Tenista("Ariel", 27, 28, 4));
        tenistas.tenistaNuevo(new Tenista("Rodrigo",15,21,3));
        tenistas.tenistaNuevo(new Tenista("Mario", 38, 31 ,1));
        tenistas.tenistaNuevo(new Tenista("Jannik", 115, 25, 5));
        tenistas.tenistaNuevo(new Tenista("Novak", 87, 29, 6));
        tenistas.tenistaNuevo(new Tenista("Carlos", 187, 22 ,7));

        tenistas.getTenistas().forEach(System.out::println);
        System.out.println("\n       ========  TOP  ========");
        tenistas.tenistasTop(3).forEach(System.out::println);
        System.out.println("\n      ========  SENIOR  ========");
        tenistas.tenistasSenior().forEach(System.out::println);
    }
}
