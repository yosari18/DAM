/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

/**
 *
 * @author yosari
 */
public class Canario extends Aves {

    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, String fecha_nacimiento, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fecha_nacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public void volar() {
        this.setVuela(true);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre :" + this.getNombre());
        System.out.println("Edad :" + this.getEdad());
        System.out.println("Estado :" + this.getEstado());
        System.out.println("Nacimiento:" + this.getFecha_nacimiento());
        System.out.println("Pico :" + this.getPico());
        System.out.println("Vuela:" + this.isVuela());
        System.out.println("Color :" + this.color);
        this.hablar();
    }

    @Override
    public void hablar() {
        if (this.canta) {
            System.out.println("Hablar  : pio");
        } else {
            System.out.println("Hablar  : no");
        }
    }

}
