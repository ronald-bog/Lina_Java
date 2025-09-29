package exercises;

public class exercises {
    /* Septiembre 12 / 2025

        1. Convertir un texto según la opción del usuario.
           Opciones:
            1 → Convertir a mayúsculas
            2 → Convertir a minúsculas
            3 → Capitalizar primera letra

            test case 1:  input: texto = jupiter, opcion = 2
            output: JUPITER

            test case 2:  input: texto = SISTEMA SOLAR, opcion = 1
            output: sistema solar

            test case 3:  input: texto = neptuno, opcion = 3
            output: Neptuno

            test case 4:  input: texto = urano, opcion = 4
            output: Opcion no valida


        2. Verificar si una palabra o frase es palindromo
           test case 1:  input: reconocer
                         output: Es palindromo

           test case 2:  input: saturno
                         output: No es palindromo

           test case 3:  input: anita lava la tina
                         output: Es palindromo

           test case 4:  input: hola mundo
                         output: No es palindromo

        */

/* Septiembre 19 / 2025

3. Crea un metodo que reciba un arreglo de enteros y realice impresion solo de los numeros pares que contiene el arreglo.

   test case 1:  input: numeros = {4, 1, 5, 6, 8, 10};
                 output:  Los numeros pares son:
                          4
                          6
                          8
                          10

   test case 2:  input: numeros = {153, 89, 44, 1001, 351, 5, 25463, 26, 580, 723};
                 output:  Los numeros pares son:
                          44
                          26
                          580


4. Desarrolla un método que reciba 3 argumentos y genere una salida por consola según los casos de prueba especificados.

Lógica del programa: El método tomará una cadena de texto (String) y generará una nueva cadena aplicando los siguientes criterios:

Búsqueda y selección: Se identificará una letra específica en la cadena original y se tomarán los caracteres inmediatamente posteriores a cada ocurrencia de dicha letra para formar el nuevo string.

Limitación de salida: La impresión del nuevo String mostrará únicamente la cantidad de caracteres especificada por el usuario como límite.

Manejo de casos especiales: El programa deberá gestionar situaciones donde:
- El límite sea superior a la longitud de la nueva cadena
- El límite sea un número negativo
- El usuario especifique 0 como límite

Ejemplo de funcionamiento:

Cadena original: "wwwwjoijmhsdjsk"
Letra a buscar: 'j'

Caracteres posteriores a 'j':
- Después de la primera 'j': 'o'
- Después de la segunda 'j': 'm'
- Después de la tercera 'j': 's'

Nueva cadena generada: "oms"

Casos de salida:
- Límite = 3 → "oms"
- Límite = 2 → "om"
- Límite = 1 → "o"
- Límite = 5 → Excede
- Límite = 0 → Cadena vacia
- Límite negativo → no permitido

Requisitos del método:
- Debe recibir 3 parámetros: la cadena original, la letra a buscar, y el límite de caracteres a mostrar
- Debe validar los casos especiales de límite
- Debe generar la salida por consola según las especificaciones


   test case 1:  inputs: cadena = "iouaqwiaarhawehraqpo", letra a buscar = 'a', limite = 4;
                 output:  La nueva cadena es: qarw

   test case 2:  inputs: cadena = "iouaqwiaarhawehraqpo", letra a buscar = 'a', limite = 0;
                 output:  La nueva cadena definiste que debe quedar vacia

   test case 3:  inputs: cadena = "iouaqwiaarhawehraqpo", letra a buscar = 'a', limite = -5;
                 output: El limite no puede ser negativo

   test case 4:  inputs: cadena = "iouaqwiaarhawehraqpo", letra a buscar = 'a', limite = 6;
                 output: El limite excede

   test case 5:  inputs: cadena = "yyytthbczmzopueuqwoeuqwzfgjldfjgor", letra a buscar = 'z', limite = 2;
                 output: La nueva cadena es: mo

   test case 6:  inputs: cadena = "lljkrsdrKLkjgbmcfrQPOhrnjgrdsrkQrWvFeLProNkn", letra a buscar = 'r', limite = 9;
                 output: El limite excede

   test case 7:  inputs: cadena = "lljkrsdrKLkjgbmcfrQPOhrnjgrdsrkQrWvFeLProNkn", letra a buscar = 'r', limite = 6;
                 output: La nueva cadena es: sKQndk

   test case 8:  inputs: cadena = "lljkrsdrKLkjgbmcfrQPOhrnjgrdsrkQrWvFeLProNkn", letra a buscar = 'r', limite = 1;
                 output: La nueva cadena es: s


**** Ejercicios Septiembre 29 / 2025  ****

5. Crea un método que permita calcular la suma de una lista de números (usando varargs), pero que solo devuelva la suma si la cantidad de números es mayor a 2. Si hay 2 o menos números, debe retornar -1 como señal de que la operación no es válida.

    Requisitos:
    - El método debe recibir al menos un número (parámetro posicional), y puede recibir más (varargs).
    - Debe retornar la suma solo si hay más de 2 números en total.
    - Si hay 2 o menos, debe retornar -1.
    - Crear una clase y dentro de ella el metodo, ejecutar desde el metodo main.
    - No es necesario utilizar scanner.

    test case 1: (7)
                 output:  -1

    test case 2:  inputs: (5, 10, 15)
                 output:  30

    test case 3:  inputs: (5, 10)
                 output: -1

    test case 4:  inputs: (1, 2, 3, 4, 5)
                 output: 15


6. Crea una clase 'GestorMensajes' con varios métodos sobrecargados 'enviarMensaje' que retornen un String con el mensaje formateado.

    - Implementa las 4 versiones del método enviarMensaje con diferentes parámetros.
    - Retorna el mensaje formateado según cada versión.
    - Observa cómo Java selecciona el método correcto según los argumentos pasados.
    - Ejecutar desde el metodo main.
    - No es necesario utilizar scanner.

    test case 1: ("Hola")
                 output:  Mensaje: Hola

    test case 2:  inputs: ("Ana", "Hola, ¿cómo estás?")
                 output:  30

    test case 3:  inputs: ("Luis", "Reunión", "No olvides la reunión de hoy.")
                 output: Para Luis - Asunto: Reunión - Mensaje: No olvides la reunión de hoy.

    test case 4:  inputs: ("Carlos", "Recordatorio importante", true, 3)
                 output: Carlos - Prioritario: true - Reintentos: 3 - Mensaje: Recordatorio importante


*/
}
