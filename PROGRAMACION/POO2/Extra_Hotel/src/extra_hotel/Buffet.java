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
public class Buffet extends Comida {

    private String tipo;
    private ArrayList<Comida> variedades;
    private final String vegano = "Vegano";
    private final String carnivoro = "Carnivoro";
    private final String vegetariano = "Vegetariano";

    public Buffet(String nombreHotel, int estrella, String tipo, ArrayList<Comida> variedades) {
        super(nombreHotel, estrella, "Buffet");

        if (tipo.equals(this.carnivoro) || tipo.equals(this.vegano) || tipo.equals(this.vegetariano)) {
            this.tipo = tipo;
        } else {
            this.tipo = "EQUIVOCADO";
        }
        this.variedades = variedades;
    }

    @Override
    public void imprimir() {
        System.out.println("/////SERVICIO   " + this.getClass().getSimpleName() + "//////");
        System.out.println("Nombre Hotel    : " + this.getNombreHotel());
        System.out.println("Tipo            : " + this.tipo);
        System.out.print("Estrellas       : ");
        for (int i = 0; i < this.getEstrella(); i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (Comida comida : variedades) {
            System.out.println("Nombre comida:" + comida.getnombre());
        }
        System.out.println("");
    }

    @Override
    public boolean esVegano() {
        if (this.tipo .equals(this.vegano)) {
            return true;
        } else {
            return false;
        }

    }

   

}
