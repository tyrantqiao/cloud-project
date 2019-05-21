drop table user;
CREATE TABLE user
(
    id       int primary key auto_increment,
    username varchar(60),
    password varchar(60)
)default charset utf8mb4