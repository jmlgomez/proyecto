package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dao.AveriasSimDAO;
import muestra.Averiassim;
import muestra.Entregas;

public class AveriasSimDaoImpl implements AveriasSimDAO  {
			SessionFactory sf;
	
	public AveriasSimDaoImpl(SessionFactory sessionfactory){
		
		sf=sessionfactory;
		
	}

	@Override
	public void insertarAveriasSim(Averiassim as) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(as);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Averias Sim"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}
		
	

	@Override
	public void borrarAveriasSim(Averiassim as) {
		
		
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(as);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Averias Sim "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarAveriaSim(Averiassim as) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(as);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la actualización Averias Sim "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public Averiassim  detalleAveriasSim(int idaveriasim) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Averiassim where idaveriasim=:idaveriasim");
			q.setParameter("idaveriasim", idaveriasim);
			Averiassim av = (Averiassim) q.getSingleResult();
			return av;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public List<Averiassim> listarAveriassim() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Averiassim");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}
	
	

}
