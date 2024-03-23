/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades_genericas;

/**
 *
 * @author yosari
 */
public class Entidades_genericas {

    enum Level {
        LOW,
        MEDIUM,
        HIGH,

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sou = 1000;
        Empleat empleado1 = new Empleat(sou);
        empleado1.imprimir();

        double sou2 = 1004;
        Empleat empleado2 = new Empleat(sou2);
        empleado2.imprimir();

        String sou3 = "Sin sueldo";
        Empleat empleado3 = new Empleat(sou3);
        empleado3.imprimir();

        fun(1, 4);
        // fun2("Funcion 3", 22.3, 377);

        System.out.println("Probando ENUM");
        Level myvar = Level.MEDIUM;
        System.out.println(myvar);
        
        
        System.out.println("Uso de switch");
        switch (myvar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void fun(int... a) {
        System.out.println("Nombre de argumento :" + a.length);
        for (int i : a) {
            System.out.println("");
            System.out.println(i + " ");

        }

    }

//    public static void fun2(String str, double dou, int... a) {
//        System.out.println("String :" + str);
//        System.out.println("Double :" + dou);
//        for(int a:){
//        System.out.println("Nombre de argumento :" + a.length);
//        }
//    }
}
