package estoque.controle.apiinicial.classebase;

// Essa classe é para o mapeamento dos atributos junto ao banco de dados JPA,
// se utiliza as anotações para realizar essa tarefa.
//

import estoque.controle.apiinicial.produtos.ProdutosCadastrados;
import estoque.controle.apiinicial.produtos.ProdutosCadastradosAtualizaveis;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

   @Table(name = "produto")
   @Entity(name = "ProdutosCadastradosBase")
   @Getter
   @NoArgsConstructor
   @AllArgsConstructor
   @EqualsAndHashCode(of = "id")

  public class ProdutosCadastradosBase {


       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)


       private Long id;



       @Column(name = "nomeProduto")
       protected String nomeProduto;

       @Column(name = "tipoProduto")
       protected String tipoProduto;

       @Column(name = "marcaCaracteristicasProdutos")
       protected String marcaCaracteristicasProdutos;

       @Column(name = "precoProduto")
       protected double precoProduto;

       @Column(name = "codificacaoInterna")
       protected int codificacaoInterna;





       public ProdutosCadastradosBase(ProdutosCadastrados dados) {

           nomeProduto = dados.nomeProduto();
           tipoProduto = dados.tipoProduto();
           marcaCaracteristicasProdutos = dados.marcaCaracteristicasProdutos();
           precoProduto = dados.precoProduto();
           codificacaoInterna = dados.codificacaoInterna();

       }

















       public void atualizarinformacoes(ProdutosCadastradosAtualizaveis dados) {

           if (dados.nomeProduto() != null) {

               this.nomeProduto = dados.nomeProduto();
           }

           if (dados.tipoProduto() != null) {

               this.tipoProduto = dados.tipoProduto();
           }

           if (dados.marcaCaracteristicasProdutos() != null) {

               this.marcaCaracteristicasProdutos = dados.marcaCaracteristicasProdutos();
           }

           if ( dados.precoProduto()  != 0) {

               this.precoProduto = dados.precoProduto();
           }

           if (dados.coficacaoInterna() != 0) {

               this.codificacaoInterna = dados.coficacaoInterna();


           }

       }




       }



