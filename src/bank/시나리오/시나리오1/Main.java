package bank.시나리오.시나리오1;

public class Main {
    public static void main(String[] args) {
        Account user = new Account(50000);
        Account admin = new Account(250000);
        user.transferTo(admin,10000);
        for ( String s : user.getAllTransactions() ) {
            System.out.println(s);
        }
        for ( String s : admin.getAllTransactions() ) {
            System.out.println(s);
        }
    }
}
