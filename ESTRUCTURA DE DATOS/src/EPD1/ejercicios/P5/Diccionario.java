package EPD1.ejercicios.P5;

import java.util.ArrayList;
import java.util.Collection;

public class Diccionario implements IDiccionario {
    private final Collection<IEntry> entradas;

    public Diccionario() {
        entradas = new ArrayList<>();
    }

    @Override
    public boolean addEntrada(IEntry entrada) {
        return this.entradas.add(entrada);
    }

    @Override
    public boolean deleteEntrada(IEntry entrada) {
        return this.entradas.remove(entrada);
    }

    @Override
    public IEntry getEntrada(String palabra) {
        for (IEntry entrada : this.entradas) {
            if (entrada.getPalabra().equals(palabra)) {
                return entrada;
            }
        }
        return null;
    }
}
