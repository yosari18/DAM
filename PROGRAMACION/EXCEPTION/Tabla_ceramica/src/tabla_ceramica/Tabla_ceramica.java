/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla_ceramica;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Tabla_ceramica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1) " + class_enum.LUNAPLENA);
        System.out.println("2) " + class_enum.LLUVIATROPICAL);
        System.out.println("3) " + class_enum.PASIONEFIMERO);
        System.out.println("4) " + class_enum.TARDORMEDITERRANIA);
        System.out.println("Elege  entre 1 y 4 :");
        int elige = entrada.nextInt();

        switch (elige) {
            case 1:
               // System.out.println(class_enum.LUNAPLENA+" con un peso de"+class_enum.LUNAPLENA.);

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                throw new AssertionError();
        }
    }

}
