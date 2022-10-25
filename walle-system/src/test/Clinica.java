package test;

import java.time.LocalDate;
import java.time.LocalTime;

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
		
		LocalDate diaTurno1 = LocalDate.of(2019, 03, 01); //01-03-2019
		LocalTime horaTurno1 = LocalTime.of(5, 30, 45, 35); //05:30:45:35
		
		Turno turno1 = new Turno(100, diaTurno1, horaTurno1, medico1.getApellido(), cliente1.getApellido());
		
	

		try {
			sistemaMedico.agregarTurno(turno1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		
		
		
		
	}

}
