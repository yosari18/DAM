/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra_hotel;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Extra_Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servicio servicio = new Servicio();

        ArrayList<Comida> variedades = new ArrayList<>();
        variedades.add(new ComidaBuffet("carne asada"));
        variedades.add(new ComidaBuffet("pollo frito"));
        variedades.add(new ComidaBuffet("ceviche"));

        servicio.addComida(new Buffet("Hotel Atlantis", 8, "Vegano", variedades));
        servicio.addComida(new Buffet("Hotel lola", 5, "carne", variedades));
        servicio.addComida(new Cafeteria("Hotel lola", 3, "empanada", "nos", 12));

        servicio.mostrarComidas();
        System.out.println("-".repeat(65));
        servicio.removeComida(variedades);
        System.out.println("-".repeat(65));
        servicio.mostrarComidas();
        
        servicio.addpiscina(new Piscina("La casa andina ",5,20,60,6));
         servicio.mostrar_Piscina();
        

    }
}
