package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
	private int id_turno;
	private LocalDate fecha;
	private LocalTime hora;
	private Medico id_medico;
	private Cliente id_cliente;
	
	public Turno(int id_turno, LocalDate fecha, LocalTime hora, Medico id_medico, Cliente id_cliente) {
		this.id_turno = id_turno;
		this.fecha = fecha;
		this.hora = hora;
		this.id_medico = id_medico;
		this.id_cliente = id_cliente;
	}

	public int getId_turno() {
		return id_turno;
	}

	public void setId_turno(int id_turno) {
		this.id_turno = id_turno;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Medico getId_medico() {
		return id_medico;
	}

	public void setId_medico(Medico id_medico) {
		this.id_medico = id_medico;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
	

}
