/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrac_ejemplo;

/**
 *
 * @author yosari
 */
abstract class Principal {

    String nom;

    public void imprimirNom() {
        System.out.println("El nombre es : " + nom);
    }

    public abstract void imprimirClases();

}
