package com.developer.paquete1;

public class Clase1 {

    public static String nombre = "Lina";
    protected static String protegido = "Javascript";
    static String porDefecto = "Springboot";
    private static String privado = "Python";

    public static void metodo1(){
        nombre = "Lina2";
        protegido = "Java";
        porDefecto = "Angular";
        privado = "PHP";
    }

    public static String getPrivado(){
        return privado;
    }

    public static void setPrivado(String privado){
        Clase1.privado = privado;
    }
}