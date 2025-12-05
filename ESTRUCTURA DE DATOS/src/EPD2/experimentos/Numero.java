/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPD2.experimentos;

public class Numero implements Comparable<Numero> {

    private int numero;

    public Numero() {
        this.numero = (int) Math.round(Math.random() * 100);
    }

    public int getNumero() {
        return numero;
    }

    public int compareTo(Numero n) {
        //Numero n =  (Numero) o;
        return n.getNumero() - this.getNumero();
        /*if (this.numero == n.numero) {
            return 0;
        } else if (this.numero < n.numero) {
            return 1;
        } else {
            return -1;
        }*/
    }

    public String toString() {
        return String.valueOf(numero);
    }
}
