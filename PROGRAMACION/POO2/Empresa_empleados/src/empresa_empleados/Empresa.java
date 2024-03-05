/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_empleados;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Empresa extends Empleado {

    private final String NOMEMPRESA;
    private final String CIF;
    private int telefoempresa;
    private String direcion_empresa;
    private ArrayList<Empleado> empleados = new <Empleado>ArrayList();

    public Empresa(String NOMEMPRESA, String CIF, int telefoempresa, String direcion_empresa, String NOMBRE, String DNI, int sueldobruto, int edad, int telefono, String direccion) {
        super(NOMBRE, DNI, sueldobruto, edad, telefono, direccion);
        this.NOMEMPRESA = NOMEMPRESA;
        this.CIF = CIF;
        this.telefoempresa = telefoempresa;
        this.direcion_empresa = direcion_empresa;
    }

    public Empresa(String NOMEMPRESA, String CIF, String NOMBRE, String DNI, int sueldobruto, int edad, int telefono, String direccion) {
        super(NOMBRE, DNI, sueldobruto, edad, telefono, direccion);
        this.NOMEMPRESA = NOMEMPRESA;
        this.CIF = CIF;
    }

    public void addEmpleado(Empleado e1) {
        this.empleados.add(e1);

    }

    public void eliminaEmpleado(Empleado e1) {
        this.empleados.remove(e1);
    }
    @Override
    public void mostrar(){
        super.mostrar();
    
    }
}
