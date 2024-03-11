/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

/**
 *
 * @author yosari
 */
public abstract class Hotel {

    private final String nombre;
    private int Estrella;

    public Hotel(String nombre, int Estrella) {
        this.nombre = nombre;
        this.Estrella = Estrella;
    }
    

    public abstract void imprimir() ;

    public String getNombre() {
        return nombre;
    }

    public int getEstrella() {
        return Estrella;
    }

    

}
