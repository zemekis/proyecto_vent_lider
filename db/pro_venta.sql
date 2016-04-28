CREATE DATABASE pro_venta;
USE pro_venta;
--drop database pro_venta;

create table usuario(
id_usuario int auto_increment,
nombre_usuario varchar(50),
password_usuario varchar(50),
primary key(id_usuario)
);

insert into usuario values(null, 'Patricio Perez', 'pprezp');

create table marca(
id_marca int auto_increment,
nombre_marca varchar(50),
primary key(id_marca)
);
 
create table tipo(
id_tipo int auto_increment,
nombre_tipo varchar(50),
primary key(id_tipo)
);

create table producto(
id_producto int auto_increment,
nombre_producto varchar(50),
precio_producto int,
stock_producto int,
marcaFK int ,
tipoFK int,
primary key(id_producto),
foreign key(marcaFK) references marca(id_marca) on delete cascade,
foreign key(tipoFK) references tipo(id_tipo) on delete cascade
);

create table tipocliente(
id_tipoCliente int auto_increment,
nombre_tipoCliente varchar(50),
primary key (id_tipoCliente)
);

insert into tipocliente values(null, 'Normal');
insert into tipocliente values(null, 'Corriente');

create table cliente(
rut_cliente varchar(20),
nombre_cliente varchar(50),
tipo_clienteFK int,
primary key (rut_cliente),
foreign key (tipo_clienteFK) references tipoCliente(id_tipoCliente)
);

insert into cliente values('19.210.066-6', 'Luis Herrera', 2);
insert into cliente values('19.222.222.3', 'Luis Martinez', 1);
insert into cliente values('15.111.333-4','Pablo Figueroa', 1);

create table metodopago(
id_metodoPago int auto_increment,
nombre_metodoPago varchar(50),
primary key (id_metodoPago)
);

insert into metodopago values(null, 'Cheque');
insert into metodopago values(null, 'Efectivo');
insert into metodopago values(null, 'Junaeb');
insert into metodopago values(null, 'Factura');

create table venta(
id_venta int auto_increment,
direccionLocal_venta varchar(50),
fecha_venta timestamp,
metodo_pagoFK int,
id_usuarioFK  int,
rut_clienteFK varchar(50),
primary key (id_venta),
foreign key (metodo_pagoFK)references metodoPago(id_metodopago),
foreign key (id_usuarioFK) references usuario(id_usuario),
foreign key (rut_clienteFK)references cliente(rut_cliente)
);

create table registrohistorico(
id_registroHistorico int auto_increment,
accion_registroHistorico varchar(50),
fecha_registroHistorico timestamp,
primary key(id_registrohistorico));


create table compra(
id_compra int auto_increment,
id_productoFK int,
id_ventaFK int,
cantidad int,
primary key (id_compra),
foreign key (id_productoFK) references producto(id_producto),
foreign key (id_ventaFK) references venta(id_venta)
);

/*
create table registroventa(
id_registroVenta int auto_increment,
fecha_registro timestamp,
id_ventaFK int,
primary key (id_registroventa),
foreign key (id_ventaFK) references venta(id_venta)
);
*/

insert into usuario values(null,'usuario1','user12345');

 drop database pro_venta;
-- drop table cliente;
-- drop table marca;
-- drop table metodoPago;
-- drop table producto;
-- drop table registrohistorico;

-- drop table tipo;
-- drop table tipocliente;
-- drop table usuario;
-- drop table venta;
show tables;
select * from usuario;
select * from tipo;
select * from marca;
select * from producto;
select * from venta;
select * from compra;