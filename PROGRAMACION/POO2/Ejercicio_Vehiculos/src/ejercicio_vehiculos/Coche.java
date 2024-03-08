/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public class Coche extends Terrestre{
    private boolean tieneAireAcon;

    public Coche(String matricula, String modelo,int num_ruedas,boolean tieneAireAcon  ) {
        super(matricula, modelo,num_ruedas);
        this.tieneAireAcon = tieneAireAcon;
    }

    
    public void imprimir(){
        super.imprimir();
        System.out.println("Tiene aire acondicionado :"+this.tieneAireAcon);
    }
    
}
