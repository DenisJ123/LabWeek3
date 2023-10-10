package ie.atu.labweek3;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/newUser1/{name}/{email}")

    public String getUser(@PathVariable String name, @PathVariable String email){
        userService.registerUser(name, email);
        return "Valid";

    }

    @PostMapping("/newUser1")
    public String getUser (@RequestBody User denis) {
        userService.registerUser(denis.getName(), denis.getEmail());

        return "Done";
    }

}
