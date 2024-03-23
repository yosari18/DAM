/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_mascotas;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Ejercicio_Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventario inv_mascot = new Inventario();

        inv_mascot.insertarMascota(new Perro("boby", 2, "Jugando", "12/03/23", "Lobo", false));
        inv_mascot.insertarMascota(new Perro("Noni", 2, "Durmiendo", "12/05/21", "Lobo", true));
        inv_mascot.insertarMascota(new Gato("Manchas", 1, "jugando", "11/01/12", "blanco y negro", false));
        inv_mascot.insertarMascota(new Canario("Poly", 3, "comiendo", "09/11/14", "Corto", true, "amarillo", true));
        inv_mascot.insertarMascota(new Loro("Pareto", 3, "Jugando", "12/07/11", "Largo", false, "Perú", true));

        inv_mascot.mostrarLista();
        System.out.println("-".repeat(25));
        inv_mascot.mostrarMascota(2);
        System.out.println("-".repeat(25));
        inv_mascot.mostrarTodo();
        System.out.println("-".repeat(25));

        int index = 2;
        ArrayList<Mascotas> mascot = inv_mascot.getMascotas();//usamos metodos particulares de la clase abstract Mascotas
        System.out.println("Datos de " + mascot.get(index).getNombre());
        mascot.get(index).hablar();
        System.out.print("Estado:");
        mascot.get(index).morir();
        
        System.out.println("-".repeat(25));
        inv_mascot.eliminarMascota(2);
        System.out.println("-".repeat(25));
        inv_mascot.mostrarLista();
        System.out.println("-".repeat(25));
        inv_mascot.vaciarLista();

    }

}
