
create table app_user(
id SERIAL primary key ,
user_name varchar(256) unique not null, 
password varchar(256) not null, 
access_id integer[] ,
email_id varchar(45) unique,
contact_no varchar(11) unique, 
address varchar(256),
failed_login_attempts integer,
active boolean , 
date_created timestamp, 
date_modified timestamp,
password_updated_date timestamp
);

create table role_group (
id SERIAL primary key,
role_name varchar(256) not null
);


insert into role_group (role_name) values ('ROLE_BLOCK');
insert into role_group (role_name) values ('ROLE_USER');
insert into role_group (role_name) values ('ROLE_ADMIN');
insert into role_group (role_name) values ('ROLE_SUPER_ADMIN');
