package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import modelo.Cliente;
import modelo.Sistema;
import modelo.Turno;
import modelo.Medico;

public class Clinica {

	public static void main(String[] args) {
		
		Sistema sistemaMedico = new Sistema();

		Cliente cliente1 = new Cliente(001, "Walter", "Gazzanego", "32.830.433" );
		Cliente cliente2 = new Cliente(002, "Marcos", "Amaro", "26.830.433" );
		Cliente cliente3 = new Cliente(003, "Nahuel", "Flowers", "15.233.235" );
		
		
/*
 * 		System.out.println("Listado de PACIENTES: ");
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3); 
 */
		
		
		Medico medico1 = new Medico(100, "Nick", "Riviera", "clinico");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM YYYY");
		LocalDate diaTurno1 = LocalDate.of(2019, 03, 01); //01-03-2019
		LocalDate diaTurnote = LocalDate.of(2020, 03, 01); //01-03-2019
		LocalTime horaTurno1 = LocalTime.of(5, 30, 45, 35); //05:30:45:35
		LocalTime horaTurno2 = LocalTime.of(6, 00, 45, 35); //05:30:45:35
		
		Turno turno1 = new Turno(100, diaTurno1, horaTurno1, medico1, cliente1);
		Turno turno2 = new Turno(101, diaTurno1, horaTurno2, medico1, cliente2);
		
	

		try {
			System.out.println("El turno fue agregado: " + sistemaMedico.agregarTurno(turno1));
			System.out.println("El turno fue agregado: " + sistemaMedico.agregarTurno(turno2));
			System.out.println("El turno fue agregado: " + sistemaMedico.agregarTurno(turno1));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		
		
		System.out.println("Listado pacientes fecha: " + dtf.format(diaTurno1));
		
		try {
			
			sistemaMedico.mostrarListaPorFecha(diaTurno1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		
		System.out.println();
		
		
		
		
		//System.out.println("Listado de TURNOS: ");
		
		
		
		
		
		
		
	}

}
