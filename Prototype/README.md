Intencion: 

permite crear objetos prediseñados sin conocer detalles de como crearlos. Esto lo logra especificando los prototipos de objetos a crear. lso nuevos objetos que se crearan de los prototipos, en realidad, son clonados. Vale decir, tiene como finalidad crear nuevos objetos duplicandolos, clonando una instancia creada previamente

![600px-protipoestructura](https://user-images.githubusercontent.com/42417217/52250088-2ae71880-28c4-11e9-9ea4-2ba5b02264fb.png)

Prototipo. declar la interface del onejto que se clona. suele ser una clase abstracta. 

PrototipoConcreto: las clases en este papel implementan una operacion por medio de la clonacion de si mismo.

Cliente: crea nuevos objetos pidiendo al prototipo que se clone.


Ejemplo: https://github.com/Chrisgrm/ejemplos-patrones-creacionales/blob/master/Prototype/src/Main.java
