# Defensa TP Final POO

Responder las siguientes preguntas a fin de justificar el desarrollo presentado.

1. **¿Cómo llegaste a la resolución del diseño de clases?**

- Determinar el dominio del problema.

> El problema es que el garaje no tiene un sistema de gestión para vehiculos (Motos y Coches) y necesitan uno con algunos requerimientos especificos.
>
> - Que se puedan cambiar ruedas de los vehiculos.
> - Fijar un precio y capacidad maxima de vehiculos adentro al abrir el garaje
> - Avisar si no hay mas lugar disponible en el garaje
> - Ingresos, Retiros, Numero total de vehiculos recibidos, Un presupuesto final para cambiar todas las ruedas de los vehiculos, y kilometraje de todos los vehiculos
> - Todo vehiculo deberá tener marca y numero de puertas (coches) o cilindrada(motos)

- Elegir los objetos potenciales.

> Garaje, Vehiculo, Moto, Coche, y una clase principal GarajeTest para testeos.

- **Validar los objetos potenciales.**

  - **Relevante al dominio del problema.**
    > Garaje, Vehiculo, Coche, Moto
  - **Existencia independiente.**
    > GarajeTest
  - **Atributos y operaciones.**

    > - **Garaje**
    >   - **Atributos encapsulados**
    >     - int cantTotal, cantCoches, cantMotos, kmMotos, kmCoches, capacidadVehiculoMax
    >     - double precioRueda
    >     - Vehiculo
    >   - **Operaciones**
    >     - ingresoVehiculo(Vehiculo vehiculo) // Ingreso de Vehiculos
    >     - retiroVehiculo(Vehiculo vehiculo) // Retiro de Vehiculos
    >     - precioCambioRueda() // Mostrar precio de cambio de rueda de todos los vehiculos
    >     - kmPromedio() // Mostrar promedio de kilmetros de los vehiculos
    >     - displayCantTotal() //Mostrar cantidad total de vehiculos recibidos
    > - **Vehiculo**
    >   - **Atributos encapsulados**
    >     - String marca, tipo
    >     - int km
    >   - **Operaciones:**
    >     - sobreescritura toString()
    >     - getTipo(), setTipo()
    > - **Coche**
    >   - **Atributos encapsulados**
    >     - int puertas
    >   - **Operaciones**
    >     - sobreescritura toString()
    > - **Moto**
    >   - **Atributos encapsulados**
    >     - String cilindrada
    >   - **Operaciones**
    >     - sobreescritura toString()

- **Agrupar los objetos en clases (jerarquización).**

> Coche y Moto heredan de Vehiculo
>
> - Vehiculo
>   - Coche
>   - Moto
> - Garaje
> - GarajeTest

2. **¿Qué pilares del paradigma de la POO incluiste en el diseño?**

> En este trabajo pudimos aplicar Encapsulacion, Herencia y Polimorfismo

3. **¿En dónde fue necesario aplicar la sobreescritura? Justificar la respuesta.**

> Fue necesario realizar la sobreescritura del toString() en las clases Moto, Coche, Vehiculo y Garaje para demostrar como queremos mostrar el objeto.

4. **¿Para qué se utilizan los constructores en las clases?**

> Cuando construimos un objeto es necesario tener un constructor, con este podemos inicializarlo y podriamos agregarle valores a sus variables

5. **¿Siempre hay que implementar la sobrecarga de métodos y/o constructores?**

> No es necesario, podriamos hacer diferentes implementaciones de metodos o contructores con distintos parametros con una diferente respuesta que se utilizan cuando se invocan.

6. **¿De qué manera vinculamos las clases? Justificarlo en el diseño.**

> En este caso vinculamos la clase Vehiculo con las clases Coche y Moto aplicando herencia. Siendo la Vehiculo, la clase base, y Coche y Moto las clases que heredan.

7. **Enumerar las reglas por convención aplicadas al proyecto.**

> - Realizamos nomenclatura de paquetes diferenciadas como "sistemaGaraje" y "vehiculos" para poder diferenciarlos mejor. Tanto Garaje como GarajeTest serian parte del "sistema" y Coche y Moto parte de "vehiculos".
> - Las Clases tienen que estar en mayúscula y minúscula con la primera letra de ada palabra interna en mayúscula
> - Las operaciones o metodos que utilizamos, se usan verbos que deben estar en mayúsculas y minúsculas con la primera letra de cada palabra internta (a partir de la segunda) en mayúscula (camelCase)
> - Los nombres de las variables deben ser cortos pero entendibles. Diseñados para que un observador casual pueda ver la intencion de su uso.
