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
public class Cafeteria extends Comida {

    private String bolleria;
    private int precioBebidas;
    private final int descuento = 5;

    public Cafeteria( String nombreHotel, int estrella, String nombre,String bolleria, int precioBebidas) {
        super(nombreHotel, estrella, nombre);
        this.bolleria = bolleria;
        this.precioBebidas = precioBebidas;
    }

    private double descuentoAplicar() {
        if (this.precioBebidas < 10) {
            return 0;
        } else {
            return (double) (this.precioBebidas * (this.descuento / 100.0));
        }
    }

    
    public void imprimir() {
        System.out.println("");
        System.out.println("////SERVICIO "+this.getClass().getSimpleName()+"////");
        System.out.println("Nombre hotel :"+this.getNombreHotel());
        System.out.print("Estrellas     : ");
        for (int i = 0; i < this.getEstrella(); i++) {
            System.out.print("* ");
        }
        System.out.println("");
        System.out.println("Nombre :"+this.getnombre());
        System.out.println("Bolleria :" + this.bolleria);
        System.out.println("Bebida :" + this.precioBebidas);
        System.out.printf("Descuento en bebida : %.2f\n" , this.descuentoAplicar());
        System.out.println("");
    }

   

    
   
}
