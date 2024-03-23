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
public class Passatgers extends Creuer {

    private final int CANTIDADMAXIMA;

    public Passatgers(String nombreTripulante, int identificador, String perfilTripulante, String nombreNave, String matricula, double ALTITUDMAXIMA, int pesomaximo, int CANTIDADMAXIMA) {
        super(nombreTripulante, identificador, perfilTripulante, nombreNave, matricula, ALTITUDMAXIMA, pesomaximo);
        this.CANTIDADMAXIMA = CANTIDADMAXIMA;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Cantidad maxima :" + (this.CANTIDADMAXIMA - 2));//resto 2 por piloto y copiloto
    }

    public void addPasaSinPP(ArrayList tripu) {
        for (int i = 0; i < this.CANTIDADMAXIMA-2; i++) {
            tripu.add(i);
        }
        
    }

}
