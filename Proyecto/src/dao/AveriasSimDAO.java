package dao;

import java.util.List;

import muestra.Averiassim;


public interface AveriasSimDAO {
	
	public void insertarAveriasSim (Averiassim as);
	public void borrarAveriasSim (Averiassim as);
	public void modificarAveriaSim(Averiassim as);
	public Averiassim detalleAveriasSim ( int idaveriasim);
	public List<Averiassim> listarAveriassim();
		
}
