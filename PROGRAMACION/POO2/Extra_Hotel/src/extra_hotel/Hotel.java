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
public abstract class Hotel {
private String nombreHotel;
    private int estrella;

    public Hotel(String nombreHotel, int estrella) {
        this.nombreHotel = nombreHotel;
        if(estrella>=1&&estrella<=5){
        this.estrella = estrella;
        }else{
           this.estrella=1;
        }
    }
    public abstract void imprimir();
    

    public String getNombreHotel() {
        return nombreHotel;
    }

    public int getEstrella() {
        return estrella;
    }
}