package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

	@Override
	public String toString() {
		return "Turno [id_turno=" + id_turno + ", fecha=" + fecha + ", hora=" + hora + ", id_medico=" + id_medico
				+ ", id_cliente=" + id_cliente + "]";
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
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM YYYY");
	
	DateTimeFormatter dtfs = DateTimeFormatter.ofPattern("HH:mm");

	
	public String mostrarInformacion() {
		return "Turno = " + id_turno + ", fecha = " + dtf.format(fecha) + ", hora = " + dtfs.format(hora) + ", Medico = " + id_medico.getApellido()
				+ ", Paciente = " + id_cliente.getApellido() ;
	}
	

	// fecha.getDayOfMonth()+"-"+fecha.getMonth()+"-"+fecha.getYear() +
	// hora.getHour()+":"+hora.getMinute()
	
	

}
