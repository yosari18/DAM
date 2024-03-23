/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo2;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Carrega extends Creuer {

    private int carga;

    public Carrega(String nombreTripulante, int identificador, String perfilTripulante, String nombreNave, String matricula, double ALTITUDMAXIMA, int pesomaximo, int carga) {
        super(nombreTripulante, identificador, perfilTripulante, nombreNave, matricula, ALTITUDMAXIMA, pesomaximo);
        this.carga = carga;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Carga :" + this.carga);

    }

    public void addTRIPU_c(ArrayList tripu) {
        tripu.add("Copiloto");
        tripu.add("Piloto");
        for (int i = 0; i < tripu.size(); i++) {
            if (tripu.get(i).equals("Pasajero")) {
                tripu.add("Pasajero");

            }

        }

    }

}
