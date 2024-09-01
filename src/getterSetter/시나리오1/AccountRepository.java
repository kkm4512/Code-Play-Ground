package getterSetter.시나리오1;

public class AccountRepository {
    Account findById(int id){
        return new Account(id);
    }
}
