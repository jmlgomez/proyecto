package service;

import java.util.List;

import dao.AveriasSimDAO;
import muestra.Averiassim;
import util.MySqlDAOFactory;

public class ServiceAveriasSimImpl implements ServiceAveriasSim {
	MySqlDAOFactory factoria;
	AveriasSimDAO av;
	
	public ServiceAveriasSimImpl(){
		factoria= new MySqlDAOFactory();
		av= factoria.getAveriasSimDAO();
	}
	
	@Override
	public void insertarAveriasSim(Averiassim as) {
		av.insertarAveriasSim(as);
	}

	@Override
	public void borrarAveriasSim(Averiassim as) {
		av.borrarAveriasSim(as);
		
	}

	@Override
	public void modificarAveriaSim(Averiassim as) {
		av.modificarAveriaSim(as);
		
	}

	@Override
	public Averiassim detalleAveriasSim(int idaveriasim) {
		
		return av.detalleAveriasSim(idaveriasim);
	}

	@Override
	public List<Averiassim> listarAveriassim() {
		
		return av.listarAveriassim();
	}

}
