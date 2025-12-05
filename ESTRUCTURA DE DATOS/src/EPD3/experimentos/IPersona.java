/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD3.experimentos;

/**
 *
 * @author EPS
 */
public interface IPersona extends Comparable<IPersona> {

    String getDni();

    int getEdad();

    String getNombre();

    public String toString();

}
