package estoque.controle.apiinicial.produtos;

import estoque.controle.apiinicial.classebase.ProdutosCadastradosBase;


public record DadosListagemProdutos(Long id, String nomeProduto, String TipoProduto, String marcaCaracteristicasProduto, double PreçoProduto, int coficacaoInterna) {

    public DadosListagemProdutos(ProdutosCadastradosBase produtos) {

        this(produtos.getId(),produtos.getNomeProduto(), produtos.getTipoProduto(),
                produtos.getMarcaCaracteristicasProdutos(), produtos.getPrecoProduto(),
                produtos.getCodificacaoInterna());

    }
}
