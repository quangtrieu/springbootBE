package TCS.Platform.cdp.database;

import TCS.Platform.cdp.repositories.ProductRepository;
import TCS.Platform.cdp.repositories.RoleRepository;
import TCS.Platform.cdp.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Now conect with mysql using JPA
/*
docker run -d --rm --name mysql-spring-boot-tutorial \
-e MYSQL_ROOT_PASSWORD=123456 \
-e MYSQL_USER=trieulq \
-e MYSQL_PASSWORD=123456 \
-e MYSQL_DATABASE=test_db \
-p 3309:3306 \
--volume mysql-spring-boot-tutorial-volume:/var/lib/mysql \
mysql:latest

mysql -h localhost -p 3309 --protocol=tcp -u trieulq -p

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
* */
@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(RoleRepository roleRepository, UserRepository userRepository, ProductRepository productRepository){
        return new CommandLineRunner(){
            @Override
            public void run(String... args) throws Exception {
//                Product productA = new Product("macbook air m1", 2021, 2500.0,"");
//                Product productB = new Product("macbook Pro m1", 2021, 3500.0,"");
//                logger.info("insert data:" +productRepository.save(productA));
//                logger.info("insert data:" +productRepository.save(productB));
            }
        };
    }
}
