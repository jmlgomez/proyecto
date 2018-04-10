DROP schema IF EXISTS telefonia;
create schema telefonia;
use telefonia;

CREATE TABLE departamentosAyto (
  idDepAyto int(11) NOT NULL AUTO_INCREMENT,
  nomDepartamento varchar (70) NOT NULL,
  PRIMARY KEY (idDepAyto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE empresasAyto (
  idEmpAyto int(11) NOT NULL AUTO_INCREMENT,
  nomEmpresa varchar (70) NOT NULL,
  idDepAyto int(11),
  PRIMARY KEY (idEmpAyto),
  foreign key (idDepAyto) references departamentosAyto(idDepAyto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE usuarios (
  idUsuario int(11) NOT NULL AUTO_INCREMENT,
  nombreusuario varchar (70) NOT NULL,
  nombre varchar (70) NOT NULL,
  primerApellido varchar (70) NOT NULL,
  segundoApellido varchar (70) ,
  dni varchar (70) unique NOT NULL,
  correo varchar (70) NOT NULL,
  idEmpAyto int(11),
  PRIMARY KEY (idUsuario),
  foreign key (idEmpAyto) references empresasAyto(idEmpAyto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tipostarifas (
  idtipotarifa int(11) NOT NULL AUTO_INCREMENT,
  tipotarifa varchar (70) NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idtipotarifa)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tipostarjetas(
  idtipotarjeta int(11) NOT NULL AUTO_INCREMENT,
  tipotarjeta varchar (70) NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idtipotarjeta)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE numeros(
  idnumero int(11) NOT NULL AUTO_INCREMENT,
  numcorto varchar (70) unique NOT NULL,
  numlargo varchar (70) unique NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idnumero)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE marcas(
  idmarca int(11) NOT NULL AUTO_INCREMENT,
  marca varchar (70) NOT NULL,
  activo boolean default true,
  PRIMARY KEY (idmarca)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tiposdispositivos(
  idtipodispositivo int(11) NOT NULL AUTO_INCREMENT,
  tipo varchar (70) NOT NULL,
  activo boolean default true,
  PRIMARY KEY (idtipodispositivo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE estados(
  idestado int(11) NOT NULL AUTO_INCREMENT,
  estado varchar (70) default "Almacen",
  activo boolean default true,
  PRIMARY KEY (idestado)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE operadores(
  idoperador int(11) NOT NULL AUTO_INCREMENT,
  usuariooperador varchar (70) NOT NULL,
  PRIMARY KEY (idoperador)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tarjetas(
  idtarjeta int(11) NOT NULL AUTO_INCREMENT,
  pin int (8) NOT NULL,
  puk int (8) NOT NULL,
  icc varchar (40) unique NOT NULL,
  tipo varchar (70) NOT NULL,
  disponible boolean default true,
  historialaveria varchar (250),
  observaciones varchar (250),
  idtipotarifa int(11),
  idtipotarjeta int(11),
  idnumero int(11),
  PRIMARY KEY (idtarjeta),
  foreign key (idtipotarifa)  references tipostarifas(idtipotarifa),
  foreign key (idtipotarjeta)  references tipostarjetas(idtipotarjeta),
  foreign key (idnumero)  references numeros(idnumero)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE terminales(
  idterminal int(11) NOT NULL AUTO_INCREMENT,
  modelo varchar (80) NOT NULL,
  imei varchar (90) unique NOT NULL,
  cambioimei varchar (90),
  numserie varchar (90) unique,
  observaciones varchar (250),
  idmarca int(11),
  idtipodispositivo int(11),
  idestado int(11),
  PRIMARY KEY (idterminal),
  foreign key (idmarca) references marcas(idmarca),
  foreign key (idtipodispositivo) references tiposdispositivos(idtipodispositivo),
  foreign key (idestado) references estados(idestado)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE averiasterminales(
  idaveriasterminal int(11) NOT NULL AUTO_INCREMENT,
  fechaaveria date,
  fechaentrega date,
  icc varchar (40) NOT NULL,
  imeiantiguo varchar (90) NOT NULL,
  imeinuevo varchar (90) NOT NULL,
  enviadoreparar boolean default false,
  observaciones varchar (250),
  idoperador int(11),
  PRIMARY KEY (idaveriasterminal),
  foreign key (idoperador)  references operadores(idoperador),
  foreign key (imeiantiguo) references terminales(imei),
  foreign key (imeinuevo) references terminales(imei)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE averiassim(
  idaveriassim int(11) NOT NULL AUTO_INCREMENT,
  fechaaveriasim date,
  fechaentregasim date,
  tarjetaantigua int (11) NOT NULL,
  tarjetanueva int (11) NOT NULL,
  observaciones varchar (250),
  idoperador int(11),
  PRIMARY KEY (idaveriassim),
  foreign key (idoperador) references operadores(idoperador),
  foreign key (tarjetaantigua) references tarjetas(idtarjeta),
  foreign key (tarjetanueva) references tarjetas(idtarjeta)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE entregas(
  identrega int(11) NOT NULL AUTO_INCREMENT,
  fechaentrega date NOT NULL,
  firmarecepcion varchar (40) NOT NULL,
  observaciones varchar (250),
  idterminal int(11),
  idtarjeta int(11),
  idusuario int(11),
  idoperador int(11),
  PRIMARY KEY (identrega),
  foreign key (idterminal) references terminales(idterminal),
  foreign key (idtarjeta) references tarjetas(idtarjeta),
  foreign key (idusuario) references usuarios(idusuario),
  foreign key (idoperador) references operadores(idoperador)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE histestados(
  idhistestado int(11) NOT NULL AUTO_INCREMENT,
   fechahistestado date,
   tipohistestado varchar (40),
   descripcionhistestado varchar (250),
  idterminal int(11),
  idestado int(11),
  PRIMARY KEY (idhistestado),
  foreign key (idterminal) references terminales(idterminal),
  foreign key (idestado) references estados(idestado)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;