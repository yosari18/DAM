/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_banc;

/**
 *
 * @author yosari
 */
public class CompteEstalvi extends CompteBancari{

    public CompteEstalvi(String IBAN, double saldo) {
        super(IBAN, saldo);
    }
    @Override
     public void mostrarDades() {
         System.out.println("IBAN  : "+this.getIBAN()+"  Saldo : "+this.getSaldo());
       
    }

    
}
