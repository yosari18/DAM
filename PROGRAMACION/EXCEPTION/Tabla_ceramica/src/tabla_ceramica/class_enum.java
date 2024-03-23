/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla_ceramica;

/**
 *
 * @author yosari
 */
enum class_enum {

    LUNAPLENA(770), PASIONEFIMERO(820), TARDORMEDITERRANIA(790), LLUVIATROPICAL(800);

    private class_enum(int peso) {
        this.peso = peso;
    }

    private int peso;

    public int getPeso() {
        return peso;
    }
    
    

}
