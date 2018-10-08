/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public abstract class Forma implements Cloneable {

    private String id; 
    protected String tipo; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }     
    
    abstract void dibujar ();

    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }
        return clone;
    }

    
    
}
    
