package bloomingHealth.com.MongoDBAtlasConnection.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public record Users(
        @Id String _id,
        String employee_Id,
        String address_Id,
        String college_Id,
        String first_name,
        String last_name

) {
}
