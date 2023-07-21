package estoque.controle.apiinicial.produtos;

// Esse Record é para representar os campos que estão vindo da requisição,
// o Record já embuti a verbosidade do java "getters, setters, construtores, etc".


public record ProdutosCadastrados(

                                   Long id,

                                   String nomeProduto,

                                   String tipoProduto,

                                   String marcaCaracteristicasProdutos,

                                   double precoProduto,

                                   int codificacaoInterna) {
}
