/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

/**
 *
 * @author yosari
 */
public class Gato extends Mascotas {

    private String color;
    private boolean tienePeloLargo;

    public Gato(String nombre, int edad, String estado, String fecha_nacimiento, String color, boolean tienePeloLargo) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.color = color;
        this.tienePeloLargo = tienePeloLargo;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre :" + this.getNombre());
        System.out.println("Edad :" + this.getEdad());
        System.out.println("Estado :" + this.getEstado());
        System.out.println("Nacimiento:" + this.getFecha_nacimiento());
        System.out.println("Color :" + this.color);
        if (this.tienePeloLargo) {
            System.out.println("Tiene pelo largo : si");
        } else {
            System.out.println("Tiene pelo largo: no");
        }

    }

    @Override
    public void hablar() {
        System.out.println("Habla  : miau miau");
       }

}
