package projeto.repository;
	
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import projeto.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
	
	@Query(value = "SELECT usuario_nome FROM usuario u WHERE usuario_nome = :nome AND usuario_senha = :senha", nativeQuery = true)
	Usuario encontrarUsuarioPorNomeESenha(@Param("nome") String usuario_nome, @Param("senha") String usuario_senha);
}
