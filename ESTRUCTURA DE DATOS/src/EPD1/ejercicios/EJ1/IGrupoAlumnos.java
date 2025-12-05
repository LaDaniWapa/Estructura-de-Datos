package EPD1.ejercicios.EJ1;

import java.util.Collection;

public interface IGrupoAlumnos {
    Collection<IAlumno> getAlumnos();
    void imprimir();
    boolean add(IAlumno alumno);
}