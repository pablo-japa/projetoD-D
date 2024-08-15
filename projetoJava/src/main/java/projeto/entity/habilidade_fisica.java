package projeto.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class habilidade_fisica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int habilidade_fisica_id;
	private int uso;
	private String tipo_habilidade;
	private String nome_habilidade;
	private String descricao_habilidade;

	public habilidade_fisica() {
		super();
	};

	public habilidade_fisica(int habilidade_fisica_id, int uso, String tipo_habilidade, String nome_habilidade,
			String descricao_habilidade) {
		super();
		this.habilidade_fisica_id = habilidade_fisica_id;
		this.uso = uso;
		this.tipo_habilidade = tipo_habilidade;
		this.nome_habilidade = nome_habilidade;
		this.descricao_habilidade = descricao_habilidade;
	}

	public int getUso() {
		return uso;
	}

	public void setUso(int uso) {
		this.uso = uso;
	}

	public String getTipo_habilidade() {
		return tipo_habilidade;
	}

	public void setTipo_habilidade(String tipo_habilidade) {
		this.tipo_habilidade = tipo_habilidade;
	}

	public String getNome_habilidade() {
		return nome_habilidade;
	}

	public void setNome_habilidade(String nome_habilidade) {
		this.nome_habilidade = nome_habilidade;
	}

	public String getDescricao_habilidade() {
		return descricao_habilidade;
	}

	public void setDescricao_habilidade(String descricao_habilidade) {
		this.descricao_habilidade = descricao_habilidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao_habilidade, habilidade_fisica_id, nome_habilidade, tipo_habilidade, uso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		habilidade_fisica other = (habilidade_fisica) obj;
		return Objects.equals(descricao_habilidade, other.descricao_habilidade)
				&& habilidade_fisica_id == other.habilidade_fisica_id
				&& Objects.equals(nome_habilidade, other.nome_habilidade)
				&& Objects.equals(tipo_habilidade, other.tipo_habilidade) && uso == other.uso;
	}

	@Override
	public String toString() {
		return "habilidade_fisica [habilidade_fisica_id=" + habilidade_fisica_id + ", uso=" + uso + ", tipo_habilidade="
				+ tipo_habilidade + ", nome_habilidade=" + nome_habilidade + ", descricao_habilidade="
				+ descricao_habilidade + "]";
	};

}
