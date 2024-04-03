package bloomingHealth.com.MongoDBAtlasConnection.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public record Address(
        @Id String _id,
        String address_Id,
        String house_address,
        String nearest_point,
        String city,
        String State
) {
}
