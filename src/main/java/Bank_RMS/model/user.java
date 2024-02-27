package Bank_RMS.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
public class user {
    private String firstname;
    private String lastname;
    private String username;
    private String AccountType;
    private String password;

}
