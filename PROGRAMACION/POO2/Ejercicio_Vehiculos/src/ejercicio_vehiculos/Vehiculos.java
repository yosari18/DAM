/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_vehiculos;

/**
 *
 * @author yosari
 */
public abstract class Vehiculos {

    private final String matricula;
    private final String modelo;
  
    
    public Vehiculos(String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }
    public abstract void imprimir();

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    
    
}
