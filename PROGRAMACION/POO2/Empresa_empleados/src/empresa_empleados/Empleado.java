/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_empleados;

/**
 *
 * @author yosari
 */
public class Empleado {

    private final String NOMBRE;
    private final String DNI;
    private int sueldobruto;
    private int edad;
    private int telefono;
    private String direccion;

    public Empleado(String NOMBRE, String DNI, int sueldobruto, int edad, int telefono, String direccion) {
        this.NOMBRE = NOMBRE;
        this.DNI = DNI;
        this.sueldobruto = sueldobruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    

    public void mostrar() {
        System.out.println("Nombre        :" + this.NOMBRE);
        System.out.println("DNI           :" + this.DNI);
        System.out.println("Sueldo bruto  :" + this.sueldobruto);
        System.out.println("Edad        :" + this.edad);

    }

    public double calulaSueldoneto() {
        int sueldoBrutoAnual;
        sueldoBrutoAnual = this.sueldobruto * 12;

        if (sueldoBrutoAnual < 12000) {
            return 0.20; 
        } else if (sueldoBrutoAnual < 25000) {
            return 0.30; 
        } else {
            return 0.40;
        }
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getDNI() {
        return DNI;
    }

    public int getSueldobruto() {
        return sueldobruto;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setSueldobruto(int sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}