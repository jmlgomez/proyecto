package dao;

import java.util.List;
import muestra.Numeros;
import muestra.Tarjetas;
import muestra.Tipostarifas;
import muestra.Tipostarjetas;

//Manejo TABLA TARJETAS
public interface TarjetasDAO {
	public void insertarTarjeta (Tarjetas t);
	public void borrarTarjeta (Tarjetas t);
	public void modificarTarjeta (Tarjetas t);
	public Tarjetas detalleTarjeta ( int idtarjeta);
	public List<Tarjetas> listarTarjetas();
	
	//Manejo TABLA TIPOS_TARJETAS
	public void insertarTipoTarjeta ( Tipostarjetas tt);
	public void modificarTipoTarjeta (Tipostarjetas tt);
	public void borrarTipoTarjeta (Tipostarjetas tt);
	public List< Tipostarjetas> listadoTipoTarjeta();
	public Tipostarjetas detalleTipoTarjeta (int idttipotarjeta);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TABLA TIPOS_TARIFAS
	public void insertarTiposTarifas ( Tipostarifas ttar);
	public void modificarTipoTarifas (Tipostarifas ttar);
	public void borrarTipoTarifa (Tipostarifas ttar);
	public List< Tipostarifas> listadoTipoTarifa();
	public Tipostarifas detalletipotarifa (int idttipotarifa);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TABLA NUMEROS
	public void insertarnumeros (Numeros n);
	public void modificarnumeros (Numeros n);
	public void borrarnumeros (Numeros n);
	public List<Numeros> listadoNumeros();
	public Numeros detalleNumero (int idnumero);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	

}
