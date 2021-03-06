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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Terminales generated by hbm2java
 */
@Entity
@Table(name = "terminales", catalog = "telefonia", uniqueConstraints = { @UniqueConstraint(columnNames = "imei"),
		@UniqueConstraint(columnNames = "numserie") })
public class Terminales implements java.io.Serializable {

	private Integer idterminal;
	private Estados estados;
	private Marcas marcas;
	private Tiposdispositivos tiposdispositivos;
	private String modelo;
	private String imei;
	private String cambioimei;
	private String numserie;
	private String observaciones;
	private Set entregases = new HashSet(0);
	private Set averiasterminalesesForImeiantiguo = new HashSet(0);
	private Set averiasterminalesesForImeinuevo = new HashSet(0);
	private Set histestadoses = new HashSet(0);

	public Terminales() {
	}

	public Terminales(String modelo, String imei) {
		this.modelo = modelo;
		this.imei = imei;
	}

	public Terminales(Estados estados, Marcas marcas, Tiposdispositivos tiposdispositivos, String modelo, String imei,
			String cambioimei, String numserie, String observaciones, Set entregases,
			Set averiasterminalesesForImeiantiguo, Set averiasterminalesesForImeinuevo, Set histestadoses) {
		this.estados = estados;
		this.marcas = marcas;
		this.tiposdispositivos = tiposdispositivos;
		this.modelo = modelo;
		this.imei = imei;
		this.cambioimei = cambioimei;
		this.numserie = numserie;
		this.observaciones = observaciones;
		this.entregases = entregases;
		this.averiasterminalesesForImeiantiguo = averiasterminalesesForImeiantiguo;
		this.averiasterminalesesForImeinuevo = averiasterminalesesForImeinuevo;
		this.histestadoses = histestadoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idterminal", unique = true, nullable = false)
	public Integer getIdterminal() {
		return this.idterminal;
	}

	public void setIdterminal(Integer idterminal) {
		this.idterminal = idterminal;
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
	@JoinColumn(name = "idmarca")
	public Marcas getMarcas() {
		return this.marcas;
	}

	public void setMarcas(Marcas marcas) {
		this.marcas = marcas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipodispositivo")
	public Tiposdispositivos getTiposdispositivos() {
		return this.tiposdispositivos;
	}

	public void setTiposdispositivos(Tiposdispositivos tiposdispositivos) {
		this.tiposdispositivos = tiposdispositivos;
	}

	@Column(name = "modelo", nullable = false, length = 80)
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name = "imei", unique = true, nullable = false, length = 90)
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Column(name = "cambioimei", length = 90)
	public String getCambioimei() {
		return this.cambioimei;
	}

	public void setCambioimei(String cambioimei) {
		this.cambioimei = cambioimei;
	}

	@Column(name = "numserie", unique = true, length = 90)
	public String getNumserie() {
		return this.numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	@Column(name = "observaciones", length = 250)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "terminales")
	public Set getEntregases() {
		return this.entregases;
	}

	public void setEntregases(Set entregases) {
		this.entregases = entregases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "terminalesByImeiantiguo")
	public Set getAveriasterminalesesForImeiantiguo() {
		return this.averiasterminalesesForImeiantiguo;
	}

	public void setAveriasterminalesesForImeiantiguo(Set averiasterminalesesForImeiantiguo) {
		this.averiasterminalesesForImeiantiguo = averiasterminalesesForImeiantiguo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "terminalesByImeinuevo")
	public Set getAveriasterminalesesForImeinuevo() {
		return this.averiasterminalesesForImeinuevo;
	}

	public void setAveriasterminalesesForImeinuevo(Set averiasterminalesesForImeinuevo) {
		this.averiasterminalesesForImeinuevo = averiasterminalesesForImeinuevo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "terminales")
	public Set getHistestadoses() {
		return this.histestadoses;
	}

	public void setHistestadoses(Set histestadoses) {
		this.histestadoses = histestadoses;
	}

}
