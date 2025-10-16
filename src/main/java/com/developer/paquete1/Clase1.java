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

//    public static String getPrivado(){
//        return privado;
//    }
//
//    public static void setPrivado(String privado){
//        Clase1.privado = privado;
//    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Clase1.nombre = nombre;
    }

    public static String getProtegido() {
        return protegido;
    }

    public static void setProtegido(String protegido) {
        Clase1.protegido = protegido;
    }

    public static String getPorDefecto() {
        return porDefecto;
    }

    public static void setPorDefecto(String porDefecto) {
        Clase1.porDefecto = porDefecto;
    }

    public static String getPrivado() {
        return privado;
    }

    public static void setPrivado(String privado) {
        Clase1.privado = privado;
    }
}