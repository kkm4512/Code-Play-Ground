package bank.시나리오.시나리오1;

import java.util.List;

/**
 * 잔액과 거래기록을 관리하고, 돈을 입금하거나 출금하는 기능
 */
public class Account {
    private long money;
    private final TransactionHistory history = new TransactionHistory();


    public Account(long money) {
        this.money = money;
    }

    /**
     * 입금
     * @param amount 입금할 돈
     */
    void deposit(long amount) {
        money+=amount;
        history.addTransaction("입금: " + amount + " 잔액: " + money);
    }

    /**
     * 출금
     * @param amount 출금할 돈
     */
    void withdraw(long amount) {
        money-=amount;
        history.addTransaction("출금: " + amount + " 잔액: " + money);
    }

    /**
     * 이체
     * @param target 어떤 계좌로 이체 시킬지
     * @param amount 얼마를 이체 할지
     */
    void transferTo(Account target, long amount) {
        this.withdraw(amount);
        target.deposit(amount);
    }

    List<String> getAllTransactions(){
        return history.getAllTransactions();
    }
}
