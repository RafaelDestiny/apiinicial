package estoque.controle.apiinicial.estoques;

import estoque.controle.apiinicial.classebase.EstoqueCadastroBase;

public record EstoqueListagem(


                              Long id,
                              double EntradaQtd,

                              double SaidaQtd,

                              double SaldoQtd,

                              double EntradaPrc,
                              double SaidaPrc,
                              double SaldoPrc) {


    public EstoqueListagem(EstoqueCadastroBase dados){

        this(dados.getId(),dados.getEntradaQtd(),dados.getSaidaQtd(),dados.getSaldoQtd(),
                dados.getEntradaPrc(),dados.getSaidaPrc(),dados.getSaldoPrc());

    }



}
