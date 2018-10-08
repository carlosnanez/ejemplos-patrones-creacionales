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
public class ComponentesAzules implements Componentes
{
    public ComponentesAzules() {
    }
    // -------------------------------
     public Boton getBoton() {
        return new BotonAzul();
    }
    // -------------------------------
     public Lista getLista() {
        return new ListaAzul();
    }
}