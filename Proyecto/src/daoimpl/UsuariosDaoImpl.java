package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dao.UsuariosDAO;
import muestra.DepartamentosAyto;
import muestra.EmpresasAyto;
import muestra.Entregas;
import muestra.Usuarios;

public class UsuariosDaoImpl implements UsuariosDAO{
	SessionFactory sf;
	
	public UsuariosDaoImpl (SessionFactory sessionFactory){
		sf=sessionFactory;
		
	}

	@Override
	public void insertarUsuaios(Usuarios u) {
		try {
		sf.getCurrentSession().beginTransaction();
		sf.getCurrentSession().save(u);
		sf.getCurrentSession().getTransaction().commit();
	} catch (HibernateException ex) {
		System.out.println("Error al realizar la inserccion usuarios"+ex.getMessage());
		sf.getCurrentSession().getTransaction().rollback();
	
	}
		
	}

	@Override
	public void borrarUsuaios(Usuarios u) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(u);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de usuarios"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	@Override
	public void modificarUsuaios(Usuarios u) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(u);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de usuarios"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public Usuarios detalleUsuarios(int idUsuario) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Usuarios where idusuario=:idusuario");
			q.setParameter("idUsuario", idUsuario);
			Usuarios e = (Usuarios) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public List<Usuarios> listarUsuarios() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Usuarios");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public void insertarEmpresasAyto(EmpresasAyto ea) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(ea);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion EmpresasAyto"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		
		}
		
	}

	@Override
	public void borrarEmpresasAyto(EmpresasAyto ea) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(ea);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado EmpresasAyto"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		
		}
		
	}

	@Override
	public void modificarEmpresasAyto(EmpresasAyto ea) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(ea);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion EmpresasAyto"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		
		}
		
	}

	@Override
	public EmpresasAyto detalleEmpresasAyto(int idEmpAyto) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Usuarios where idEmpAyto=:idEmpAyto");
			q.setParameter("idEmpAyto", idEmpAyto);
			EmpresasAyto e = (EmpresasAyto) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public List<EmpresasAyto> listarEmpresasAyto() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from EmpresasAyto");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public void insertarDepartamentosAyto(DepartamentosAyto da) {
			try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(da);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion DepartamentosAyto"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void borrarDepartamentosAyto(DepartamentosAyto da) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(da);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado DepartamentosAyto"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarDepartamentosAyto(DepartamentosAyto da) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(da);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion DepartamentosAyto"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from DepartamentosAyto where idDepAyto=:idDepAyto");
			q.setParameter("idDepAyto", idDepAyto);
			DepartamentosAyto e = (DepartamentosAyto) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public List<DepartamentosAyto> listarDepartamentosAyto() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from DepartamentosAyto");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}
	
	
	

}
