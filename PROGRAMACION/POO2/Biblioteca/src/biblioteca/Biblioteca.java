/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Biblioteca {

    private String nombre;
    private String ciudad;
    private ArrayList<Elemento> elementos = new ArrayList();

    public Biblioteca(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void addElementos(Elemento elem) {
        this.elementos.add(elem);
    }

    public void eliminarElemento(Elemento elem) {
        this.elementos.remove(elem);
    }

    public void eliminarElemento(int index) {
        this.elementos.remove(index);
    }

    public void cambiarElemento(Biblioteca nueva, Elemento elem) {
        this.eliminarElemento(elem);
        this.addElementos(elem);
    }

    public void mostraTodo() {
        System.out.println("Detalles " + this.elementos.get(0).getClass().getPackageName());
        System.out.println("Nombre de la biblioteca :" + this.nombre);
        System.out.println("Ciudad :" + this.ciudad);
        System.out.println("");
        for (int i = 0; i < this.elementos.size(); i++) {
            this.elementos.get(i).mostrar();
            System.out.println("");
        }
    }

    public void mostrarDisponibles() {
        System.out.println("Elementos disponibles en " + this.nombre + ":");
        for (Elemento elem : this.elementos) {
            if (elem.getUsuarioPrestado() == null) {
                elem.mostrar();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

}
