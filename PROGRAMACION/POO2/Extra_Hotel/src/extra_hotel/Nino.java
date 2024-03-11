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
public class Nino extends Piscina {
    
    private String nomNino;
    private int edad;
  
    
    public Nino(String nomNino, int edad,String nombre, int Estrella, int profundidad) {
        super(nombre, Estrella, profundidad);
        this.nomNino = nomNino;
        if (this.edad <= 10 && this.edad >= 4) {
            this.edad = edad;
        } else {
            System.out.println("La edad no  cumple con lo indicado");
        }
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre Niño : " + this.nomNino);
        System.out.println("Edad      : " + this.edad);
    }
    
    public String getNomNino() {
        return nomNino;
    }
    
    public int getEdad() {
        return edad;
    }
    
}
