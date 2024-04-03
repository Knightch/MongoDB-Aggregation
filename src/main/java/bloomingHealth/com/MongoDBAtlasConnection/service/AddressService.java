package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import bloomingHealth.com.MongoDBAtlasConnection.repository.AddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AddressRepository addressRepository;

    public Address insertUsers(Address address) {
        return addressRepository.insert(address);
    }
}
