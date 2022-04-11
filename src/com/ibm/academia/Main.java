package com.ibm.academia;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Leonel", "Sosa", "12345678", "Calle 55", 10000.0, 1, 5500.0);
        System.out.println(gerente);
        System.out.println("--------------------------------- Aumento de sueldo ---------------------------------");
        gerente.aumentarSueldo(10.0);
        System.out.println(gerente);
    }
    
}
