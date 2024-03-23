/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class DVD extends Elemento {

    private int duraccion;
    private String formato;
    private ArrayList<String> formatoValido = new ArrayList();

    public DVD(String titulo, Usuario usuarioPrestado, int duraccion, String formato) {
        super(titulo, usuarioPrestado);
        this.duraccion = duraccion;
        if (formato.equals("video") || formato.equals("audio")) {
            this.formato = formato;
        } else {
            System.out.println("Formato desconocido");
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Duraccion :" + this.duraccion);
        System.out.println("Formato :" + this.formato);

    }

}
