package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dao.AveriasTerminalesDAO;
import muestra.Averiassim;
import muestra.Averiasterminales;

public class AveriasTerminalesDaoImpl implements AveriasTerminalesDAO {

SessionFactory sf;
	
	public AveriasTerminalesDaoImpl(SessionFactory sessionfactory){
		
		sf=sessionfactory;
		
	}

	@Override
	public void insertarAveriaTerminal(Averiasterminales at) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(at);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Averiasterminales "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
	}
		
	

	@Override
	public void borrarAveriaTerminal(Averiasterminales at) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(at);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Averiasterminales "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarAveriaTerminal(Averiasterminales at) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(at);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion Averiasterminales "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public Averiasterminales detalleAveriasterminal(int idaveriasterminal) {
		try {
		sf.getCurrentSession().beginTransaction();
		Query q = sf.getCurrentSession().createQuery("from Averiasterminales where idaveriasterminal=:idaveriasterminal");
		q.setParameter("idaveriasterminal", idaveriasterminal);
		Averiasterminales dav = (Averiasterminales) q.getSingleResult();
		return dav;
	} catch (RuntimeException ex) {
		ex.printStackTrace();
		sf.getCurrentSession().getTransaction().rollback();
	}
	return null;

}

	@Override
	public List<Averiasterminales> listarAveriaTerminal() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Averiasterminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}
	
	
}
