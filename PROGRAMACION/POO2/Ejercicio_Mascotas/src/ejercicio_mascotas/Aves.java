/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

/**
 *
 * @author yosari
 */
public abstract class Aves extends Mascotas{
    private String pico;
    private boolean vuela;

    public Aves(String nombre, int edad, String estado, String fecha_nacimiento,String pico, boolean vuela) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    public abstract void volar();

    public String getPico() {
        return pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    

   
    
}
