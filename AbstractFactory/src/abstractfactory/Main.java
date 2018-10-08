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
public class Main
{
    public static void main(String[] args)
    {
        // Se insertarán los componentes con el borde azul
         Cliente cliente = new Cliente( new ComponentesAzules() );
        System.out.println("----------------------------");
        // Ahora se insertarán los componentes con el borde rojo
         cliente = new Cliente( new ComponentesRojos() );
    }
}