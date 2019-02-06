patron que crea diferentes familias de ojetos. el objetivo principal con este patron es soportar multiples estandares que vienen definidos por las jerarquias de herencia de objetos. esta orientado a combinar productos.

![abstract factory](https://user-images.githubusercontent.com/42417217/52003577-eb1ecc00-2492-11e9-92dc-62adc38f2814.png)

AbstractFactory: declara una interfaz para la creacion de objetos de productos abstractos.

ConcreteFactory: implementa las operaciones para la creacion de objetos de productos concretos.

ConcretProduct: define un objeto de producto que la correspondiente factoria concreta se encargaria de crear, a la vez implementa la interfaz producto abstracto.

Client: utiliza solamente las interfaces declaradas en la factoria y en los productos abstractos.


Ejemplo: https://github.com/Chrisgrm/ejemplos-patrones-creacionales/blob/master/AbstractFactory/src/abstractfactory/Main.java
