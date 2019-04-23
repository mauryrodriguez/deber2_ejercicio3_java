
package deber2_ejercicio3;

import java.util.Scanner;

public class Deber2_ejercicio3 {

    public static void main(String[] args) {
        int ventas = 0;
        float N;
        int a = 0;
        int b = 0;
        int c = 0;

        float sumaTotal = 0;
        float sumaA = 0;
        float sumaB = 0;
        float sumaC = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero de ventas que desea ingresar:");
        ventas = s.nextInt();

        System.out.println("\nIngreso de datos:\n");

        for (int i = 1; i <= ventas; i++) {

            System.out.println("Ingrese el valor de la venta ");
            N = s.nextFloat();
            sumaTotal = sumaTotal + N;

            if (N <= 1000) {

                if (N <= 500) {
                    a++;
                    sumaA = sumaA + N;

                } else if (N > 500 && N <= 1000) {
                    b++;
                    sumaB = sumaB + N;
                }

            } else {
                c++;
                sumaC = sumaC + N;
            }

        }
        /* Muestro los datos*/

        System.out.println("\n\tRESULTADOS\n");

        System.out.println("Numero de ventas totales = " + ventas);
        System.out.println("Monto de todas las ventas= " + sumaTotal + "$");

        System.out.println("\nventas menores o iguales a 500 = " + a);
        System.out.println("Monto de todas las ventas menores o iguales a 500= " + sumaA + "$");

        System.out.println("\nventas mayores a 500 y menores o iguales a 1000 = " + b);
        System.out.println("Monto de todas las ventas mayores a 500 y menores o iguales a 1000 = " + sumaB + "$");

        System.out.println("\nventas mayores a 1000 = " + c);
        System.out.println("Monto de todas las ventas mayores a 1000  = " + sumaC + "$");

  }
}

   
    

