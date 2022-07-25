create database Formula1;

use Formula1;

Create table Pilotos(codigo int not null primary key,

nome char(20) not null,

pais char(20),

idade int,

equipe char (20) not null,

motor char(20),

codigo_ranking int,

pontos int);

/* Carga na tabela Pilotos*/

Insert into Pilotos (codigo, nome, pais, idade, equipe, motor,codigo_ranking,pontos)

values (111, 'Sebastian Vettel', 'Alemanha', 25, 'Red Bull', 'Renault',1,256),

(112, 'Fernando Alonso', 'Espanha', 28, 'Ferrari', 'Ferrari',2,252),

(113, 'Mark Webber', 'Austria', 26, 'Red Bull', 'Renault',3,242),

(114, 'Lewis Hamilton', 'Inglaterra', 22, 'Maclaren', 'Mercedes',4,240),

(115, 'Jenson Button', 'Inglaterra', 21, 'Maclaren', 'Mercedes',5,214),

(116, 'Felipe Massa', 'Brasil', 27, 'Ferrari', 'Ferrari',6,144),

(117, 'Nico Rosberg', 'Alemanha', 24, 'Mercedes', 'Mercedes',7,142),

(118, 'Robert Kubica', 'Polonia', 21, 'Renault', 'Renault',8,136),

(119, 'Michael Schumacher', 'Alemanha', 23, 'Mercedes', 'Mercedes',9,72),

(120, 'Rubens Barrichello', 'Brasil', 29, 'Williams', 'Cosworth',10,47),

(121, 'Adrian Sutil', 'Alemanha', 24, 'Force India', 'Mercedes',11,47),

(122, 'Kamui Kobayashi', 'Japão', 23, 'Sauber', 'Ferrari',12,32),

(123, 'Vitaly Petrov', 'Russia', 22, 'Renault', 'Renault',13,27),

(124, 'Niko Hulkenberg', 'Alemanha', 20, 'Williams', 'Cosworth',14,22),

(125, 'Vitantonio Liuzzi', 'Italia', 25, 'Force India', 'Mercedes',15,21),

(126, 'Sebastien Buemi', 'Suiça', 16, 'ToroRosso', 'Ferrari',16,8),

(127, 'Pedro de la Rosa', 'Espanha', 22, 'Sauber', 'Ferrari',17,6),

(128, 'Nick Heidfield', 'Alemanha', 22, 'Sauber', 'Ferrari',18,6),

(129, 'Jaime Alguersuari', 'Espanha', 27, 'ToroRosso', 'Ferrari',19,5),

(130, 'Sakon Yamamoto', 'Japão', 20, 'Hispania', 'Cosworth',20,0),

(131, 'Lucas Grassi', 'Brasil', 25, 'Virgin', 'Cosworth',21,0),

(132, 'Jarno Trulli', 'Itália', 18, 'Lotus', 'Cosworth',22,0),

(133, 'Heikki Kovalainen', 'Finlandia', 19, 'Lotus', 'Cosworth',23,0),

(134, 'Timo Glock', 'Alemanha', 24, 'Virgin', 'Cosworth',24,0),

(135, 'Christien Klien', 'Austrália', 20, 'Hispania', 'Cosworth',25,0),

(136, 'Bruno Senna', 'Brasil', 21, 'Hispania', 'Cosworth',26,0),

(137, 'Kaun Chandinol', 'India', 20, 'Hispania', 'Cosworth',27,0),

(138, 'Lando Norris', 'Reino Unido', 20, 'MacLaren', 'Maclaren',28,24),

(139, 'Valteri Bottas', 'Finlândia', 30, 'Mercedes', 'Mercedes',29,69),

(140, 'Alexander Albon', 'Tailândia', 24, 'Red Bull', 'Renault',30,100);


Select * from Pilotos;