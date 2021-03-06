package muestra;
// Generated 25-ene-2018 9:22:35 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Histestados generated by hbm2java
 */
@Entity
@Table(name = "histestados", catalog = "telefonia")
public class Histestados implements java.io.Serializable {

	private Integer idhistestado;
	private Estados estados;
	private Terminales terminales;
	private Date fechahistestado;
	private String tipohistestado;
	private String descripcionhistestado;

	public Histestados() {
	}

	public Histestados(Estados estados, Terminales terminales, Date fechahistestado, String tipohistestado,
			String descripcionhistestado) {
		this.estados = estados;
		this.terminales = terminales;
		this.fechahistestado = fechahistestado;
		this.tipohistestado = tipohistestado;
		this.descripcionhistestado = descripcionhistestado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idhistestado", unique = true, nullable = false)
	public Integer getIdhistestado() {
		return this.idhistestado;
	}

	public void setIdhistestado(Integer idhistestado) {
		this.idhistestado = idhistestado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idestado")
	public Estados getEstados() {
		return this.estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idterminal")
	public Terminales getTerminales() {
		return this.terminales;
	}

	public void setTerminales(Terminales terminales) {
		this.terminales = terminales;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechahistestado", length = 10)
	public Date getFechahistestado() {
		return this.fechahistestado;
	}

	public void setFechahistestado(Date fechahistestado) {
		this.fechahistestado = fechahistestado;
	}

	@Column(name = "tipohistestado", length = 40)
	public String getTipohistestado() {
		return this.tipohistestado;
	}

	public void setTipohistestado(String tipohistestado) {
		this.tipohistestado = tipohistestado;
	}

	@Column(name = "descripcionhistestado", length = 250)
	public String getDescripcionhistestado() {
		return this.descripcionhistestado;
	}

	public void setDescripcionhistestado(String descripcionhistestado) {
		this.descripcionhistestado = descripcionhistestado;
	}

}
