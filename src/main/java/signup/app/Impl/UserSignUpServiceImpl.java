package signup.app.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import signup.app.UserSignUpService;
import signup.entity.UserSignInRequest;
import signup.mapper.UserSignUpMapper;

public class UserSignUpServiceImpl implements UserSignUpService {

    @Autowired
    UserSignUpMapper userSignUpMapper;

    @Override
    public boolean emailExits(String email) {
        String s = userSignUpMapper.emailExits(email);
        if(s.equals(null)) return false;
        return true;
    }

    @Override
    public void addUserSignUp(UserSignInRequest request) {
        if(emailExits(request.getEmail()))
            userSignUpMapper.addUserSignUp(request);
    }

}
