package bloomingHealth.com.MongoDBAtlasConnection.service;

import bloomingHealth.com.MongoDBAtlasConnection.models.Address;
import bloomingHealth.com.MongoDBAtlasConnection.models.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class AggregationService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MongoTemplate mongoTemplate;

    public Collection<Object> performLookupAggregation(String criteriaField, Object criteriaValue) {
        Criteria criteria = Criteria.where(criteriaField).is(criteriaValue); // Assuming _id is the field you're matching on

        AggregationOperation unwindAddress = Aggregation.unwind("$userAddress");
        AggregationOperation unwindCollege = Aggregation.unwind("$userCollege");
        AggregationOperation unwindJob = Aggregation.unwind("$userJob");

        Aggregation agg = Aggregation.newAggregation(
                Aggregation.match(criteria),
                Aggregation.lookup("address", "address_Id", "address_Id", "userAddress"),
                unwindAddress,
                Aggregation.lookup("college", "college_Id", "college_Id", "userCollege"),
                unwindCollege,
                Aggregation.lookup("job", "employee_Id", "employee_Id", "userJob"),
                unwindJob
        );

        AggregationResults<Users> results = mongoTemplate.aggregate(agg, "users", Users.class);
        return results.getRawResults().values();
    }
}
