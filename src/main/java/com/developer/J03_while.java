package com.developer;

public class J03_while {

    public static void whileEst(){
        // Se ejecuta siempre y cuando la condicion sea true.

        //int numero = 0;
/*
        while(numero < 5){
            System.out.println(numero);
            numero ++;
        }
*/
 /*       int num = 4;
        while(num > 0){
            System.out.println(num);
            num --;
        }
*/
        // Control flujo dentro del loop
        // break
/*
        int num2 = 0;
        while(num2 < 10){
            if (num2 == 6){
                break;
            }
            System.out.println(num2);
            num2 ++;
        }*/

        // continue
        int num3 = 0;
        while(num3 < 10){

            if (num3 == 6){
                continue;
            }
            System.out.println(num3);
            num3 ++;
        }
    }
}
