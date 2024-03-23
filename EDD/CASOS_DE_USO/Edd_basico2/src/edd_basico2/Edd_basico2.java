/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd_basico2;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Edd_basico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cantidad de producto :");
        int cantidad = entrada.nextInt();
        System.out.println("Precio del producto :");
        double precio = entrada.nextDouble();

        double importeTotal = cantidad * precio;
        if (cantidad > 1000) {
            double descuento = (10.0 / 100.0) * importeTotal;
            System.out.println("Descuento a aplicar " + descuento);
            System.out.println("Total a pagar " + (importeTotal - descuento));
        } else if (cantidad > 100) {
            double descuento2 = (5.0 / 100.0) * importeTotal;
            System.out.println("Descuento a aplicar " + descuento2);
            System.out.println("Total a pagar " + (importeTotal - descuento2));
        } else {
            System.out.println("Para la cantidad que ingreso no se aplicxa descuento");
        }

    }

}
