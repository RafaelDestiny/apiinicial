package estoque.controle.apiinicial.estoques;

import estoque.controle.apiinicial.classebase.EstoqueCadastroBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<EstoqueCadastroBase, Long> {





}
