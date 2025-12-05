package EPD1.ejercicios.EJ1;

import poo.io.IO;

import java.util.ArrayList;
import java.util.Collection;

public class GrupoAlumnos implements IGrupoAlumnos {
    private Collection<IAlumno> alumnos;

    public GrupoAlumnos() {
        alumnos = new ArrayList<IAlumno>();
    }

    public static IGrupoAlumnos obtenerGrupoPrueba() {
        IGrupoAlumnos grupo = new GrupoAlumnos();

        System.out.println("Introduce el nombre del alumnos");
        int amount = (int) IO.readNumber();

        for (int i = 0; i < amount; i++) {
            grupo.add(new Alumno("Nombre" + i, "Apellido" + i, "DNI" + i));
        }

        return grupo;
    }

    @Override
    public Collection<IAlumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public void imprimir() {
        for (IAlumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    @Override
    public boolean add(IAlumno alumno) {
        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
            return true;
        }
        return false;
    }
}
