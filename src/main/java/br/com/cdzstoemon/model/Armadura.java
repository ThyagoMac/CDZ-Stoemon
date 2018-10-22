package br.com.cdzstoemon.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "armadura")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Armadura implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armadura")
	private Integer id;
	
	private String nome;

	@ManyToOne
	//@JoinColumn(name = "id_personagem", referencedColumnName="id") <--<< muda a coluna referenciada quando o nome for diferente
	@JoinColumn(name = "id_personagem") 
	private Personagem personagem;

	@OneToOne
	@JoinColumn(name = "id_atributos")
	private Atributo atributo;
	
	@OneToOne
	@JoinColumn(name = "id_pericias")
	private Pericia pericia;

//	@ManyToMany
//	private List<Qualidade> qualidade;
	
	@ManyToMany
	private List<Magia> magia;
	
	@Transient
//	@OneToMany(mappedBy="armadura", fetch=FetchType.LAZY)
	private List<ArmaduraQualidade> armaduraQualidades;

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Magia> getMagia() {
		return magia;
	}

	public void setMagia(List<Magia> magia) {
		this.magia = magia;
	}

	public Atributo getAtributo() {
		return atributo;
	}

	public void setAtributo(Atributo atributo) {
		this.atributo = atributo;
	}

	public Pericia getPericia() {
		return pericia;
	}

	public void setPericia(Pericia pericia) {
		this.pericia = pericia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ArmaduraQualidade> getArmaduraQualidades() {
		return armaduraQualidades;
	}

	public void setArmaduraQualidades(List<ArmaduraQualidade> armaduraQualidades) {
		this.armaduraQualidades = armaduraQualidades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Armadura other = (Armadura) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
