/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

/**
 *
 * @author yosari
 */
public class Comida extends Hotel {

    private String nombre;

    public Comida(String nombreHotel, int estrella, String nombre) {
        super(nombreHotel, estrella);
        this.nombre = nombre;

    }

    public String getnombre() {
        return nombre;
    }

    boolean esVegano() {
        return false;
    }

    @Override
    public void imprimir() {
    }

}
