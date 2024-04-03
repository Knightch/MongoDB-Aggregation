package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import bloomingHealth.com.MongoDBAtlasConnection.models.Users;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.List;

@SpringBootTest
public class AggregationServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AggregationService aggregationService;

    @Test
    public void performLookupAggregationTest(){
        Collection<Object> response = aggregationService.performLookupAggregation("_id","1");
        response.stream().forEach(element -> logger.info(element.toString()));
    }
}
