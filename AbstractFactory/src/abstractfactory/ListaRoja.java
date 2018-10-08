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
public class ListaRoja extends Lista
{
    public ListaRoja()
    {
        this.configurar();
    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Configurando la LISTA con borde ROJO");
    }
}