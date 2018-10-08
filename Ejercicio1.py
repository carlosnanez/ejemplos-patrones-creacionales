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