/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo2;

/**
 *
 * @author yosari
 */
public class Tripulant {

    private String nombreTripulante;
    private int identificador;
    private String perfilTripulante;

    public Tripulant(String nombreTripulante, int identificador, String perfilTripulante) {
        this.nombreTripulante = nombreTripulante;
        if (this.identificador < 0) {
            this.identificador = 0;
            System.out.println("Su identificador es 0 asignamos por defecto " + this.identificador);
        } else {
            this.identificador = identificador;
        }
        if (perfilTripulante.equals("Piloto") || perfilTripulante.equals("Copiloto")) {
            this.perfilTripulante = perfilTripulante;

        } else {

            this.perfilTripulante = "Pasajero";
        }

    }

    public void mostrar() {
        System.out.println("Tripulante : " + this.nombreTripulante + " \nNº Identificador :" + this.identificador + " \nPerfil :" + this.perfilTripulante);
    }

    public String getNombreTripulante() {
        return nombreTripulante;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getPerfilTripulante() {
        return perfilTripulante;
    }

    public void setNombreTripulante(String nombreTripulante) {
        this.nombreTripulante = nombreTripulante;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setPerfilTripulante(String perfilTripulante) {
        this.perfilTripulante = perfilTripulante;
    }

}
