package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import bloomingHealth.com.MongoDBAtlasConnection.models.College;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CollegeServiceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CollegeService collegeService;


    @Test
    public void saveEntityTest(){
        College college = new College("3",
                "college_3",
                "dfg college");

        collegeService.insertCollege(college);
    }
}
