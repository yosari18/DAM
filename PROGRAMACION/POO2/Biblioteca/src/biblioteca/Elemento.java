/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author yosari
 */
public class Elemento {

    private String titulo;
    private Usuario usuarioPrestado;

    public Elemento(String titulo, Usuario usuarioPrestado) {
        this.titulo = titulo;
        this.usuarioPrestado = usuarioPrestado;
    }

    public void prestar(Usuario usu) {
        if (this.usuarioPrestado == null) {
            this.usuarioPrestado = usu;
        } else {
            System.out.println("El elemento ya está prestado a otro usuario.");
        }
    }

    public void tornar() {
        this.usuarioPrestado = null;
    }

    public void mostrar() {
        System.out.println("Titulo :" + this.titulo);
        if (this.usuarioPrestado != null) {
            System.out.println("Prestado a:" + this.usuarioPrestado.getNombre());
        } else {
            System.out.println("Disponible");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getUsuarioPrestado() {
        return usuarioPrestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUsuarioPrestado(Usuario usuarioPrestado) {
        this.usuarioPrestado = usuarioPrestado;
    }

}
