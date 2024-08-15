package projeto.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class inventario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int inventario_id;
	private String descricao_itens;
	private int moeda_platina;
	private int moeda_ouro;
	private int moeda_prata;
	private int moeda_bronze;
	private int moeda_electro;
	
	public inventario() {
		super();
	}
	
	public inventario(int inventario_id, String descricao_itens, int moeda_platina, int moeda_ouro, int moeda_prata,
			int moeda_bronze, int moeda_electro) {
		super();
		this.inventario_id = inventario_id;
		this.descricao_itens = descricao_itens;
		this.moeda_platina = moeda_platina;
		this.moeda_ouro = moeda_ouro;
		this.moeda_prata = moeda_prata;
		this.moeda_bronze = moeda_bronze;
		this.moeda_electro = moeda_electro;
	}

	public String getDescricao_itens() {
		return descricao_itens;
	}

	public void setDescricao_itens(String descricao_itens) {
		this.descricao_itens = descricao_itens;
	}

	public int getMoeda_platina() {
		return moeda_platina;
	}

	public void setMoeda_platina(int moeda_platina) {
		this.moeda_platina = moeda_platina;
	}

	public int getMoeda_ouro() {
		return moeda_ouro;
	}

	public void setMoeda_ouro(int moeda_ouro) {
		this.moeda_ouro = moeda_ouro;
	}

	public int getMoeda_prata() {
		return moeda_prata;
	}

	public void setMoeda_prata(int moeda_prata) {
		this.moeda_prata = moeda_prata;
	}

	public int getMoeda_bronze() {
		return moeda_bronze;
	}

	public void setMoeda_bronze(int moeda_bronze) {
		this.moeda_bronze = moeda_bronze;
	}

	public int getMoeda_electro() {
		return moeda_electro;
	}

	public void setMoeda_electro(int moeda_electro) {
		this.moeda_electro = moeda_electro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao_itens, inventario_id, moeda_bronze, moeda_electro, moeda_ouro, moeda_platina,
				moeda_prata);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		inventario other = (inventario) obj;
		return Objects.equals(descricao_itens, other.descricao_itens) && inventario_id == other.inventario_id
				&& moeda_bronze == other.moeda_bronze && moeda_electro == other.moeda_electro
				&& moeda_ouro == other.moeda_ouro && moeda_platina == other.moeda_platina
				&& moeda_prata == other.moeda_prata;
	}

	@Override
	public String toString() {
		return "inventario [inventario_id=" + inventario_id + ", descricao_itens=" + descricao_itens
				+ ", moeda_platina=" + moeda_platina + ", moeda_ouro=" + moeda_ouro + ", moeda_prata=" + moeda_prata
				+ ", moeda_bronze=" + moeda_bronze + ", moeda_electro=" + moeda_electro + "]";
	}
	
	
	
	
	

}



