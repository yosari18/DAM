/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

/**
 *
 * @author yosari
 */
public class Perro extends Mascotas {

    private String Raza;
    private boolean tienePulga;

    public Perro(String nombre, int edad, String estado, String fecha_nacimiento, String Raza, boolean tienePulga) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.Raza = Raza;
        this.tienePulga = tienePulga;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre :" + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Estado:" + this.getEstado());
        System.out.println("Nacimiento:" + this.getFecha_nacimiento());
        System.out.println("Raza :" + this.Raza);
        System.out.print("Tiene pulga");
        if (this.tienePulga) {
            System.out.print(": si");
        } else {
            System.out.print(": no");
        }
        System.out.println("");
        this.hablar();
       
    }

    @Override
    public void hablar() {
        System.out.println("Habla :wau wau");
    }

}
