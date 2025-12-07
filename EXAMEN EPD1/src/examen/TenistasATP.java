package examen;

import java.util.*;

public class TenistasATP implements ITenistasATP {
    private final Collection<Tenista> tenistas;

    public TenistasATP() {
        tenistas = new TreeSet<>();
    }

    @Override
    public boolean tenistaNuevo(Tenista t) {
        return tenistas.add(t);
    }

    @Override
    public ArrayList<Tenista> tenistasTop(int ranking) {
        ArrayList<Tenista> tenistasTop = new ArrayList<>(ranking);
        Iterator<Tenista> it = tenistas.iterator();
        int current = 0;

        while (it.hasNext() && current < ranking) {
            tenistasTop.add(it.next());
            current++;
        }

        return tenistasTop;
    }

    @Override
    public ArrayList<Tenista> tenistasSenior() {
        ArrayList<Tenista> tenistasSenior = new ArrayList<>();

        for (Tenista t : tenistas) {
            if (t.getEdad() > 30) {
                tenistasSenior.add(t);
            }
        }

        tenistasSenior.sort((t1, t2) -> t2.getNumTitulos() - t1.getNumTitulos());

        return tenistasSenior;
    }

    public List<Tenista> getTenistas() {
        return tenistas.stream().toList();
    }
}
