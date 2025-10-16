package com.developer.paquete1;

import com.developer.J05_metodos;

public class Clase2 {

    public static void main(String[] args) {
        System.out.println(Clase1.getPrivado());
        Clase1.setPrivado("Cobol");
        System.out.print(Clase1.getPrivado());
    }

    public static void metodo2(){
        Clase1.nombre = "Lina3";
        Clase1.protegido = "C#";
        Clase1.porDefecto = "Angular";
        // Clase1.privado no accesible Private




    }
}
