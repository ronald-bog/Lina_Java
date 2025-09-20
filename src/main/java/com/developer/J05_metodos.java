package com.developer;

public class J05_metodos {

    // metodos void

    public static void metodoVoid() {
        System.out.println("Hola mundo");
    }

    // metodos return

    public static String metodoRet() {
        String planeta = "Saturno";
        int edad = 22; // para retornar esta variable deberias cambiar el tipo de retorno en la cabecera del metodo
        return planeta;
    }

    // Parametros Posicionales

    public static int metodoParam(int num1, int num2, String pais) {
        System.out.println(pais);
        int operacion = num1 * num2;
        return operacion;
    }

    public static int sumar(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma = suma + num;
        }
        return suma;
    }

    // Parametros variables (varargs)

    public static int paramVar(int... nums) {
        int suma = 0;
        for (int num : nums) {
            suma = suma + num;
        }
        return suma;
    }
}
