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
public class Nau extends Tripulant {

    private String nombreNave;
    private String matricula;
    private double altitudVuelo;
    private final double ALTITUDMAXIMA;
    private ArrayList<Tripulant> tripu = new <Tripulant>ArrayList();

    public Nau(String nombreTripulante, int identificador, String perfilTripulante, String nombreNave, String matricula, double ALTITUDMAXIMA) {
        super(nombreTripulante, identificador, perfilTripulante);
        this.nombreNave = nombreNave;
        this.matricula = matricula;
        this.ALTITUDMAXIMA = ALTITUDMAXIMA;
        this.altitudVuelo = 0;
    }

    public void atrerrizaNave() {
        if (this.altitudVuelo > 0) {
            this.altitudVuelo = 0;
            System.out.println("Se aterrizo correctamente :"+this.altitudVuelo);
        }else{
            System.out.println("Esta volando ");
        
        }

    }

    public void elevarNave(double ACTaltura) {
        if (ACTaltura > this.ALTITUDMAXIMA) {
            System.out.println("No podemos superar a la altura maxima ");
        } else {
            this.altitudVuelo = ACTaltura;
            System.out.println("Elevamos la nave " + this.altitudVuelo + " metros");
        }
    }

    public void addTripulantes(Tripulant tripul) {
        this.tripu.add(tripul);
    }

    public void eliminarPasajeros() {
        for (int i = 0; i < this.tripu.size(); i++) {
            if (this.getPerfilTripulante() != "Copiloto" && this.getPerfilTripulante() != "Piloto") {
                this.tripu.remove(i);

            }
        }

    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Nave                    :" + this.nombreNave);
        System.out.println("Tipo                   :" + this.getClass().getSimpleName());
        System.out.println("Matricula               :" + this.matricula);
        System.out.println("Altitud maxima          :" + this.ALTITUDMAXIMA);
        System.out.println("Numero de tripulantes :" + this.tripu.size());
        for (int i = 0; i < this.tripu.size(); i++) {
            System.out.println("Nº " + (i + 1) + "Tripulante " + this.tripu.get(i));
        }
    }

}
