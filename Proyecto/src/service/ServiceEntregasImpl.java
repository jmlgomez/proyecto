package service;

import java.util.List;

import dao.EntregasDAO;
import muestra.Entregas;
import muestra.Operadores;
import util.MySqlDAOFactory;

public class ServiceEntregasImpl implements ServiceEntregas {
	MySqlDAOFactory factoria;
	EntregasDAO en;

	public ServiceEntregasImpl() {
		factoria = new MySqlDAOFactory();
		en = factoria.getEntregasDAO();
	}

	@Override
	public void insertarEntrega(Entregas e) {
		en.insertarEntrega(e);
	}

	@Override
	public void borrarEntrega(Entregas e) {
		en.borrarEntrega(e);
	}

	@Override
	public void modificarEntrega(Entregas e) {
		en.modificarEntrega(e);
	}

	@Override
	public Entregas detalleEntrega(int identrega) {
		return en.detalleEntrega(identrega);
	}

	@Override
	public List<Entregas> listarEntregas() {
		return en.listarEntregas();
	}

	@Override
	public void insertarOperador(Operadores o) {
		en.insertarOperador(o);
	}

	@Override
	public void modificarOperador(Operadores o) {
		en.modificarOperador(o);
	}

	@Override
	public void borrarOperador(Operadores o) {
		en.borrarOperador(o);
	}

	@Override
	public List<Operadores> listadoOperadores() {
		return en.listadoOperadores();
	}

	@Override
	public Operadores detalleOperadores(int idoperador) {
		return en.detalleOperadores(idoperador);
	}

}
