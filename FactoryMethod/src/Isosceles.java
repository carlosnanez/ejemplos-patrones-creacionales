/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Isosceles extends Triangulo {
    
    public Isosceles(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }
       

    @Override
    public String getDescripcion() {
        return "soy un trinagulo isosceles";    }
    
}
