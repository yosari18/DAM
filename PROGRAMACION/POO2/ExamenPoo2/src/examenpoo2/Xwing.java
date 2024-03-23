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
public class Xwing extends Nau {

    private String nombreRobot;
    private ArrayList armamento;

    public Xwing(String nombreTripulante, int identificador, String perfilTripulante, String nombreNave, String matricula, double ALTITUDMAXIMA, String nombreRobot, ArrayList armamento) {
        super(nombreTripulante, identificador, perfilTripulante, nombreNave, matricula, ALTITUDMAXIMA);
        this.nombreRobot = nombreRobot;
        this.armamento = armamento;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Robot :" + this.nombreRobot);
        for (int i = 0; i < this.armamento.size(); i++) {
            System.out.println("Nº armamento " + this.armamento.get(i));
        }
    }

    public void addTRIPU_c(ArrayList tripu) {
        tripu.add("Piloto");
        tripu.add("Copiloto");
    }
}
