package securityLogin.rest;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import securityLogin.app.UserService;
import securityLogin.entity.UserRequest;
import securityLogin.entity.UserResponse;

@RestController
@AllArgsConstructor
public class LoginController {
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserResponse> login(@RequestBody UserRequest request){
        return userService.userDetail(request);
    }
    @GetMapping("/hello")
    public String string(){
        return "hello";
    }
}
