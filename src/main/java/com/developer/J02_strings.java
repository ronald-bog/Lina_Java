package com.developer;

public class J02_strings {
    public static String nombre = "PLANETA";

    public static String[] J02Strings(){
        // Metodo length
        int lengthMet = nombre.length();

        // charAt
        char charMet = nombre.charAt(1);

        // substring
        String substrMet = nombre.substring(2, 5);

        // indexOf
        int indexMet = nombre.indexOf("n");

        // toUpperCase tolowerCase
        String upperMet = nombre.toUpperCase();
        String lowerMet = nombre.toLowerCase();

        // replace
        String replaceMet = nombre.replace('E','I');

        // trim
        String cargo = "  Admini  strador";
        String trimMet = cargo.trim();

        // Split: Devuelve un array

        String perfil = "Estandar Nuevo";
        String[] splitMet = cargo.split(" ");

        return splitMet;
    }

    public static String strFormat(){
        // Concatenacion
        String nombre = "Sofia";
        int edad = 30;
        //String mensaje = "Hola " + nombre + " como estas, tu edad es " + edad + " anios";

        // String.format()
        String mensaje = String.format("Hola %s como estas, tu edad es %d anios.", nombre, edad);

        // se debe usar especificadores
        // %s: para strings
        // %d: entero
        // %f: flotante
        // %c: char
        // %b: bool
        // %n: separador de linea

        // formatted
        String mensaje2 = "Hola %s como estas,%ntu edad es %d anios.".formatted(nombre, edad);

        // Text Blocks (Java 13+ )
        String nombre2 = "Sofia";
        int edad2 = 30;

        String bloque = """
                Hola %s como estas,
                tu edad es %d anios.
                """.formatted(nombre, edad);

        return bloque;
    }


}
