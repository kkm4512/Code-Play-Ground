package getterSetter.시나리오2;

public class User {
    private String name;
    private String email;
    private String password;

    public User(RequestUserDto signUpUser) {
        this.name = signUpUser.getName();
        this.email = signUpUser.getEmail();
        this.password = signUpUser.getPassword();
    }

    public void validate() {
        Validator.validateEmail(this.email);
        Validator.validatePassword(this.password);
    }
}
