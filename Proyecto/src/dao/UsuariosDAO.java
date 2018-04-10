package dao;

import java.util.List;

import muestra.DepartamentosAyto;
import muestra.EmpresasAyto;
import muestra.Usuarios;

public interface UsuariosDAO {

	public void insertarUsuaios(Usuarios u);
	public void borrarUsuaios(Usuarios u);
	public void modificarUsuaios(Usuarios u);
	public Usuarios detalleUsuarios(int idUsuario);
	public List<Usuarios> listarUsuarios();

	// Manejo EMPRESAS_AYTO
	public void insertarEmpresasAyto(EmpresasAyto ea);
	public void borrarEmpresasAyto(EmpresasAyto ea);
	public void modificarEmpresasAyto(EmpresasAyto ea);
	public EmpresasAyto detalleEmpresasAyto(int idEmpAyto);
	public List<EmpresasAyto> listarEmpresasAyto();

	// Manejo DEPARTAMENTOS_AYTO
	public void insertarDepartamentosAyto(DepartamentosAyto da);
	public void borrarDepartamentosAyto(DepartamentosAyto da);
	public void modificarDepartamentosAyto(DepartamentosAyto da);
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto);
	public List<DepartamentosAyto> listarDepartamentosAyto();

}
