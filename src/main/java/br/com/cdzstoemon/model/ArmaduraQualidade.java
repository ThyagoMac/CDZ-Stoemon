package br.com.cdzstoemon.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "armadura_qualidade")
public class ArmaduraQualidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ArmaduraQualidadeId id;

	@ManyToOne
	@JoinColumn(name = "id_armadura", insertable = false, updatable = false)
	private Armadura armadura;

	@ManyToOne
	@JoinColumn(name = "id_qualidade", insertable = false, updatable = false)
	private Qualidade qualidade;

	public ArmaduraQualidadeId getId() {
		return id;
	}

	public void setId(ArmaduraQualidadeId id) {
		this.id = id;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Qualidade getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
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
		ArmaduraQualidade other = (ArmaduraQualidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
