package service;

import java.util.List;


import dao.TarjetasDAO;
import muestra.Numeros;
import muestra.Tarjetas;
import muestra.Tipostarifas;
import muestra.Tipostarjetas;
import util.MySqlDAOFactory;

public class ServiceTarjetasImpl implements ServiceTarjetas 
{
	
	MySqlDAOFactory factoria;
	 TarjetasDAO td;
	 

public ServiceTarjetasImpl() 
{
		   	factoria=new MySqlDAOFactory();
		  	 td=factoria.getTarjetasDAO();
}


@Override
public void insertarTarjeta(Tarjetas t) {
 td.borrarTarjeta(t);
	
}


@Override
public void borrarTarjeta(Tarjetas t) {
	td.borrarTarjeta(t);
	
}


@Override
public void modificarTarjeta(Tarjetas t) {
	td.modificarTarjeta(t);
	
}


@Override
public Tarjetas detalleTarjeta(int idtarjeta) {
	
	return td.detalleTarjeta(idtarjeta);
}


@Override
public List<Tarjetas> listarTarjetas() {
	
	return td.listarTarjetas();
}


@Override
public void insertarTipoTarjeta(Tipostarjetas tt) {
	td.insertarTipoTarjeta(tt);
	
}


@Override
public void modificarTipoTarjeta(Tipostarjetas tt) {
	td.modificarTipoTarjeta(tt);
	
}


@Override
public void borrarTipoTarjeta(Tipostarjetas tt) {
	td.borrarTipoTarjeta(tt);
	
}


@Override
public List<Tipostarjetas> listadoTipoTarjeta() {
	
	return td.listadoTipoTarjeta();
}


@Override
public Tipostarjetas detalleTipoTarjeta(int idttipotarjeta) {
	
	return td.detalleTipoTarjeta(idttipotarjeta);
}


@Override
public void insertarTiposTarifas(Tipostarifas ttar) {
	td.insertarTiposTarifas(ttar);
	
}


@Override
public void modificarTipoTarifas(Tipostarifas ttar) {
	td.modificarTipoTarifas(ttar);
	
}


@Override
public void borrarTipoTarifa(Tipostarifas ttar) {
	td.borrarTipoTarifa(ttar);
	
}


@Override
public List<Tipostarifas> listadoTipoTarifa() {
	
	return td.listadoTipoTarifa();
}


@Override
public Tipostarifas detalletipotarifa(int idttipotarifa) {
	
	return td.detalletipotarifa(idttipotarifa);
}


@Override
public void insertarnumeros(Numeros n) {
	td.insertarnumeros(n);
	
}


@Override
public void modificarnumeros(Numeros n) {
	td.modificarnumeros(n);
	
}


@Override
public void borrarnumeros(Numeros n) {
	td.borrarnumeros(n);
	
}


@Override
public List<Numeros> listadoNumeros() {
	
	return td.listadoNumeros();
}



public Numeros detalleNumero(int idnumero) {
	
	return td.detalleNumero(idnumero);
}
	
	
	

}
