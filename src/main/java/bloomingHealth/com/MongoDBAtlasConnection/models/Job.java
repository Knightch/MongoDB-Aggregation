package bloomingHealth.com.MongoDBAtlasConnection.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "job")
public record Job(
        @Id String _id,
        String employee_Id,
        String designation
) {
}
