package projeto.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ficha implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ficha_id;
	private int usuario_id;
	private String ficha_nome_do_jogador;
	private int ficha_classe_armadura;
	private int ficha_pv;
	private int ficha_exp;
	private int ficha_iniciativa;
	private int ficha_deslocamento;
	private String ficha_raca;
	private String ficha_nome;
	private int ficha_nivel;
	private String ficha_antecedente;
	private int ficha_status_for;
	private int ficha_status_con;
	private int ficha_status_sab;
	private int ficha_status_des;
	private int ficha_status_int;
	private int ficha_status_car;
	private String ficha_historia_lore;

	public Ficha() {
		super();
	}

	public Ficha(String ficha_nome_do_jogador, int ficha_classe_armadura, int ficha_pv, int ficha_exp,
			int ficha_iniciativa, int ficha_deslocamento, String ficha_raca, String ficha_nome, int ficha_nivel,
			String ficha_antecedente, int ficha_status_for, int ficha_status_con, int ficha_status_sab,
			int ficha_status_des, int ficha_status_int, int ficha_status_car, String ficha_historia_lore) {
		super();
		this.ficha_nome_do_jogador = ficha_nome_do_jogador;
		this.ficha_classe_armadura = ficha_classe_armadura;
		this.ficha_pv = ficha_pv;
		this.ficha_exp = ficha_exp;
		this.ficha_iniciativa = ficha_iniciativa;
		this.ficha_deslocamento = ficha_deslocamento;
		this.ficha_raca = ficha_raca;
		this.ficha_nome = ficha_nome;
		this.ficha_nivel = ficha_nivel;
		this.ficha_antecedente = ficha_antecedente;
		this.ficha_status_for = ficha_status_for;
		this.ficha_status_con = ficha_status_con;
		this.ficha_status_sab = ficha_status_sab;
		this.ficha_status_des = ficha_status_des;
		this.ficha_status_int = ficha_status_int;
		this.ficha_status_car = ficha_status_car;
		this.ficha_historia_lore = ficha_historia_lore;
	}

	public int getFicha_id() {
		return ficha_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public String getFicha_nome_do_jogador() {
		return ficha_nome_do_jogador;
	}

	public void setFicha_nome_do_jogador(String ficha_nome_do_jogador) {
		this.ficha_nome_do_jogador = ficha_nome_do_jogador;
	}

	public int getFicha_classe_armadura() {
		return ficha_classe_armadura;
	}

	public void setFicha_classe_armadura(int ficha_classe_armadura) {
		this.ficha_classe_armadura = ficha_classe_armadura;
	}

	public int getFicha_pv() {
		return ficha_pv;
	}

	public void setFicha_pv(int ficha_pv) {
		this.ficha_pv = ficha_pv;
	}

	public int getFicha_exp() {
		return ficha_exp;
	}

	public void setFicha_exp(int ficha_exp) {
		this.ficha_exp = ficha_exp;
	}

	public int getFicha_iniciativa() {
		return ficha_iniciativa;
	}

	public void setFicha_iniciativa(int ficha_iniciativa) {
		this.ficha_iniciativa = ficha_iniciativa;
	}

	public int getFicha_deslocamento() {
		return ficha_deslocamento;
	}

	public void setFicha_deslocamento(int ficha_deslocamento) {
		this.ficha_deslocamento = ficha_deslocamento;
	}

	public String getFicha_raca() {
		return ficha_raca;
	}

	public void setFicha_raca(String ficha_raca) {
		this.ficha_raca = ficha_raca;
	}

	public String getFicha_nome() {
		return ficha_nome;
	}

	public void setFicha_nome(String ficha_nome) {
		this.ficha_nome = ficha_nome;
	}

	public int getFicha_nivel() {
		return ficha_nivel;
	}

	public void setFicha_nivel(int ficha_nivel) {
		this.ficha_nivel = ficha_nivel;
	}

	public String getFicha_antecedente() {
		return ficha_antecedente;
	}

	public void setFicha_antecedente(String ficha_antecedente) {
		this.ficha_antecedente = ficha_antecedente;
	}

	public int getFicha_status_for() {
		return ficha_status_for;
	}

	public void setFicha_status_for(int ficha_status_for) {
		this.ficha_status_for = ficha_status_for;
	}

	public int getFicha_status_con() {
		return ficha_status_con;
	}

	public void setFicha_status_con(int ficha_status_con) {
		this.ficha_status_con = ficha_status_con;
	}

	public int getFicha_status_sab() {
		return ficha_status_sab;
	}

	public void setFicha_status_sab(int ficha_status_sab) {
		this.ficha_status_sab = ficha_status_sab;
	}

	public int getFicha_status_des() {
		return ficha_status_des;
	}

	public void setFicha_status_des(int ficha_status_des) {
		this.ficha_status_des = ficha_status_des;
	}

	public int getFicha_status_int() {
		return ficha_status_int;
	}

	public void setFicha_status_int(int ficha_status_int) {
		this.ficha_status_int = ficha_status_int;
	}

	public int getFicha_status_car() {
		return ficha_status_car;
	}

	public void setFicha_status_car(int ficha_status_car) {
		this.ficha_status_car = ficha_status_car;
	}

	public String getFicha_historia_lore() {
		return ficha_historia_lore;
	}

	public void setFicha_historia_lore(String ficha_historia_lore) {
		this.ficha_historia_lore = ficha_historia_lore;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ficha_antecedente, ficha_classe_armadura, ficha_deslocamento, ficha_exp,
				ficha_historia_lore, ficha_id, ficha_iniciativa, ficha_nivel, ficha_nome, ficha_nome_do_jogador,
				ficha_pv, ficha_raca, ficha_status_car, ficha_status_con, ficha_status_des, ficha_status_for,
				ficha_status_int, ficha_status_sab, usuario_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ficha other = (Ficha) obj;
		return Objects.equals(ficha_antecedente, other.ficha_antecedente)
				&& ficha_classe_armadura == other.ficha_classe_armadura
				&& ficha_deslocamento == other.ficha_deslocamento && ficha_exp == other.ficha_exp
				&& Objects.equals(ficha_historia_lore, other.ficha_historia_lore) && ficha_id == other.ficha_id
				&& ficha_iniciativa == other.ficha_iniciativa && ficha_nivel == other.ficha_nivel
				&& Objects.equals(ficha_nome, other.ficha_nome)
				&& Objects.equals(ficha_nome_do_jogador, other.ficha_nome_do_jogador) && ficha_pv == other.ficha_pv
				&& Objects.equals(ficha_raca, other.ficha_raca) && ficha_status_car == other.ficha_status_car
				&& ficha_status_con == other.ficha_status_con && ficha_status_des == other.ficha_status_des
				&& ficha_status_for == other.ficha_status_for && ficha_status_int == other.ficha_status_int
				&& ficha_status_sab == other.ficha_status_sab && usuario_id == other.usuario_id;
	}

	@Override
	public String toString() {
		return "Ficha [ficha_id=" + ficha_id + ", usuario_id=" + usuario_id + ", ficha_nome_do_jogador="
				+ ficha_nome_do_jogador + ", ficha_classe_armadura=" + ficha_classe_armadura + ", ficha_pv=" + ficha_pv
				+ ", ficha_exp=" + ficha_exp + ", ficha_iniciativa=" + ficha_iniciativa + ", ficha_deslocamento="
				+ ficha_deslocamento + ", ficha_raca=" + ficha_raca + ", ficha_nome=" + ficha_nome + ", ficha_nivel="
				+ ficha_nivel + ", ficha_antecedente=" + ficha_antecedente + ", ficha_status_for=" + ficha_status_for
				+ ", ficha_status_con=" + ficha_status_con + ", ficha_status_sab=" + ficha_status_sab
				+ ", ficha_status_des=" + ficha_status_des + ", ficha_status_int=" + ficha_status_int
				+ ", ficha_status_car=" + ficha_status_car + ", ficha_historia_lore=" + ficha_historia_lore + "]";
	}

}
