/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author chris
 */

public class ComponentesRojos implements Componentes
{
    public ComponentesRojos() {
    }
    // -------------------------------
     public Boton getBoton() {
        return new BotonRojo();
    }
    // -----------------------
     public Lista getLista() {
        return new ListaRoja();
    }
}