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

public class Cliente
{
     public Cliente( Componentes style )
    {
        Boton boton = style.getBoton();
        boton.dibujar();
        Lista lista = style.getLista();
        lista.dibujar();
    }
}