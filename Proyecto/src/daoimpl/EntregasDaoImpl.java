package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dao.EntregasDAO;
import muestra.Entregas;
import muestra.Operadores;

public class EntregasDaoImpl implements EntregasDAO {
	SessionFactory sf;
	
	public EntregasDaoImpl(SessionFactory sessionfactory){
		sf=sessionfactory;
	}
		
	public void insertarEntrega(Entregas e) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(e);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Entregas "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	
	public void borrarEntrega(Entregas e) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(e);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Entregas"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	
	public void modificarEntrega(Entregas e) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(e);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la actualización Entregas"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	
	public Entregas detalleEntrega(int identrega) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Entregas where idEntrega=:identrega");
			q.setParameter("identrega", identrega);
			Entregas e = (Entregas) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	
	public List<Entregas> listarEntregas() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Entregas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	// ********** Operadores *************
	
	public void insertarOperador(Operadores o) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(o);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la insercion Operadores "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	
	public void modificarOperador(Operadores o) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(o);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la actualización Operadores "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	
	public void borrarOperador(Operadores o) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(o);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Operadores "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}

	
	public List<Operadores> listadoOperadores() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Operadores");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	
	public Operadores detalleOperadores(int idoperador) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Entregas where idoperador=:idoperador");
			q.setParameter("idoperador", idoperador);
			Operadores o = (Operadores) q.getSingleResult();
			return o;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}
	

}
