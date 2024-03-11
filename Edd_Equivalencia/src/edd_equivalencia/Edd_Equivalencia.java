/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd_equivalencia;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Edd_Equivalencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese código de banco: ");
        String codigoBanco = scanner.nextLine();
        System.out.print("Ingrese código de sucursal: ");
        String codigoSucursal = scanner.nextLine();
        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese clave personal: ");
        String clavePersonal = scanner.nextLine();
        System.out.print("Ingrese orden (Talonario / Movimientos): ");
        String orden = scanner.nextLine();

        boolean error = false;

        if (!codigoBanco.isEmpty() && (codigoBanco.length() != 3 || codigoBanco.charAt(0) <= '1')) {
            System.out.println("Error: Código de banco incorrecto.");
            error = true;
        }

        if (codigoSucursal.length() != 4 || codigoSucursal.charAt(0) <= '0') {
            System.out.println("Error: Código de sucursal incorrecto.");
            error = true;
        }

        if (numeroCuenta.length() != 5) {
            System.out.println("Error: Número de cuenta incorrecto.");
            error = true;
        }

        if (clavePersonal.length() != 5) {
            System.out.println("Error: Clave personal incorrecta.");
            error = true;
        }

        if (!orden.isEmpty() && !orden.equals("Talonario") && !orden.equals("Movimientos")) {
            System.out.println("Error: Orden incorrecta.");
            error = true;
        }

        // Procesar la orden
        if (!error) {
            if (orden.equals("Talonario")) {
                System.out.println("Recibiendo talonario de cheques.");
            } else if (orden.equals("Movimientos")) {
                System.out.println("Recibiendo movimientos del mes en curso.");
            } else {
                System.out.println("Recibiendo talonario de cheques y movimientos del mes en curso.");
            }
        }

        scanner.close();
    }
}
