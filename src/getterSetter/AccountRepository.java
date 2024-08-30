package getterSetter;

public class AccountRepository {
    Account findById(int id){
        return new Account(id);
    }
}
