/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Barco extends Acuatico {
    private boolean tiene_motor;

    public Barco( String matricula, String modelo, int eslora_long,boolean tiene_motor) {
        super( matricula, modelo,eslora_long);
        this.tiene_motor = tiene_motor;
    }

    
    public void imprimir (){
        super.imprimir();
        System.out.println("Tiene motor :"+this.tiene_motor);
    }

    public boolean isTiene_motor() {
        return tiene_motor;
    }

    public void setTiene_motor(boolean tiene_motor) {
        this.tiene_motor = tiene_motor;
    }
    

    
    
}
