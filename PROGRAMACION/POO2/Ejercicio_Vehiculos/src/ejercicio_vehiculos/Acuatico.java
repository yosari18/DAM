/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Acuatico extends Vehiculos {

    private int eslora_long;

    public Acuatico( String matricula, String modelo,int eslora_long) {
        super(matricula, modelo);
        this.eslora_long = eslora_long;
    }

    @Override
    public void imprimir() {
         String matri = "[a-zA-Z]{3,10}";
        if (this.getMatricula().matches(matri)) {
            System.out.println("Matricula :" + this.getMatricula());
        } else {
            System.out.println("Matricula :    0");
        }
        System.out.println("Modelo  :" + this.getModelo());
        System.out.println("Longitud   :" + this.eslora_long);

    }

}
