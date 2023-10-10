package ie.atu.labweek3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){

        return "Valid";
    }

}
