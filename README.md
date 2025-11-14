# Project Java Componentes Vehiculares

Este proyecto implementa un conjunto de clases en Java que representan los componentes principales de un vehiculo. El objetivo es aplicar principios de programacion orientada a objetos como encapsulacion, modularidad y reutilizacion.

## Clases implementadas

El sistema esta compuesto por las siguientes clases:

- **Vehiculo**: informacion general como placa, marca y modelo.
- **Motor**: tipo de motor, cilindrada y potencia.
- **Transmision**: tipo de transmision, numero de marchas y traccion.
- **Chasis**: tipo de chasis, dimensiones y peso.
- **Neumatico**: marca, tamano y presion.
- **SistemaElectrico**: bateria, luces y sensores.
- **SistemaFrenos**: tipo de frenos, discos, ABS y estado.
- **RegistroVehicular**: datos del registro legal del vehiculo.
- **Mantenimiento**: historial de mantenimientos realizados.
- **Sensor**: representa un sensor individual del vehiculo.

## Relaciones entre clases

- La clase **Vehiculo** puede contener objetos como Motor, Transmision, Chasis, Neumaticos, SistemaElectrico y SistemaFrenos.
- La clase RegistroVehicular se asocia a un Vehiculo.
- La clase Mantenimiento puede almacenar un historial ligado al Vehiculo.
- Los sensores hacen parte del sistema electrico.

## Ejecucion del programa

Para probar el funcionamiento del proyecto se crea un archivo `Main.java` donde se instancian las clases y se muestran sus valores por consola.

Ejemplo de creacion de un vehiculo:

```java
Vehiculo v = new Vehiculo("ABC123", "Toyota", "Corolla", 2020);
System.out.println("Vehiculo creado: " + v.getMarca() + " " + v.getModelo());
