package br.com.cdzstoemon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;

@Embeddable
public class ArmaduraQualidadeId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_armadura")
	private Integer idArmadura;
	
	@Column(name="id_qualidade")
	private Integer idQualidade;

	public Integer getIdArmadura() {
		return idArmadura;
	}

	public void setIdArmadura(Integer idArmadura) {
		this.idArmadura = idArmadura;
	}

	public Integer getIdQualidade() {
		return idQualidade;
	}

	public void setIdQualidade(Integer idQualidade) {
		this.idQualidade = idQualidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idArmadura == null) ? 0 : idArmadura.hashCode());
		result = prime * result + ((idQualidade == null) ? 0 : idQualidade.hashCode());
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
		ArmaduraQualidadeId other = (ArmaduraQualidadeId) obj;
		if (idArmadura == null) {
			if (other.idArmadura != null)
				return false;
		} else if (!idArmadura.equals(other.idArmadura))
			return false;
		if (idQualidade == null) {
			if (other.idQualidade != null)
				return false;
		} else if (!idQualidade.equals(other.idQualidade))
			return false;
		return true;
	}

}
