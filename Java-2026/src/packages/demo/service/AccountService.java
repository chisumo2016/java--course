package packages.demo.service;

public class AccountService {
    private AccountInternalService accountInternalService = new AccountInternalService();

    public void openAccount() {
        System.out.println("opening an account" + accountInternalService.generateAccountID());
    }
    public void closeAccount() {
        System.out.println("closing an account");
    }
}
