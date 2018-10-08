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
public class ListaAzul extends Lista
{
    public ListaAzul()
    {
        this.configurar();
    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Configurando la LISTA con borde AZUL");
    }
}