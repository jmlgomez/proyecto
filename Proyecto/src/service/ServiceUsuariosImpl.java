package service;

import java.util.List;

import dao.UsuariosDAO;
import muestra.DepartamentosAyto;
import muestra.EmpresasAyto;
import muestra.Usuarios;
import util.MySqlDAOFactory;

public class ServiceUsuariosImpl implements ServiceUsuarios {
	MySqlDAOFactory factoria;
	UsuariosDAO us;
	
	public ServiceUsuariosImpl (){
		factoria= new MySqlDAOFactory();
		us=factoria.getUsuariosDAO();
		
		
	}

	@Override
	public void insertarUsuaios(Usuarios u) {
		us.insertarUsuaios(u);
		
	}

	@Override
	public void borrarUsuaios(Usuarios u) {
		us.borrarUsuaios(u);
		
	}

	@Override
	public void modificarUsuaios(Usuarios u) {
	us.modificarUsuaios(u);
		
	}

	@Override
	public Usuarios detalleUsuarios(int idUsuario) {
		
		return us.detalleUsuarios(idUsuario);
	}

	@Override
	public List<Usuarios> listarUsuarios() {
		
		return us.listarUsuarios();
	}

	@Override
	public void insertarEmpresasAyto(EmpresasAyto ea) {
		us.insertarEmpresasAyto(ea);
		
	}

	@Override
	public void borrarEmpresasAyto(EmpresasAyto ea) {
		us.borrarEmpresasAyto(ea);
		
	}

	@Override
	public void modificarEmpresasAyto(EmpresasAyto ea) {
		us.modificarEmpresasAyto(ea);
		
	}

	@Override
	public EmpresasAyto detalleEmpresasAyto(int idEmpAyto) {
		
		return us.detalleEmpresasAyto(idEmpAyto);
	}

	@Override
	public List<EmpresasAyto> listarEmpresasAyto() {
		
		return us.listarEmpresasAyto();
	}

	@Override
	public void insertarDepartamentosAyto(DepartamentosAyto da) {
		us.insertarDepartamentosAyto(da);
		
	}

	@Override
	public void borrarDepartamentosAyto(DepartamentosAyto da) {
		us.borrarDepartamentosAyto(da);
		
	}

	@Override
	public void modificarDepartamentosAyto(DepartamentosAyto da) {
		us.modificarDepartamentosAyto(da);
		
	}

	@Override
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto) {
		
		return us.detalleDepartamentosAyto(idDepAyto);
	}

	@Override
	public List<DepartamentosAyto> listarDepartamentosAyto() {
		
		return us.listarDepartamentosAyto();
	}

}
