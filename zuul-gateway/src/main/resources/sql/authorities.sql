create table authorities (
	id int(10),
	username varchar(255) not null,
	authority varchar(255) not null,
	primary key(id)
);

insert into authorities values(1,'admin','ROLE_ADMIN');
insert into authorities values(2,'user','ROLE_USER');