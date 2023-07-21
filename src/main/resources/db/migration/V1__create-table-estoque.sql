create table estoque(

    id bigint not null auto_increment,
    Entrada_Qtd varchar(100) not null,
    Entrada_Prc varchar(100)  not null,
    Saida_Qtd varchar(100) not null,
    Saida_Prc varchar(100)not null,
    Saldo_Qtd varchar(100) not null,
    Saldo_Prc varchar(100) not null,
    data varchar(100) not null,
    registro varchar(100) not null,


    primary key(id)

);