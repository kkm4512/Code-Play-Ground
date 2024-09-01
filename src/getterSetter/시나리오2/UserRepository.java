package getterSetter.시나리오2;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }
}
