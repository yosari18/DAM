/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Aereo extends Vehiculos {

    private int cantidadAsiento0;

    public Aereo( String matricula, String modelo,int cantidadAsiento0) {
        super(matricula, modelo);
        this.cantidadAsiento0 = cantidadAsiento0;
    }

    @Override
    public void imprimir() {
        String matri = "[a-zA-Z]{4}\\d{6}";
        if (this.getMatricula().matches(matri)) {
            System.out.println("Matricula  " + this.getMatricula());
        } else {
            System.out.println("Matricula          0");
        }
        System.out.println("Modelo    " + this.getModelo());
        System.out.println("Cantidad de asientos  :" + this.cantidadAsiento0);

    }

    public int getCantidadAsiento0() {
        return cantidadAsiento0;
    }

    public void setCantidadAsiento0(int cantidadAsiento0) {
        this.cantidadAsiento0 = cantidadAsiento0;
    }

}
