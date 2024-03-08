/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_banc;

/**
 *
 * @author yosari
 */
public class CompteBancari {

    private final String IBAN;
    private double saldo;
    private final double interesAnulBasico = 2.5;

    public CompteBancari(String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public void ingressar(double ingDinero) {
        this.modificarSaldo(ingDinero);
    }

    public void retirar(double reDinero) {
        this.modificarSaldo(-reDinero);
    }

    public void traspassar(CompteBancari otraCuenta, double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente " + cantidad);
        } else {
            this.modificarSaldo(-cantidad);
            otraCuenta.modificarSaldo(cantidad);
        }
    }

    private void modificarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public double calcularInteressos() {

        return 2;
    }

    public void mostrarDades() {
       
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteresAnulBasico() {
        return interesAnulBasico;
    }

}
