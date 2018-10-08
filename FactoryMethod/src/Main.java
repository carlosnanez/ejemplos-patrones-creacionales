/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Main {
    
    public static void main(String[] args) {
        TrianguloFactoryMethod factory = new TrianguloFactory();
        Triangulo triangulo = factory.createTriangulo(10, 10, 10);
        System.out.println(triangulo.getDescripcion());
    }
}
