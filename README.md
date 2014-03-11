# Solución Ejercios Objetos Java

Ejercicio 1: Para ver la solución tan solo hay que correr la clase PruebaArboles.

Para que funcione se ha creado una clase Arbol con dos parametros un entero alturaArbol 
y un string tipoArbol donde se guardarán los valores pasados desde el main. Para esto 
se ha sobrecargado de metodos constructores en fución de los parametros que se pasen.
En este ejercicio lospropios constructores sacan por consola los mensajes requeridos.

Ejercicio 2: Para comprobar la solución tan solo hay que correr la clase PruebaFormas. 

En este ejercicio se ha generado la clase Forma que dispone de un string tipoForma y un 
metodo constructor que marca las formas como "genericas", además se añade un metodo queES()
que devuelve por consola el contenido del campo string tipoForma del objeto solicitado.
Para poder construir Cirulo y Cuadrado se han generado dos clases herederas que exienden
la clase Forma y en sus constructores llenaran el campo tipoForma de manera q contenga la 
forma especificada.
De esta manera se puede recorrer el array de Formas con el mismo metodo queEs()
