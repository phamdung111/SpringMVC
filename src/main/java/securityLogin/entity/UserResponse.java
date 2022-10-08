package securityLogin.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private int userId;

    private String password;

    private String address;

    private String phoneNumber;

    private String email;

    private String name;

    private List<String> role;
}
