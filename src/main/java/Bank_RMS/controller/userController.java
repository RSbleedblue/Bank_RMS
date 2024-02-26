package Bank_RMS.controller;

import Bank_RMS.model.user;
import Bank_RMS.repository.userRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    private final Bank_RMS.repository.userRepo userRepo;

    public userController(userRepo userRepo) {
        this.userRepo = userRepo;
    }
    @PostMapping("/api/register")
    public user createUser(@RequestBody user newUser){
        System.out.println(newUser.getFirstname());
        return userRepo.save(newUser);
    }
    @GetMapping("/api/users")
    public List<user> getUsers(){
        List<user> users = userRepo.findAll();
        return users;
    }
}
