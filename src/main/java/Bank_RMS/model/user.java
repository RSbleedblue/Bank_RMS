package Bank_RMS.model;

import org.springframework.data.annotation.Id;
public class user {
    private String firstname;
    private String lastname;
    @Id
    private String username;
    private String AccountType;
    private String password;
    public user(){
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }
    @Override
    public String toString() {
        return "user{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
