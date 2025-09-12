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


}
