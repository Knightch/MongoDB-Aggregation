package bloomingHealth.com.MongoDBAtlasConnection.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "college")
public record College(
        @Id String _id,
        String college_Id,
        String college_name
) {
}
