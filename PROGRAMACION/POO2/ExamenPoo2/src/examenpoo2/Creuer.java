/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo2;

/**
 *
 * @author yosari
 */
public class Creuer extends Nau {
    private int pesomaximo;

    public Creuer(String nombreTripulante, int identificador, String perfilTripulante, String nombreNave, String matricula, double ALTITUDMAXIMA,int pesomaximo) {
        super(nombreTripulante, identificador, perfilTripulante, nombreNave, matricula, ALTITUDMAXIMA);
        this.pesomaximo = pesomaximo;
    }
    public void mostrar(){
    super.mostrar();
        System.out.println("Peso maximo :"+this.pesomaximo);
    }
    
}
