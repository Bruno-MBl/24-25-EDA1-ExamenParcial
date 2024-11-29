# Pregunta 3: referencias y constructores
#### a)  ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.
Hay dos objetos persona diferentes en memoria.
El objeto manuel es el primero que se crea, luego se crea otro objeto distinto copia.
El objeto copia es distinto de manuel ya que el constructor de persona que recibe personas crea nuevas personas.
El constructor recibe una persona y crea una persona nueva usando sus dos atributos para asignarlos a los atributos de la nueva persona que se está creando.
Luego la variable referencia guarda una referencia a la variable manuel por lo que no se crea una nueva persona.
referencia solo guarda dónde está manuel asi que si editas referencia realmente estarías editando manuel.

#### b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?
Si cambiamos manuel, el primer y el último elemento de la lista se verán afectados por el cambio, en memoria solo existe un mismo elemento común para estas dos variables y las dos apuntan al mismo sitio en memoria, si en cambio cambiase copia se verá afectado solo ese elemento ya es una persona distinta.

[codigo](/src/Pregunta3a.java)

#### Implementación A
Si en vez de la implementación B, se usase la implementación A:
Habría 5 objetos persona, manuel/referencia, copia y las tres personas que se crean con las inserciones a la lista.
Si haces un manuel.setNombre("Manuel Antonio") cambiarán las variables manuel y referencia pero ningún elemento de la lista ya que se crea una persona nueva por cada inserción
