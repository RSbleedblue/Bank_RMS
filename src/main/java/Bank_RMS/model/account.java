package Bank_RMS.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "account")
@Getter @Setter
public class account {
    @Id
    private String aadhaar_no;
    @NotBlank(message = "User ID cannot be null.")
    private String userId;
    @NotBlank(message = "Aadhaar Image cannot be null.")
    private String aadhaar_url;
    @NotBlank(message = "Pan Number cannot be null.")
    private String pan_no;
    @NotBlank(message = "Pan image cannot be null.")
    private String pan_url;

    public enum AccountType {
        SAVINGS,
        CURRENT,
        OTHER
    }

    private AccountType accountType;

    @NotNull(message = "Initial Deposit cannot be null.")
    private int initialDeposit;
    @NotNull(message = "Loan Count cannot be null.")
    private int activeLoanCount;
}
