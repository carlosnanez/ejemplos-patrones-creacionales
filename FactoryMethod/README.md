Intención:

el patrón defactory method es un patrón de creación que utiliza factory methods para resolver el problema de crear objetos sin tener que especificar la clase exacta del objeto que se creará. Esto se hace creando objetos llamando a un factory method, ya sea especificado en una interfaz e implementado por clases secundarias, o implementado en una clase base y opcionalmente reemplazado por clases derivadas, en lugar de llamar a un constructor


![factory-method](https://user-images.githubusercontent.com/42417217/52172448-5986b700-273d-11e9-90eb-7d1b1a5b792f.gif)

Creator: declara el metodo de fabricacion, que devuleve un objeto de tipo product.

ConcreteCreator. redefine el metodo de fabricacion para devolver un producto. 

ConcretProduct: es el resultado final. El creador se apoya en sus subclases para definir el metodo de fabricacion que devuelve el objeto apropiado

Ejemplo_ https://github.com/Chrisgrm/ejemplos-patrones-creacionales/blob/master/FactoryMethod/src/Main.java
