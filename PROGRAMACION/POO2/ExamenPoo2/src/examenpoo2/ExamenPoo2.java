/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpoo2;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class ExamenPoo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList armas = new ArrayList();

        Tripulant tri = new Tripulant("yo ", 343, "Copiloto");
        Nau nave = new Nau("jorge", 123, "Piloto ", "navecita", "564", 100);
        Creuer crucero = new Creuer("jorge", 123, "Copiloto ", "navecita", "564", 100, 500);
        Carrega carga = new Carrega("jorge", 123, "Copiloto ", "navecita", "564", 100, 500, 300);
        Passatgers pasajeros = new Passatgers("jorge", 123, "Copiloto ", "navecita", "564", 100, 500, 9);
        Xwing x = new Xwing("jorge", 123, "Copiloto ", "navecita", "564", 100, "lalo", armas);

        tri.mostrar();
        System.out.println("-".repeat(20));

        crucero.mostrar();
        System.out.println("-".repeat(20));
        carga.mostrar();
        System.out.println("-".repeat(20));
        pasajeros.mostrar();
        System.out.println("-".repeat(20));
        nave.elevarNave(160);
        System.out.println("-".repeat(20));
       nave.elevarNave(7);
        

    }

}
