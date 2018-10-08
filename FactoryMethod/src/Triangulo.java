/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public abstract class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;
    public Triangulo(int ladoA, int ladoB, int ladoC){
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }
    
    public abstract String getDescripcion();
    
    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
   
    
    
}
