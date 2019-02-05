Intencion: 

proveer un mecaniosmo para limitar el numero de instancias de una clase. por lo tanto el mismo objeto es simepre compartido por distiantas partes del codigo

![b8gza89](https://user-images.githubusercontent.com/42417217/52250273-0f304200-28c5-11e9-8e73-70a106ac3ccb.png)

Singleton: define una instancia para que los clientes puedan accederla. Esta instancia es accedida mediante un metodo de clase.

Ejemplo python: 

class SoyUnico():

    __instance = None
    nombre = None

    def __str__(self):
        return self.nombre

    def __new__(cls):
        if SoyUnico.__instance is None:
            SoyUnico.__instance = object.__new__(cls)
        return SoyUnico.__instance

ricardo = SoyUnico()
ricardo.nombre = "Ricardo Moya"
print(ricardo)
ramon = SoyUnico()
ramon.nombre = "Ramón Invarato"
print(ramon)

print(ricardo)
print(ramon)
chris = SoyUnico()
chris.nombre = "Christian Ramirez"

print (ricardo)
print (ramon)
