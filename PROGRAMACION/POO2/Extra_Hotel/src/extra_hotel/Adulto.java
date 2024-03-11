/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

/**
 *
 * @author yosari
 */
public class Adulto extends Piscina {

    private String nombreAdul;
    private int edadAdul;
    private String DNI;

    public Adulto(String nombre, int Estrella, int profundidad, String nombreAdul, int edadAdul, String DNI) {
        super(nombre, Estrella, profundidad);
        this.nombreAdul = nombreAdul;
        if (this.edadAdul >= 18) {
            this.edadAdul = edadAdul;
        } else {
            System.out.println("Debe ser mayor de edad;");
        }

        if (this.DNI.matches("\\d{8}[a-zA-Z]")) {
            this.DNI = DNI;
        } else {
            System.out.println("DNI incorrecto");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre adulto :" + this.nombreAdul);
        System.out.println("Edad adulto :" + this.edadAdul);
    }

}
