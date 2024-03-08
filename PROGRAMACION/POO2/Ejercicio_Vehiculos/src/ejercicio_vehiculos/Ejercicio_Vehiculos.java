/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_vehiculos;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Ejercicio_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Terrestre t1 = new Terrestre("1234frj", "terrestre", 3);
        Aereo a1 = new Aereo("thgf987654", "aereo", 6);
        Acuatico ac1 = new Acuatico("hdhwgw", "acuatico", 622);

        Moto m1 = new Moto("7897juh", "moto1", "rojo", 3);
        Coche c1 = new Coche("yukrt2", "coche", 3, true);

        Barco b1 = new Barco("hdhwgw5", "barco", 645, true);
        Submarino S1 = new Submarino("hdhwgw5", "submarino", 645, 45);

        Avion aa1 = new Avion("hdhwgw5", "avioncito", 64, 45);
        Helicoptero H1 = new Helicoptero("hdhwgw5", "helicptero", 64, 4);

        ArrayList<Vehiculos> lista = new ArrayList<Vehiculos>();

        lista.add(t1);
        lista.add(a1);
        lista.add(ac1);

        lista.add(m1);
        lista.add(c1);

        lista.add(b1);
        lista.add(S1);

        lista.add(aa1);
        lista.add(H1);

        //con errores 
        Moto me = new Moto("hty18h2", "motoError", "azul", 2);
        Barco be = new Barco("123", "barcoError", 6565, true);
        Avion ae = new Avion("g5f42ed5", "avionError", 644, 45);
        
        lista.add(me);
        lista.add(be);
        lista.add(ae);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimir();
            System.out.println("");

        }

    }

}
