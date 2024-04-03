package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Users;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UsersServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UsersService usersService;


    @Test
    public void saveEntityTest(){
        Users users = new Users("9",
                "employee_3",
                "address_3",
                "college_3",
                "papa ki",
                "pari");

        usersService.insertUsers(users);
    }


}
