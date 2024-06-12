# EmpresaAlquiler
Examen de Agregación-Composición más Herencia. 2 Intento.

Nuestro jefe de proyectos (Scrum Manager) nos pide que realicemos las clases necesarias
con sus atributos y métodos necesarios para representar el siguiente modelo:
En una empresa de alquiler de vehículos se quiere realizar un software para gestionar el
alquiler de coches, furgones y camiones sin conductor. Cualquier vehículo tiene su
matrícula, modelo, marca, kms recorridos, precio por día y tipo de motor (eléctrico, híbrido
enchufable, híbrido, gasolina o diesel). Los coches tendrán también los siguientes datos:
plazas máximas, puertas, volumen maletero y tipo (utilitario, berlina, monovolumen o suv).
Un furgón tendrá los datos carga máxima y plazas asientos. Para un camión tendremos su
carga máxima y longitud. Nuestro software también gestionará los clientes, que
proporcionarán nombre, apellidos, email, teléfono, dni y número de tarjeta de crédito.
Para reservar un coche se tendrá en cuenta el vehículo alquilado, la fecha de inicio del
alquiler, los días alquilados y el cliente que alquila. Cuando se devuelve un vehículo es
necesario actualizar los kms recorridos por el cliente (el precio por día a pagar será un 20%
mayor que lo normal si el cliente supera los 500km por día de alquiler).
Se utilizará una clase Empresa para almacenar todo el modelo, que será la que se
gestionará desde la clase Main (con método main por consola para in/out).
Nuestro prototipo deberá de permitir:
1. Dar de alta un vehículo. 2p
2. Dar de alta un cliente. 2p
3. Alquilar un vehículo para un cliente determinado. 10p
4. Mostrar una lista de vehículos que cumplan con los siguientes parámetros:
a. Coche: Con plazas mayor a N plazas, tipo de motor X. 4p
b. Furgón: de carga mayor a X Kgs y plazas mayor a N plazas. 4p
c. Camión: de carga mayor a X Kgs y longitud menor que M metros. 4p
5. Devolver un vehículo y mostrar precio a cobrar. 4p.
Implementa las clases necesarias y crea una clase Principal con método main y un menú de
texto para las distintas opciones.
Evaluación: Las clases tienen que compilar, y tienen que tener un diseño adecuado
usando mapas para la gestión de los clientes y listas para los vehículos (cómo base tendréis
al menos una lista de vehículos (arraylist) y un mapa de clientes (hashmap).

Ejercicio 2. EN PAPEL
Realiza un método public boolean addVehiculo(Vehiculo v) que dado un objeto v de tipo
Vehiculo lo añada a la lista de vehículo si no es null y su matrícula no está previamente en
la lista. Si todo va bien devolverá true, si no, false.
Evaluación: Establecida con anterioridad. Obligatorio para seguir corrigiendo.

TOTAL PUNTOS DEL EXAMEN: 30 puntos.
Requisitos: Tener el ejercicio de papel correcto y llegar a un 15 cómo mínimo. La nota se
corresponde con los puntos obtenidos en total entre 3. Si tenemos 30 puntos -> 10. Con un
15 -> 5.
