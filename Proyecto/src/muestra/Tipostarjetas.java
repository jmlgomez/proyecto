package muestra;
// Generated 25-ene-2018 9:22:35 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipostarjetas generated by hbm2java
 */
@Entity
@Table(name = "tipostarjetas", catalog = "telefonia")
public class Tipostarjetas implements java.io.Serializable {

	private Integer idtipotarjeta;
	private String tipotarjeta;
	private String observaciones;
	private Boolean activo;
	private Set tarjetases = new HashSet(0);

	public Tipostarjetas() {
	}

	public Tipostarjetas(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}

	public Tipostarjetas(String tipotarjeta, String observaciones, Boolean activo, Set tarjetases) {
		this.tipotarjeta = tipotarjeta;
		this.observaciones = observaciones;
		this.activo = activo;
		this.tarjetases = tarjetases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idtipotarjeta", unique = true, nullable = false)
	public Integer getIdtipotarjeta() {
		return this.idtipotarjeta;
	}

	public void setIdtipotarjeta(Integer idtipotarjeta) {
		this.idtipotarjeta = idtipotarjeta;
	}

	@Column(name = "tipotarjeta", nullable = false, length = 70)
	public String getTipotarjeta() {
		return this.tipotarjeta;
	}

	public void setTipotarjeta(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}

	@Column(name = "observaciones", length = 250)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "activo")
	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipostarjetas")
	public Set getTarjetases() {
		return this.tarjetases;
	}

	public void setTarjetases(Set tarjetases) {
		this.tarjetases = tarjetases;
	}

}
