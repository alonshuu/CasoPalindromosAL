# CASO PALINDROMOS
### Alonso lagos

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



