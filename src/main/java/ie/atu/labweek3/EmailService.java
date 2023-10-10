package ie.atu.labweek3;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message){
        System.out.println(" " + message);


    }
}
