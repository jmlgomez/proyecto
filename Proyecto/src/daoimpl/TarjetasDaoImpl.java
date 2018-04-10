package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dao.TarjetasDAO;
import muestra.Numeros;
import muestra.Tarjetas;
import muestra.Tipostarifas;
import muestra.Tipostarjetas;

public class TarjetasDaoImpl implements TarjetasDAO{
	SessionFactory sf;
	
	public TarjetasDaoImpl (SessionFactory sessionFactory){
		sf=sessionFactory;
		
	}

	//Tabla InsertarTarjetas
	public void insertarTarjeta(Tarjetas t) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(t);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Tarjeta"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		
		}
		
	}

	@Override
	public void borrarTarjeta(Tarjetas t) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(t);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Tarjeta  "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarTarjeta(Tarjetas t) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(t);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion Tarjeta "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}

	@Override
	public Tarjetas detalleTarjeta(int idtarjeta) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Tarjeta where idtarjeta=:idtarjeta");
			q.setParameter("idtarjeta", idtarjeta);
			Tarjetas t = (Tarjetas) q.getSingleResult();
			return t;
			
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public List<Tarjetas> listarTarjetas() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Tarjetas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	
	
	//Tabla InsertarTipoTarjetas
	@Override
	public void insertarTipoTarjeta(Tipostarjetas tt) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(tt);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion TiposTarjeta "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarTipoTarjeta(Tipostarjetas tt) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(tt);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion TiposTarjeta" +ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void borrarTipoTarjeta(Tipostarjetas tt) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(tt);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado TiposTarjeta"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public List<Tipostarjetas> listadoTipoTarjeta() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Tipostarjetas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public Tipostarjetas detalleTipoTarjeta(int idttipotarjeta) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from detalleTipoTarjeta where idttipotarjeta=:idttipotarjeta");
			q.setParameter("idttipotarjeta", idttipotarjeta);
			Tipostarjetas tt = (Tipostarjetas) q.getSingleResult();
			return tt;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	
	//Tabla tipotarifas
	public void insertarTiposTarifas(Tipostarifas ttar) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(ttar);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion TiposTarifas "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarTipoTarifas(Tipostarifas ttar) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(ttar);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion TiposTarifas"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void borrarTipoTarifa(Tipostarifas ttar) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(ttar);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la borrado TiposTarifas "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}

	public List<Tipostarifas> listadoTipoTarifa() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from detalleTipostarifas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}
	

	@Override
	public Tipostarifas detalletipotarifa(int iddetallettipotarifa) {
		
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from detalletipotarifa where iddetallettipotarifa=:iddetalletttipotarifa");
			q.setParameter("iddetallettipotarifa", iddetallettipotarifa);
			Tipostarifas tt = (Tipostarifas) q.getSingleResult();
			return tt;
			
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
		
	}

	//Tabla Numeros
	
	public void insertarnumeros(Numeros n) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(n);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion del numero "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void modificarnumeros(Numeros n) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(n);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion del numero "+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public void borrarnumeros(Numeros n) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(n);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado del numero"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}

	@Override
	public List<Numeros> listadoNumeros() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Numeros");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	@Override
	public Numeros detalleNumero(int idnumero) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from idnumero where idnumero=:idnumero");
			q.setParameter("idnumero", idnumero);
			Numeros n = (Numeros) q.getSingleResult();
			return n;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

	
	
	}

	
	
		
	


	
		
	
	
	 
		
	
	


