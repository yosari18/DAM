/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Submarino extends Acuatico {

    private int profun_max;

    public Submarino( String matricula, String modelo,int eslora_long,int profun_max) {
        super( matricula, modelo,eslora_long);
        this.profun_max = profun_max;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Profundidad maxima:" + this.profun_max);
    }

    public int getProfun_max() {
        return profun_max;
    }

    public void setProfun_max(int profun_max) {
        this.profun_max = profun_max;
    }

}
