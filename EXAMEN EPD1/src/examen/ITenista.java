package examen;

public interface ITenista extends Comparable<ITenista> {
    void setNombre(String nombre);
    String getNombre();

    void setNumTitulos(int numTItulos);
    int getNumTitulos();

    void setEdad(int edad);
    int getEdad();

    void setRankingATP(int rankingATP);
    int getRankingATP();
}
