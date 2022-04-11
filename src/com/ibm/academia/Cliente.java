package com.ibm.academia;

public class Cliente extends Persona{

    private Integer clienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, Integer clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCliente Id: " + clienteId;
    }
    
}
