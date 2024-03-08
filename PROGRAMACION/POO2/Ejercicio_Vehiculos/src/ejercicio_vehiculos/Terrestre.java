/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Terrestre extends Vehiculos {

    private final int num_ruedas;

    public Terrestre( String matricula, String modelo,int num_ruedas) {
        super(matricula, modelo);
        this.num_ruedas = num_ruedas;
    }

    @Override
    public void imprimir() {
        String matri = "\\d{4}[a-zA-Z]{3}";
        if (this.getMatricula().matches(matri)) {
            System.out.println("Matricula:" + this.getMatricula());
        } else {
            System.out.println("Matricula:       0");
        }
        System.out.println("Modelo  :" + this.getModelo());
        System.out.println("Cantidad de ruedad : " + this.num_ruedas);
    }

}
