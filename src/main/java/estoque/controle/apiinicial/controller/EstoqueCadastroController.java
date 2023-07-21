package estoque.controle.apiinicial.controller;


import estoque.controle.apiinicial.classebase.EstoqueCadastroBase;
import estoque.controle.apiinicial.estoques.EstoqueCadastroBaseDto;
import estoque.controle.apiinicial.estoques.EstoqueListagem;
import estoque.controle.apiinicial.estoques.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Estoquecdt")
    public class EstoqueCadastroController {

    @Autowired
    private EstoqueRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarEstoque(@RequestBody EstoqueCadastroBaseDto dados) {

        repository.save(new EstoqueCadastroBase(dados));

    }

        @GetMapping
        public Page<EstoqueListagem> Listar(@PageableDefault(size = 10, sort = {"EntradaQtd"}) Pageable paginacao) {

            return repository.findAll(paginacao).map(EstoqueListagem::new);

        }

                  @PutMapping
                  @Transactional
                  public void atualizar(@RequestBody EstoqueCadastroBaseDto dados){

                  var estoque = repository.getReferenceById(dados.id());

                 estoque.atualizarInformacoes(dados);

    }
            @DeleteMapping("/{id}")
            @Transactional
            public void excluirProdutos(@PathVariable Long id){

            repository.deleteById(id);


    }




            }























