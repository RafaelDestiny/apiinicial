package estoque.controle.apiinicial.classebase;

import estoque.controle.apiinicial.estoques.EstoqueCadastroBaseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

  @Table(name= "estoque")
  @Entity(name = "EstoqueCadastroBase")
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  @EqualsAndHashCode(of = "id")


  public class EstoqueCadastroBase {
    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    Long id;

    @Column(name = "EntradaQtd")
    private double EntradaQtd;


    @Column(name = "EntradaPrc")
      private double EntradaPrc;

    @Column(name = "SaidaQtd")
      private double SaidaQtd;

    @Column(name = "SaidaPrc")
      private double SaidaPrc;

    @Column(name = "SaldoQtd")
    private double SaldoQtd;

      @Column(name = "SaldoPrc")
    private double SaldoPrc;

    private int data;

    private int registro;

    public EstoqueCadastroBase(EstoqueCadastroBaseDto dados) {

        EntradaQtd = dados.EntradaQtd();
        EntradaPrc = dados.EntradaPrc();
        SaidaQtd = dados.SaidaQtd();
        SaidaPrc = dados.SaidaPrc();
        SaldoQtd =  dados.SaldoQtd() ;
        SaldoPrc = dados.SaldoPrc();
        data = dados.data();
        registro = dados.registro();


    }


      public  void atualizarInformacoes(EstoqueCadastroBaseDto dados) {

          if(dados.EntradaQtd() != 0 ){

              this.EntradaQtd = dados.EntradaQtd();

          }

          if(dados.EntradaPrc() != 0){

              this.EntradaPrc = dados.EntradaPrc();

          }

          if(dados.SaidaQtd() != 0){

              this.SaidaQtd = dados.SaidaQtd();

          }

          if(dados.SaidaPrc() != 0){

              this.SaidaPrc = dados.SaidaPrc();

          }



    }




  }
