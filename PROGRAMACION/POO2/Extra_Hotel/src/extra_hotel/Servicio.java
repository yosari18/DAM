/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra_hotel;

import java.util.ArrayList;
import java.util.Iterator;

/**A
 *
 * @author yosari
 */
public class Servicio {

    private ArrayList<Comida> comidas = new ArrayList<>();
    private ArrayList<Piscina> piscina = new ArrayList<>();

    public void addComida(Comida comida) {
        comidas.add(comida);
    }

    public void addpiscina(Piscina pis) {
        this.piscina.add(pis);
    }

    public void mostrar_Piscina() {
        for (int i = 0; i < this.piscina.size(); i++) {
            this.piscina.get(i).imprimir();
        }
    }

    public void removeComida(ArrayList<Comida> listaComidas) {
        Iterator<Comida> iterator = comidas.iterator();
        while (iterator.hasNext()) {
            Comida comida = iterator.next();
            if (comida.esVegano()) {
                iterator.remove();
                System.out.println("Se elimino correctamente El restaurante de la comida vegana.");
            }
        }

    }

    public void mostrarComidas() {
        for (Comida comida : this.comidas) {
            comida.imprimir();
        }
    }
}
