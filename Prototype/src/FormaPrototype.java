
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class FormaPrototype {
    private static Hashtable<String, Forma> formaMapa = new Hashtable<>();
    
    public static Forma getForma(String formaId){
        Forma cachedForma = formaMapa.get(formaId);
        return (Forma) cachedForma.clone();
    }
    
    public static void CargarCache(){
        Circulo circulo = new Circulo();
        circulo.setId("1");
        formaMapa.put(circulo.getId(), circulo);
        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setId("2");
        formaMapa.put(cuadrado.getId(), cuadrado);
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setId("3");
        formaMapa.put(rectangulo.getId(), rectangulo);
    }
    
}
