package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddressServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AddressService addressService;


    @Test
    public void saveEntityTest(){
        Address address = new Address("3",
                "address_3",
                "phullgao",
                "gji",
                "xtr",
                "fhg");

        addressService.insertUsers(address);
    }
}
