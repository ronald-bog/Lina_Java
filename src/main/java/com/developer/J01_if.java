package com.developer;

public class J01_if {

    public static void ifest() {
        int edad = 10;
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // ? Operador ternario

        System.out.println(edad > 18 ? "Eres mayor de edad" : "Eres menor de edad");

        // switch

        int edad2 = 20;

        switch (edad2) {
            case 20:
                System.out.println("la edad es 20");
                break;
            case 31:
                System.out.println("la edad es 31");
                break;
        }

        String nombre = "Michael";

        switch (nombre) {
            case "Roger":
                System.out.println("El nombre es Roger");
                break;
            case "Lina":
                System.out.println("El nombre es Lina");
                break;
            default:
                System.out.println("Este es el block del default");
        }
    }
}

