package dao;

import java.util.List;

import muestra.Estados;
import muestra.Histestados;
import muestra.Marcas;
import muestra.Terminales;
import muestra.Tiposdispositivos;
import muestra.Tipostarifas;
import muestra.Tipostarjetas;

public interface TerminalesDAO {
	public void insertarTerminal (Terminales t);
	public void borrarTerminal(Terminales t);
	public void modificarTerminal(Terminales t);
	public Terminales detalleTerminales ( int idterminal);
	public List<Terminales> listarTerminales();
	
	//Manejo TABLA TIPOS_MARCAS
	public void insertarMarca (Marcas m);
	public void modificarMarca (Marcas m);
	public void borrarMarca (Marcas m);
	public List< Marcas> listadoMarcas();
	public Marcas detalleMarca (int idmarca);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TABLA_TIPOS_DISPOSITIVOS
	public void insertarTiposDispositivos(Tiposdispositivos td);
	public void modificarTipoDispositivos (Tipostarifas td);
	public void borrarTiposDispositivos(Tiposdispositivos td);
	public List< Tipostarjetas> listadoTipodispositivos();
	public Tipostarjetas detalletipodispositivo (int idttipodispositivo);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TABLA ESTADOS
	public void insertarEstados (Estados e);
	public void modificarEstados  (Estados e);
	public void borrarEstados (Estados e);
	public List<Estados> listadoEstados ();
	public Estados detalleEstados  (int idestado);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//MANEJOO TABLA_HIST_ESTADOS
	public void insertarHistEstados (Histestados he);
	public void modificarHistEstados  (Histestados he);
	public void borrarHistEstados (Histestados he);
	public List<Histestados> listadoHistEstados ();
	public Histestados detalleHistEstados  (int idhistestado);
	

}
