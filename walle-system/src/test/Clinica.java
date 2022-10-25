package test;

import modelo.Cliente;

public class Clinica {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(001, "Walter", "Gazzanego", "32.830.433" );
		Cliente cliente2 = new Cliente(002, "Marcos", "Amaro", "26.830.433" );
		Cliente cliente3 = new Cliente(003, "Nahuel", "Flowers", "15.233.235" );
		
		
		System.out.println("Listado de PACIENTES: ");
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		
		Medico medico1 = new Medico();
		
		

		
	}

}
