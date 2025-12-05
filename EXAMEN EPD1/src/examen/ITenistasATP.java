package examen;

import java.util.ArrayList;
import java.util.Collection;

public interface ITenistasATP {
    /**
     * Check for dupes
     */
    boolean tenistaNuevo(Tenista t);

    ArrayList<Tenista> tenistasTop(int ranking);

    /**
     * edad > 30, ordenados por titulos acumulados
     */
    ArrayList<Tenista> tenistasSenior();
}
