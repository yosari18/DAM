/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_mascotas;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Inventario {

    private ArrayList<Mascotas> mascotas = new <Mascotas>ArrayList();

    public void insertarMascota(Mascotas mascot) {
        this.mascotas.add(mascot);
    }

    public void eliminarMascota(int index) {
        System.out.println("se elimino a " + this.mascotas.remove(index).getNombre());
    }

    public void vaciarLista() {
        this.mascotas.clear();
        this.mostrarLista();
    }

    public void mostrarLista() {
        if (this.mascotas.isEmpty()) {
            for (int i = 0; i < this.mascotas.size(); i++) {
                System.out.println((1 + i) + ")" + this.mascotas.get(i).getNombre());
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public void mostrarMascota(int index) {
        this.mascotas.get(index).mostrar();
    }

    public void mostrarTodo() {
        for (int i = 0; i < this.mascotas.size(); i++) {
            System.out.println("////" + this.mascotas.get(i).getClass().getSimpleName() + "////");
            this.mascotas.get(i).mostrar();
            System.out.println("");
        }
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

}
