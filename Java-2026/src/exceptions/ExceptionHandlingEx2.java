package exceptions;
/*
   Custom exception handling
     - Extend the Exception class
 */

class Account{
    private  int accNo;
    private double balance;

    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    /**
     * retruns 0 for successful  , 1 - insufficient funds , 2 - data error
     * @param amount
     * @return
     */
    public Status withdraw(double amount) {

        if (amount <= 0){
            return Status.DATA_ERROR;
        }

        double newBalance = balance - amount;
        if (newBalance > 0){
            balance = newBalance;
            return Status.SUCCESS;
        }
        return Status.INSUFFICIENT_FUNDS;
    }
}

enum Status{
    SUCCESS,
    INSUFFICIENT_FUNDS,
    DATA_ERROR
}
public class ExceptionHandlingEx2 {

    public static void main(String[] args) {

        Account account = new Account(1, 1000);
        Status withdrawStatus = account.withdraw(200);

        switch (withdrawStatus){
            case SUCCESS  -> System.out.println("Withdrawal result: " + withdrawStatus);
            case INSUFFICIENT_FUNDS  -> System.out.println("Insufficient funds: " + withdrawStatus);
            case DATA_ERROR  -> System.out.println("Data error: " + withdrawStatus);
        }

    }
}
