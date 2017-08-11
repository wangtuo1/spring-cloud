create table users (
	id int(10),
	username varchar(255) not null,
	password varchar(255) not null,
	enabled bit(1) not null,
	primary key(id)
);

insert into users values(1,'admin','admin',1);
insert into users values(2,'user','password',1);