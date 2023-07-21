package estoque.controle.apiinicial.produtos;

// Essa classe faz a injeção do atributos para o banco de dados se herda extendendo
// a classe ProdutoRepository para a JPA o JpaRepository.

import estoque.controle.apiinicial.classebase.ProdutosCadastradosBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutosCadastradosBase, Long> {



}
