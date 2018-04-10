package service;

import java.util.List;

import muestra.Averiassim;

public interface ServiceAveriasSim {
	public void insertarAveriasSim (Averiassim as);
	public void borrarAveriasSim (Averiassim as);
	public void modificarAveriaSim(Averiassim as);
	public Averiassim detalleAveriasSim ( int idaveriasim);
	public List<Averiassim> listarAveriassim();

}
