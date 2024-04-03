package bloomingHealth.com.MongoDBAtlasConnection.configs;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CertificateMongoConfig {
    @Bean
    public MongoClient certificateBasedMongoClient() throws Exception {
        System.setProperty("javax.net.ssl.keyStore", "src/main/resources/test.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "passme");
        String uri = "mongodb+srv://mycluster.d4fyj2k.mongodb.net/?authSource=%24external&authMechanism=MONGODB-X509&retryWrites=true&w=majority&appName=MyCluster";
        ConnectionString connectionString = new ConnectionString(uri);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        return MongoClients.create(settings);
    }
}
