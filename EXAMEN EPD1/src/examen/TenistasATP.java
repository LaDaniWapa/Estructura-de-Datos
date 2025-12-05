package examen;

import java.util.*;

public class TenistasATP implements ITenistasATP{
    private final Collection<ITenista> tenistas;

    public TenistasATP() {
        tenistas = new TreeSet<ITenista>();
    }

    @Override
    public boolean tenistaNuevo(Tenista t) {
        return tenistas.add(t);
    }

    @Override
    public ArrayList<Tenista> tenistasTop(int ranking) {
        return null;
    }

    @Override
    public ArrayList<Tenista> tenistasSenior() {
        return null;
    }
}
