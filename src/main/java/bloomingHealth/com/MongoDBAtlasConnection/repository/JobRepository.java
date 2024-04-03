package bloomingHealth.com.MongoDBAtlasConnection.repository;

import bloomingHealth.com.MongoDBAtlasConnection.models.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, String> {
}
