package securityLogin.entity;

import lombok.Data;

@Data
public class UserRequest {

    private String user;

    private String password;
}
