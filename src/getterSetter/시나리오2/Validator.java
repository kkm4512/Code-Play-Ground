package getterSetter.시나리오2;

public class Validator {
    public static void validateEmail(String email) {
        if(!email.contains("@")) throw new IllegalArgumentException("이메일이 유효하지 않습니다");
    }
    public static void validatePassword(String password){
        if(password.length() > 10) throw new IllegalArgumentException("비밀번호가 너무 깁니다");
    }
}
