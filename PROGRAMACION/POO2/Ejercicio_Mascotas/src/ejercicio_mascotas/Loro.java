/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

/**
 *
 * @author yosari
 */
public class Loro extends Aves {

    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fecha_nacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fecha_nacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
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
        this.hablar();
    }

    @Override
    public void hablar() {
        if (this.habla) {
            System.out.println("Habla : hola");
        } else {
            System.out.println("Habla :no");
        }

    }

}
