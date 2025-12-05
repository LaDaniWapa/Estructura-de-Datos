package EPD1.ejercicios.P5;

public class Entry implements IEntry {
    private String palabra;
    private String definicion;

    public Entry() {}

    public Entry(String palabra, String definicion) {
        this.palabra = palabra;
        this.definicion = definicion;
    }

    @Override
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String getPalabra() {
        return palabra;
    }

    @Override
    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String getDefinicion() {
        return definicion;
    }
}
