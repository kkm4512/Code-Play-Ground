package getterSetter.시나리오1;

class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // 인출하는 메서드
    public void withdraw(int id, long amount) {
        Account account = accountRepository.findById(id);

        if (account.getBalance() < amount) {
            throw new IllegalArgumentException("잔액 부족");
        }
        account.setBalance(account.getBalance() - amount);
    }
}
