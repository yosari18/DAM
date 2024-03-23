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
public class Libro extends Elemento {

    private int isbn;
    private String editorial;
    private static ArrayList<Integer> isbnsUsados = new ArrayList<>();

    public Libro(String titulo, Usuario usuarioPrestado, int isbn, String editorial) {
        super(titulo, usuarioPrestado);
        if (!isbnsUsados.contains(isbn)) {
            this.isbn = isbn;
            isbnsUsados.add(isbn);
        } else {
            System.out.println("El ISBN ya esta en uso.");
        }
        this.editorial = editorial;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Editorial: " + this.editorial);
    }
}
