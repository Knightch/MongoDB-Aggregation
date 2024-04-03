package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.College;
import bloomingHealth.com.MongoDBAtlasConnection.repository.AddressRepository;
import bloomingHealth.com.MongoDBAtlasConnection.repository.CollegeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CollegeRepository collegeRepository;

    public College insertCollege(College college) {
        return collegeRepository.save(college);
    }
}
