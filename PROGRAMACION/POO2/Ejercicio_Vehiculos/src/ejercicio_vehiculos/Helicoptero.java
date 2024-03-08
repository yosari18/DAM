/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Helicoptero extends Aereo {

    private int cantidadHelices;

    public Helicoptero(String matricula, String modelo, int cantidadAsiento0, int cantidadHelices) {
        super(matricula, modelo, cantidadAsiento0);
        this.cantidadHelices = cantidadHelices;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de helices :" + this.cantidadHelices);
    }

}
