package EPD1.ejercicios.P5;

public interface IDiccionario {
    //Incluir
    boolean addEntrada(IEntry entrada);

    // Eliminar
    boolean deleteEntrada(IEntry entrada);

    // Buscar
    IEntry getEntrada(String palabra);

}
