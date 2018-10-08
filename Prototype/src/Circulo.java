/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Circulo extends Forma{
    
    public Circulo (){
        tipo = "circulo";
    }

    @Override
    void dibujar() {
        System.out.println("dentro del metodo circulo::: dibujar()");
    }
    
}
