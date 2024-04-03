package bloomingHealth.com.MongoDBAtlasConnection.repository;

import bloomingHealth.com.MongoDBAtlasConnection.models.College;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollegeRepository extends MongoRepository<College, String> {
}
