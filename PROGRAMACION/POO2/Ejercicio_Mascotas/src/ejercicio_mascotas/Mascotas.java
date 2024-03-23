/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

/**
 *
 * @author yosari
 */
public abstract class Mascotas {

    private String nombre;
    private int edad;
    private String estado;
    private String fecha_nacimiento;

    public Mascotas(String nombre, int edad, String estado, String fecha_nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    

    public abstract void mostrar();

    public abstract void hablar();

    public void aniversario() {
        this.edad=this.edad+1;

    }

    public void morir() {
        this.estado=" muerto";
        System.out.println(this.estado);

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
}
