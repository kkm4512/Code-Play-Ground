package getterSetter.시나리오2;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String signup(RequestUserDto signUpUser){
        User user = new User(signUpUser);
        user.validate();
        return "회원가입을 축하합니다 !";
    }
}
