package securityLogin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import securityLogin.entity.UserRequest;
import securityLogin.entity.UserResponse;

@Mapper
public interface UserMapper {
    Boolean userExits(String userName);
    UserResponse userDetails(@RequestBody UserRequest request);
}