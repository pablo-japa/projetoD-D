package projeto.entity;

import java.io.Serializable;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuario_id;
	private String usuario_nome;
	private int usuario_senha;

	//Cria um construtor vazio
	public Usuario() {
		super();
	}
	//cria um construtor com todos atributos
	public Usuario(String usuario_nome, int usuario_senha) {
		super();
		this.usuario_nome = usuario_nome;
		this.usuario_senha = usuario_senha;
	}
	
	//Ao criar um construtor vazio, permite que vc instancia futuramente a classe, sem ter que passar os parametros
	
	//exemplo: Usuario user = new Usuario;
	
	//e Criando um com todos os atributos permite que vc crie passando um ou dois atributos
	
	//exemplo: Usuario user = new Usuario("carlos", 1234)
	
	
	public String getUsuario_nome() {
		return usuario_nome;
	}

	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}

	public int getUsuario_senha() {
		return usuario_senha;
	}

	public void setUsuario_senha(int usuario_senha) {
		this.usuario_senha = usuario_senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuario_id, usuario_nome, usuario_senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return usuario_id == other.usuario_id && Objects.equals(usuario_nome, other.usuario_nome)
				&& usuario_senha == other.usuario_senha;
	}

	@Override
	public String toString() {
		return "Usuario [usuario_id=" + usuario_id + ", usuario_nome=" + usuario_nome + ", usuario_senha="
				+ usuario_senha + "]";
	}

}
