create table contactos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    sobrenome varchar(80) not null,
    email varchar(100),
    celular varchar(20) not null,
    celular_2 varchar(20),
    categoria varchar(20) not null,

    primary key (id)
);