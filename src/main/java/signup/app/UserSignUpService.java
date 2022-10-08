package signup.app;

import org.springframework.stereotype.Service;
import signup.entity.UserSignInRequest;

@Service
public interface UserSignUpService {
    boolean emailExits(String email);

    void addUserSignUp(UserSignInRequest request);
}
