/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

public class Persona implements IPersona {

    private int edad;

    public Persona(int edad) {
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return String.valueOf(edad);
    }
    public int compareTo(IPersona p1){
        return this.getEdad() - p1.getEdad();
    }
}
