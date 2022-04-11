package com.ibm.academia;

public class Empleado extends Persona {
    private Double remuneracion;
    private Integer empleadoId;
    
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, Integer empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarSueldo(Double porcentaje) {
        remuneracion = remuneracion + (remuneracion * porcentaje / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRemuneracion: " + remuneracion + "\nEmpleado Id: " + empleadoId;
    }
}
