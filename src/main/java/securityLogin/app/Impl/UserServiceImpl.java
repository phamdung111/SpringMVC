package securityLogin.app.Impl;

import lombok.AllArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import securityLogin.app.UserService;
import securityLogin.entity.UserRequest;
import securityLogin.entity.UserResponse;
import securityLogin.mapper.UserMapper;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final SessionFactory sessionFactory;

    @Override
    public Boolean UserExits(String user) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> userDetail(@RequestBody UserRequest request) {
        UserResponse userResponse = userMapper.userDetails(request);
        return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
    }
}
