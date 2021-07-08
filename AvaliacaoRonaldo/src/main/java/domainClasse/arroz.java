package domainClasse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class arroz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSafra;
	
	private String cultivarSafra;
	
	private String anoSafra;
	
	private String mesPlantio;	

	private String mesColheita;	

	private String valorCotacao;

	public Long getIdSafra() {
		return idSafra;
	}

	public void setIdSafra(Long idSafra) {
		this.idSafra = idSafra;
	}

	public String getCultivarSafra() {
		return cultivarSafra;
	}

	public void setCultivarSafra(String cultivarSafra) {
		this.cultivarSafra = cultivarSafra;
	}

	public String getAnoSafra() {
		return anoSafra;
	}

	public void setAnoSafra(String anoSafra) {
		this.anoSafra = anoSafra;
	}

	public String getMesPlantio() {
		return mesPlantio;
	}

	public void setMesPlantio(String mesPlantio) {
		this.mesPlantio = mesPlantio;
	}

	public String getMesColheita() {
		return mesColheita;
	}

	public void setMesColheita(String mesColheita) {
		this.mesColheita = mesColheita;
	}

	public String getValorCotacao() {
		return valorCotacao;
	}

	public void setValorCotacao(String valorCotacao) {
		this.valorCotacao = valorCotacao;
	}
	

}
