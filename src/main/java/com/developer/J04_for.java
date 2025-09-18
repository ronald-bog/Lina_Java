package com.developer;

public class J04_for {

    public static void forEst(){
/*
        for (int x = 0; x < 5; x++){
            System.out.println(x);
        }
*/
        // loop for-each

        int[] pares = {10, 8, 20, 40, 6};

        for (int numero : pares){
            System.out.println(numero);
        }

        for (int numero = 0; numero < pares.length; numero++){
            System.out.println(pares[numero]);
        }
    }
}
