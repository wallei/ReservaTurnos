package modelo;

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
	
	
	
	/* 
	 * 	public boolean agregarPelicula(String pelicula) throws Exception {
		int id = 1;

		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getPelicula().equals(pelicula))
				throw new Exception("La pelicula ya existe!");
		}

		if (catalogo.size() > 0)
			id = catalogo.get(catalogo.size() - 1).getIdPelicula() + 1;

		return catalogo.add(new Pelicula(id, pelicula));
	}
	 */
	
	public boolean agregarTurno(Turno turno) {
		int id=1;
		
		for (int i=0; i < calendario.size(); i++){
			if (calendario.get(i).getFecha().equals(turno.getFecha()) && (calendario.get(i).getHora().equals(turno.getHora()))) {
				
			}
			
		}
		
		
	}
	
	

}
