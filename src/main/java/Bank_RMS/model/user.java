package Bank_RMS.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "user")
@Getter @Setter
public class user {
    @Id
    private String id;
    @NotNull(message = "FirstName cannot be null.")
    private String firstname;
    @NotNull(message = "LastName cannot be null.")
    private String lastname;
    @NotNull(message = "Username cannot be null.")
    private String username;
    @NotNull(message = "AccountType cannot be null.")
    private String AccountType;
    @NotNull(message = "Password cannot be null.")
    private String password;
    @NotNull(message = "DOB cannot be null.")
    private Date dob;
}
