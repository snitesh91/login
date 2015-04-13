
create table app_user(
id SERIAL primary key ,
user_name varchar(256) unique not null, 
password varchar(256) not null, 
is_admin boolean,
email_id varchar(45) unique,
contact_no varchar(11) unique, 
address varchar(256),
failed_login_attempts integer,
active boolean , 
date_created timestamp, 
date_modified timestamp,
last_password_updated_time timestamp,
last_login_time timestamp
);

insert into app_user values (1,'admin','admin123',true,'snitesh91@gmail.com','9873740900','',0,true,now(),now(),now(),null);