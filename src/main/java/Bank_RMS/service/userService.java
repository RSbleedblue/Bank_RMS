package Bank_RMS.service;

import Bank_RMS.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private userRepo userRepo;


}
