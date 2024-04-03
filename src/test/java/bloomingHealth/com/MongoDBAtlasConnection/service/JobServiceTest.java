package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import bloomingHealth.com.MongoDBAtlasConnection.models.Job;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JobServiceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JobService jobService;


    @Test
    public void saveEntityTest(){
        Job job = new Job("3",
                "employee_3",
                "SDE-3");

        jobService.insertUsers(job);
    }
}
