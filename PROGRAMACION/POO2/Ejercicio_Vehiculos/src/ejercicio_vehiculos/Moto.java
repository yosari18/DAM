/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Moto extends Terrestre {
    private String color;

    public Moto(String matricula, String modelo,String color, int num_ruedas) {
        super(matricula, modelo,num_ruedas );
        this.color = color;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Color :"+this.color);
    }
    
    
}
