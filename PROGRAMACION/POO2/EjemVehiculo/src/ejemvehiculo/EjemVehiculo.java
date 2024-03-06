/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemvehiculo;

/**
 *
 * @author yosari
 */
public class EjemVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vehiculo Llogat ");
        
        Cliente c1 =new Cliente("30435624X", "Juan ", "Perez");
        Vehiculo v1 =new Vehiculo("4050", "ABJ");
        
        System.out.println(c1.getDNI()+" "+c1.getNombre()+" "+c1.getApellido());
        System.out.println(v1.getMatricula()+" "+v1.getMarca());
        
        
    }
    
}
