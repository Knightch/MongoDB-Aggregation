package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Users;
import bloomingHealth.com.MongoDBAtlasConnection.repository.AddressRepository;
import bloomingHealth.com.MongoDBAtlasConnection.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsersRepository usersRepository;

    public Users insertUsers(Users users) {
        return usersRepository.save(users);
    }

}
