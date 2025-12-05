package examen;

import java.util.Objects;

public class Tenista implements ITenista {
    private String nombre;
    private int numTitulos;
    private int edad;
    private int rankingATP;

    public Tenista() {
    }

    public Tenista(String nombre, int numTitulos, int edad, int rankintATP) {
        this.nombre = nombre;
        this.numTitulos = numTitulos;
        this.edad = edad;
        this.rankingATP = rankintATP;
    }

    @Override
    public String toString() {
        return "Tenista{" +
                "nombre='" + nombre + '\'' +
                ", numTitulos=" + numTitulos +
                ", edad=" + edad +
                ", rankingATP=" + rankingATP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Tenista tenista) {
            return numTitulos == tenista.numTitulos && edad == tenista.edad && rankingATP == tenista.rankingATP;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numTitulos, edad, rankingATP);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNumTitulos(int numTItulos) {
        this.numTitulos = numTItulos;
    }

    @Override
    public int getNumTitulos() {
        return numTitulos;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setRankingATP(int rankingATP) {
        this.rankingATP = rankingATP;
    }

    @Override
    public int getRankingATP() {
        return rankingATP;
    }

    @Override
    public int compareTo(ITenista tenista) {
        return this.rankingATP - tenista.getRankingATP();
    }
}
