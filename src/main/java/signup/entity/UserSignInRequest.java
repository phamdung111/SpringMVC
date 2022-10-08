package signup.entity;

import lombok.Data;

@Data
public class UserSignInRequest {
    private String email;

    private String password;

    private String fullName;

    private String userName;

    private String address;

    private String phoneNumber;
}
