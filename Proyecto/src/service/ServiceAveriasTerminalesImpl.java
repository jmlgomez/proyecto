package service;

import java.util.List;

import dao.AveriasTerminalesDAO;
import muestra.Averiasterminales;
import util.MySqlDAOFactory;

public class ServiceAveriasTerminalesImpl implements ServiceAveriasTerminales {
	MySqlDAOFactory factoria;
	AveriasTerminalesDAO av;
	
	public ServiceAveriasTerminalesImpl(){
		factoria= new MySqlDAOFactory();
		av= factoria.getAveriasTerminalesDAO();
	}
	
	@Override
	public void insertarAveriaTerminal(Averiasterminales at) {
		av.insertarAveriaTerminal(at);
		
	}

	@Override
	public void borrarAveriaTerminal(Averiasterminales at) {
		av.borrarAveriaTerminal(at);
		
	}

	@Override
	public void modificarAveriaTerminal(Averiasterminales at) {
		av.modificarAveriaTerminal(at);
		
	}

	@Override
	public Averiasterminales detalleAveriasterminal(int idaveriasterminal) {
		
		return av.detalleAveriasterminal(idaveriasterminal);
	}

	@Override
	public List<Averiasterminales> listarAveriaTerminal() {
		
		return av. listarAveriaTerminal();
	}
	
	

}
