Intencion: 

Permite la creacion de un objeto complejo, a partir de una variedad de partes que contribuyen individualmente a la creacino y ensamblacion del objeto mencionado. por otro lado, centraliza el proceso de creacion en un unico punto, de tal forma que el mismo proceso de construccion pueda crear representaciones diferentes.

![builder](https://user-images.githubusercontent.com/42417217/52248002-3d5c5480-28ba-11e9-8e3c-683a035ab9fd.png)

Producto: representa el objeto complejo a construir. 

Builder: especifica una interface absatracta para la creacion de las partes del producto. declara las operaciones necesarias para crear las partes de un objeto concreto.

concretBuilder: implementa Builder y ensambla las partes que constituyen el objeto complejo.

Director: construye unn objeto usando la interfaz builder. Solo deberia ser necesario especificar su tipo y asi poder reutilizar el mismo proceso para distintos tipos.


Ejemplo: https://github.com/Chrisgrm/ejemplos-patrones-creacionales/blob/master/Pizzeria/src/principal/Principal.java


