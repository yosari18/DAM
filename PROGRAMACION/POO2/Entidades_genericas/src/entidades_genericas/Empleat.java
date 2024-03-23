/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_genericas;

/**
 *
 * @author yosari
 */
public class Empleat<T> {

    private T sou;

    public Empleat(T sou) {
        this.sou = sou;
    }

    public void imprimir() {
        System.out.println("El sueldo del empleado es : " + this.sou);
    }

   

}
