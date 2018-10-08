/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Rectangulo extends Forma{

       public Rectangulo(){
           tipo = "rectangulo";
           
       }
    @Override
    void dibujar() {
        System.out.println("Dentro del metodo Recatngulo:::dibujar()");
    }
    
}
