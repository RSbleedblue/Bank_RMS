package Bank_RMS.repository;

import Bank_RMS.model.user;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface userRepo extends MongoRepository<user,String> {
    @Query("{ 'username': ?0, 'password' : ?1}")
    user findByUsernameandPassword(String username, String password);
    @Query("{'username': ?0}")
    user findByUsername(String username);
}
