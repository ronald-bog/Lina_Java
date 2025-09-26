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

    // Metodos sobrecargados

    public static void saludar(String param1){
        System.out.printf("Hola %s como estas", param1);
    }

    public static void saludar(String param1, String param2){
        System.out.printf("Hello %s %s como estas", param1, param2);
    }

    public static void saludar(String param1, String param2, int edad){
        System.out.printf("Hola %s %s como estas, tu edad es %d.", param1, param2, edad);
    }

    // Retorno Condicionado

    public static String retornoCond(String clima){
        if (clima.equals("frio")){
            return "Esta haciendo friooooo";
        } else if (clima.equals("calor")){
            return "Esta haciendo Calorrrr";
        }
        return "No me dijiste un estado valido del clima";
    }

    // Retorno de multiples valores

    public static int[] devolverDosValores(){
        int a = 101;
        int b = 53;
        return new int[]{a, b};
    }

    public static Object[] devolverDosTipos(){
        int numero = 8;
        String luna = "Titan";
        return new Object[]{numero, luna};
    }

    // Parametros Genericos

    public static <T> void genericos(T numero){
        System.out.println(numero);
    }

    public static <L> L genericosRet(L element){
        return element;
    }

}
