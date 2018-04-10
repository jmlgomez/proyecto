package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dao.TerminalesDAO;
import muestra.DepartamentosAyto;
import muestra.Estados;
import muestra.Histestados;
import muestra.Marcas;
import muestra.Terminales;
import muestra.Tiposdispositivos;
import muestra.Tipostarifas;
import muestra.Tipostarjetas;

public class TerminalesDaoImpl implements TerminalesDAO {
	SessionFactory sf;
	
	
	public TerminalesDaoImpl (SessionFactory sessionFactory){
		sf=sessionFactory;
		
	}


	@Override
	public void insertarTerminal(Terminales t) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(t);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion Terminales"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void borrarTerminal(Terminales t) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(t);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado Terminales"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void modificarTerminal(Terminales t) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(t);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion Terminales"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public Terminales detalleTerminales(int idterminal) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from detalleTerminales where idterminal=:idterminal");
			q.setParameter("idterminal", idterminal);
			Terminales e = (Terminales) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public List<Terminales> listarTerminales() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Terminales");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public void insertarMarca(Marcas m) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(m);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de Marcas"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}


	@Override
	public void modificarMarca(Marcas m) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(m);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de Marcas"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void borrarMarca(Marcas m) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(m);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de Marcas"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}


	@Override
	public List<Marcas> listadoMarcas() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Marcas");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public Marcas detalleMarca(int idmarca) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from marcas where idmarca=:idmarca");
			q.setParameter("idmarca", idmarca);
			Marcas e = (Marcas) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public void insertarTiposDispositivos(Tiposdispositivos td) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(td);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de Tipos De Dispositivos"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}


	@Override
	public void modificarTipoDispositivos(Tipostarifas td) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(td);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de Tipos De Dispositivos"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}


	@Override
	public void borrarTiposDispositivos(Tiposdispositivos td) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(td);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de Tipos De Dispositivos"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
		
	}


	@Override
	public List<Tipostarjetas> listadoTipodispositivos() {
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
	public Tipostarjetas detalletipodispositivo(int idttipoTarjeta) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Tipostarjetas where idttipoTarjeta=:idttipoTarjeta");
			q.setParameter("idttipoTarjeta", idttipoTarjeta);
			Tipostarjetas e = (Tipostarjetas) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public void insertarEstados(Estados e) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(e);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de Estados"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void modificarEstados(Estados e) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(e);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de Estados"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void borrarEstados(Estados e) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(e);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar el borrado de Estados"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public List<Estados> listadoEstados() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Estados");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public Estados detalleEstados(int idestado) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from detalleEstados where idestado=:idestado");
			q.setParameter("idestado", idestado);
			Estados e = (Estados) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public void insertarHistEstados(Histestados he) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().save(he);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de HistEstados"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void modificarHistEstados(Histestados he) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().saveOrUpdate(he);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la modificacion de HistEstados"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public void borrarHistEstados(Histestados he) {
		try {
			sf.getCurrentSession().beginTransaction();
			sf.getCurrentSession().delete(he);
			sf.getCurrentSession().getTransaction().commit();
		} catch (HibernateException ex) {
			System.out.println("Error al realizar la inserccion de HistEstados"+ex.getMessage());
			sf.getCurrentSession().getTransaction().rollback();
		}
		
	}


	@Override
	public List<Histestados> listadoHistEstados() {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from Histestados");
			return q.getResultList();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}


	@Override
	public Histestados detalleHistEstados(int idhistestado) {
		try {
			sf.getCurrentSession().beginTransaction();
			Query q = sf.getCurrentSession().createQuery("from detalleHistEstados where idhistestado=:idhistestado");
			q.setParameter("idhistestado", idhistestado);
			Histestados e = (Histestados) q.getSingleResult();
			return e;
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			sf.getCurrentSession().getTransaction().rollback();
		}
		return null;
	}

}
