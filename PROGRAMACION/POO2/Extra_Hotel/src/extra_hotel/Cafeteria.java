/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Cafeteria extends Comida {

    private String pedido;
    private ArrayList<Comida> variedades = new <Comida>ArrayList();

    public Cafeteria(String nombre, int Estrella, String pedido) {
        super(nombre, Estrella);
        this.pedido = pedido;
    }
    public void agregarComida(Comida variedad){
    variedades.add(variedad);
    }

}
