package com.developer;

import com.developer.paquete1.Clase1;

import java.util.Arrays;

// github: Linchipa
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Amarillo", 2026, "Porsche", "911");
        Carro carro2 = new Carro("Rojo", 2000, "Chevrolet", "Onix");
        Carro carro3 = new Carro("Azul", 2000, "Chevrolet", "Onix");

        System.out.println(carro1.getColor());
        System.out.println(carro2.getColor());
        System.out.println(carro3.getColor());

        carro1.setColor("Gris");

        System.out.println(carro1.getColor());

        System.out.println(carro3.encender());

    }
}

/*

class – clases
constructors – constructores
instance variables – variables de instancia
non-static methods – métodos no estáticos
object – objeto
encapsulation – encapsulación
overloading – sobrecarga
this reference – referencia this
static variables – variables estáticas
arrays
arrays as instance variables –
parallel arrays –
inheritance – herencia
orphism – polimorfismo
Object class
overriding the equals method – sobre escritura del metodo equals

*/
