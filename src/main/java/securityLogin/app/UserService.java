package securityLogin.app;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import securityLogin.entity.UserRequest;
import securityLogin.entity.UserResponse;
@Service
public interface UserService {

    Boolean UserExits(String user);
    ResponseEntity<UserResponse> userDetail(@RequestBody UserRequest request);
}
