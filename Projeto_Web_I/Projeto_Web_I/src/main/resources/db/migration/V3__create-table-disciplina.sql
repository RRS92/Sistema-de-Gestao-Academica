create table disciplina(
id bigint not null auto_increment,
carga_horaria int not null,
nome varchar(100) not null,
professor int not null,
quantidade_alunos int not null,


primary key(id)
);