package EPD1.ejercicios.EJ1;

public interface IAlumno {
    void setNombre(String nombre);
    void setApellidos(String apellidos);
    void setDNI(String DNI);

    String getNombre();
    String getApellidos();
    String getDNI();

    String toString();
}
