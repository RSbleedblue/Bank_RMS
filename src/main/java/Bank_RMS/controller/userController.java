package Bank_RMS.controller;

import Bank_RMS.model.user;
import Bank_RMS.repository.userRepo;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class userController {
    private final Bank_RMS.repository.userRepo userRepo;

    public userController(userRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping("/api/register")
    public user createUser(@RequestBody user newUser) {
        String hashedPassword = BCrypt.hashpw(newUser.getPassword(),BCrypt.gensalt());
        newUser.setPassword(hashedPassword);
        return userRepo.save(newUser);
    }

    @GetMapping("/api/users")
    public List<user> getUsers() {
        List<user> users = userRepo.findAll();
        return users;
    }

    @PostMapping("/api/login")
    public ResponseEntity<Map<String,String>> loginUser(@RequestBody user userDetail) {

        user userFound = userRepo.findByUsername(userDetail.getUsername());
        Map<String,String> response = new HashMap<>();
        if(userFound == null){
            response.put("message","Not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
        if(BCrypt.checkpw(userDetail.getPassword(), userFound.getPassword())){
            response.put("message","User Found! with FirstName as: "+userFound.getFirstname());
            return ResponseEntity.ok(response);
        }
        response.put("message","Invalid user name or password");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
    }
}
