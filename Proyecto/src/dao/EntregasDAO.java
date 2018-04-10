package dao;

import java.util.List;

import muestra.Entregas;
import muestra.Operadores;



public interface EntregasDAO {
	public void insertarEntrega (Entregas e);
	public void borrarEntrega (Entregas e);
	public void modificarEntrega (Entregas e);
	public Entregas detalleEntrega  ( int identrega);
	public List<Entregas> listarEntregas();
	
	//MANEJO TABLA OPERADORES

	public void insertarOperador ( Operadores o);
	public void modificarOperador (Operadores o);
	public void borrarOperador (Operadores o);
	public List< Operadores> listadoOperadores();
	public Operadores detalleOperadores (int idoperador);

}

