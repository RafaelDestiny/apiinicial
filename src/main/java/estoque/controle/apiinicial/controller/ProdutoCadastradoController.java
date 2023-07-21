package estoque.controle.apiinicial.controller;


import estoque.controle.apiinicial.classebase.ProdutosCadastradosBase;
import estoque.controle.apiinicial.produtos.DadosListagemProdutos;
import estoque.controle.apiinicial.produtos.ProdutoRepository;
import estoque.controle.apiinicial.produtos.ProdutosCadastrados;
import estoque.controle.apiinicial.produtos.ProdutosCadastradosAtualizaveis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController //anotação para tornar essa classe um controller
@RequestMapping("Produtoscdt") // anotação para mapear os metodos do GRUD onde entre os parenteses fica o endereço
public class ProdutoCadastradoController {

    @Autowired  // injeção para fazer com que o spring injete o objeto e passa ela para o controller.
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarProdutos (@RequestBody  ProdutosCadastrados dados){

      repository.save(new ProdutosCadastradosBase(dados));

    }
  @GetMapping
  public Page<DadosListagemProdutos> Listar(Pageable paginacao){

      return repository.findAll(paginacao).map(DadosListagemProdutos :: new);

  }
    @PutMapping
    @Transactional

  public void atualizarListaProdutos(@RequestBody ProdutosCadastradosAtualizaveis dados){

        var produto = repository.getReferenceById(dados.id());

        produto.atualizarinformacoes(dados);



  }

  @DeleteMapping("/{id}")
  @Transactional
  public void excluir(@PathVariable Long id){

      repository.deleteById(id);


  }




  }






