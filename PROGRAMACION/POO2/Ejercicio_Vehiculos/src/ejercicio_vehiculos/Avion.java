/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Avion extends Aereo{
    private int tiempoMaxVolar;

    public Avion(String matricula, String modelo, int cantidadAsiento0,int tiempoMaxVolar ) {
        super( matricula, modelo,cantidadAsiento0);
        this.tiempoMaxVolar = tiempoMaxVolar;
    }

   

   
    public void imprimir (){
        super.imprimir();
        System.out.println("Tiempo maximobde vuelo :"+this.tiempoMaxVolar);
    }

    
    
}
