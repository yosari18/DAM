/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author yosari
 */
public class Biblioteca_Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca bibli = new Biblioteca("bibi", "Gandia");
        Biblioteca bibli1 = new Biblioteca("lee", "Alicante");

        Usuario us = new Usuario("Carlos", "Gandia", 889);
        Usuario us2 = new Usuario("Rodrigo", "Tavernes", 881);

        Libro lib = new Libro("padre rico padre pobre", us, 267, "editorial 1");
        Libro lib1 = new Libro("Desarrolle lideres que estan al rededor de usted", us2, 367, "editorial 2");
        DVD dv1 = new DVD("Hombres G", us, 2, "video");
        DVD dv2 = new DVD("Melendi", us2, 1, "audio");
        DVD dv3 = new DVD("foné", null, 1, "audio");
        bibli1.addElementos(new Libro("Sabes mi nombre pero no mi historia", us, 167, "editorial 1"));
        bibli1.addElementos(new DVD("Morat", null, 1, "audio"));

        bibli.addElementos(lib);
        bibli.addElementos(lib1);
        bibli.addElementos(dv1);
        bibli.addElementos(dv2);
        bibli.addElementos(dv3);
        System.out.println("-".repeat(19));
        bibli.mostraTodo();
        lib.mostrar();
        System.out.println("-".repeat(19));
        bibli.mostraTodo();
        dv1.mostrar();
        System.out.println("-".repeat(19));

        bibli.mostrarDisponibles();
        System.out.println("-".repeat(19));
        bibli1.mostraTodo();
        System.out.println("-".repeat(19));
        bibli1.cambiarElemento(bibli, dv3);
        bibli1.mostraTodo();
        System.out.println("-".repeat(19));
        bibli.eliminarElemento(lib);
        bibli.mostraTodo();
        System.out.println("-".repeat(19));
        


    }
}
