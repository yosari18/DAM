/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Piscina extends Hotel {

    private final int ancho;
    private final int largo;
    private final int profundidad;

    public Piscina(String nombreHotel, int estrella, int ancho, int largo, int profundidad) {
        super(nombreHotel, estrella);
        this.ancho = ancho;
        this.largo = largo;
        this.profundidad = profundidad;
    }

    private int area() {
        return this.ancho * this.largo;
    }

    public void imprimir() {
        System.out.println("////////SERVICIO " + this.getClass().getSimpleName() + "///////////////");
        System.out.println("Nombre hotel       :" + this.getNombreHotel());
        System.out.print("Estrellas           :");
        for (int i = 0; i < this.getEstrella(); i++) {
            System.out.print("* ");
        }
        System.out.println("");
        System.out.println("Ancho              :" + this.ancho + "m");
        System.out.println("Largo              :" + this.largo + "m");
        System.out.println("Profundidas        :" + this.profundidad + "m");
        System.out.println("Area de la piscina :" + this.area());
    }

}
