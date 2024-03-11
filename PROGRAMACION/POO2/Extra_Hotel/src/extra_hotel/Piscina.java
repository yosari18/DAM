/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

/**
 *
 * @author yosari
 */
public class Piscina extends Hotel {

    private final int anchoN = 5;
    private final int largoN = 10;
    private final int anchoA = 15;
    private final int largoA = 30;
    private int profundidad;

    public Piscina( String nombre, int Estrella,int profundidad) {
        super(nombre, Estrella);
        this.profundidad = profundidad;
    }

    

    @Override
    public void imprimir() {
        System.out.println("Nombre hotel : "+this.getNombre());
        System.out.println("Estrella   : "+this.getEstrella());
    }

    public int getAnchoN() {
        return anchoN;
    }

    public int getLargoN() {
        return largoN;
    }

    public int getAnchoA() {
        return anchoA;
    }

    public int getLargoA() {
        return largoA;
    }

    public int getProfundidad() {
        return profundidad;
    }

}
