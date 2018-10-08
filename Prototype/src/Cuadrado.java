/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Cuadrado extends Forma {

    public Cuadrado() {
        tipo = "cuadrado";
    }
    @Override
    void dibujar() {
        System.out.println("dentro del metodo cuadrado:::dibujar()");
    }
    
}
