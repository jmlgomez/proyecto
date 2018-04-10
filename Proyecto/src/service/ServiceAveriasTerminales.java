package service;

import java.util.List;

import muestra.Averiasterminales;

public interface ServiceAveriasTerminales {
	public void insertarAveriaTerminal  (Averiasterminales at);
	public void borrarAveriaTerminal(Averiasterminales  at);
	public void modificarAveriaTerminal (Averiasterminales  at);
	public Averiasterminales detalleAveriasterminal   ( int idaveriasterminal);
	public List<Averiasterminales> listarAveriaTerminal ();


}
