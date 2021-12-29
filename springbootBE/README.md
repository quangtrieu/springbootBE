Java Spring boot:

docker run -d --rm --name mysql-spring-boot-tutorial -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_USER=trieulq -e MYSQL_PASSWORD=123456 -e MYSQL_DATABASE=test_db -p 3309:3306 --volume mysql-spring-boot-tutorial-volume:/var/lib/mysql mysql:latest

show databases;

use test_db;
show tables;

git: https://github.com/quangtrieu/springbootBE.git
JWT.