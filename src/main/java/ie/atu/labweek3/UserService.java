package ie.atu.labweek3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private EmailService emailService;

    @Autowired
    public UserService() {
        this.emailService = new EmailService();

    }
    public void registerUser(String username, String email){

        emailService.sendEmail("Welcome to our platform ", email);
    }
}
