/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p18;

import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int a, b;
        //Proceso
        a = pedir ("primer");
        b = pedir ("segundo");
        mostrar (a,b);
    }
    public static int pedir (String a){
        int b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el "+a+" numero");
        b = teclado.nextInt();
        return b;
    }
    public static void mostrar (int a,int b){
        for (int c = 2; c <= (b*a); c++){
            //Se prueban los numeros para determinar su minimo comun
            if (a % c == 0 && b % c == 0){
                System.out.println("el minimo comun denominador de "+a+" y "+b+" es "+c);
                System.exit(0);
            }
        }
        System.out.println("el minimo comun denominador de "+a+" y "+b+" es "+a*b);
    }
}
