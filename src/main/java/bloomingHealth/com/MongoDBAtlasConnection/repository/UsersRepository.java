package bloomingHealth.com.MongoDBAtlasConnection.repository;

import bloomingHealth.com.MongoDBAtlasConnection.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
}
