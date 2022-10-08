package signup.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import signup.app.UserSignUpService;
import signup.entity.UserSignInRequest;

@RestController
public class UserSignUpController {
    @Autowired
    UserSignUpService userSignUpService;
    @PostMapping("/signup")
    public void signup(UserSignInRequest request){
        userSignUpService.addUserSignUp(request);
    }
}
