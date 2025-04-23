# CASO PALINDROMOS
### Alonso lagos

### ÍTEM 1 ###

**¿Qué es un palíndromo?** Un palíndromo consiste en una palabra o frase, que es igual al revés que su forma estandar.

**Código**:

 _function esPalindromo(cadena) {_ 

_let resultado = "";_

_resultado = cadena.split('').reverse().join('');_

_return cadena === resultado;_

_}_ 

1. Este codigo es una función booleana, nos devolverá un verdadero o falso dependiendo de si la String que le demos es igual a su versión en reverso.
2. Lo que hace es separar cada caracter por un espacio, luego los ordena al reves y los vuelve a unir.
3. Simplemente se usa entregandole un palíndromo a la función.

**EJEMPLO DE SU FUNCIONAMIENTO.**

Si colocamos la palabra **_nada_** primero utilizará la funcion para separar cada uno de los elementos de la string, en este caso n a d a, para luego reordenarlos de forma inversa _a n d a_   y unirlos, para finalizar verrifica si estos dos elementos son iguales, en este caso como no son nos devolverá un false. 


### ÍTEM 2 ###

Revisar el código creado en el proyecto.

### ÍTEM 3 ###

Las pruebas seleccionadas para este caso, es ir probando primero si el programa funciona con distintos tipos de inputs, en este caso es obvio que no, ya que el programa solo toma como entrada Strings, por lo tanto si se le ingresa un entero, el método tendria una excepción.

Ahora relacionado directamente con el funcionamiento del programa, el programa no tomará en cuenta correctamente cuando se trate con frases, ya sean con mayúsculas o con espacios.

Por lo tanto construyendo las primeras pruebas:

### ÍTEM 4 ###

- <ins> Caso de prueba 1 </ins>
Input : 200 (Número entero)

Output : El programa falla.

- <ins> Caso de prueba 2 </ins>

Input : "" (Cadena vacía)

Output : El programa lo reconoce como un true, un palíndromo.

- <ins> Caso de prueba 3 </ins>

Input : "aaabccbaaaa"

Output : El programa lo reconoce como palíndromo.

- <ins> Caso de prueba 4 </ins>

Input : "ahabccaaa"

Output : No es un palíndromo, el programa no lo reconoce como tal.

- <ins> Caso de prueba 5 </ins>

Input : "La tele letal"

Output : Por la mayúscula, el programa no lo reconoce como palíndromo. 


### ULTIMA ACTIVIDAD, ÚLTIMO COMMIT CON EL PROGRAMA MEJORADO ###




