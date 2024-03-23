/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author yosari
 */
public class Usuario {

    private String nombre;
    private String ciudad;
    private int NumUsuario;

    public Usuario(String nombre, String ciudad, int NumUsuario) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.NumUsuario = NumUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNumUsuario() {
        return NumUsuario;
    }

}
