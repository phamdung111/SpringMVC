package signup.mapper;

import org.apache.ibatis.annotations.Mapper;
import signup.entity.UserSignInRequest;

@Mapper
public interface UserSignUpMapper {

    String emailExits(String email);

    void addUserSignUp(UserSignInRequest request);

}
