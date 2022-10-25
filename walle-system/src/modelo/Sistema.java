package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	// list <TIPO> Nombre (sistema, catalago, pelicula) = new ArrayList<TIPO>();
	List<Turno> calendario = new ArrayList<Turno>();

	public Sistema() {
		// constructor vacio, por que tiene CERO ARGUMENTOS.
	}

	public List<Turno> getCalendario() {
		return calendario;
	}

	public void setCalendario(List<Turno> calendario) {
		this.calendario = calendario;
	}
	
	
	public boolean agregarTurno(Turno turno) throws Exception {
		int id_turno=1;
		
		for (int i=0; i < calendario.size(); i++){
			if (calendario.get(i).getFecha().equals(turno.getFecha()) && (calendario.get(i).getHora().equals(turno.getHora()))) {
				throw new Exception("El turno ya fue tomado!");
			}
			
			if (calendario.size() > 0) {
				id_turno = calendario.get(calendario.size()-1).getId_turno();
				
			}
			
		}
		
		return calendario.add(turno);
	}
	
	
 	public List<Turno> traerTurnoPorDia(LocalDate fecha) {

		List<Turno> listadoPorFecha = new ArrayList<Turno>();

		for (int i = 0; i < calendario.size(); i++) {
			if (calendario.get(i).getFecha().equals(fecha)) {
				listadoPorFecha.add(calendario.get(i));
			}
		}

		return listadoPorFecha;

	} 

	

	@Override
	public String toString() {
		return "Sistema [calendario=" + calendario + "]";
	}
	
	

}
