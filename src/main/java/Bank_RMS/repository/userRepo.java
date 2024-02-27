package Bank_RMS.repository;

import Bank_RMS.model.user;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepo extends MongoRepository<user,String> {
}
