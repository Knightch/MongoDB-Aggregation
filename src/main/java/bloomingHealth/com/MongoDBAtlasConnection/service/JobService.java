package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import bloomingHealth.com.MongoDBAtlasConnection.models.Job;
import bloomingHealth.com.MongoDBAtlasConnection.repository.AddressRepository;
import bloomingHealth.com.MongoDBAtlasConnection.repository.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JobRepository jobRepository;

    public Job insertUsers(Job job) {
        return jobRepository.save(job);
    }
}
