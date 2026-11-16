package exceptions;
/*
   Custom Exceptions
 */
class DataException extends Exception{
    //constructor
    public DataException(String message){
        super(message);
    }
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}



class Account2{

    private  int accNo;
    private double balance;

    public Account2(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }


    public void withdraw(double amount) throws DataException,InsufficientFundsException{
        if (amount <= 0){
            throw new DataException("amount can't be negative");
        }

        double newBalance = balance - amount;
        if (newBalance < 0){
            throw new InsufficientFundsException ("Insufficient funds");
        }
        //update the balance
        balance = newBalance;
    }
}


public class ExceptionHandlingEx3 {


    public static void main(String[] args) {

        Account2  acc1 = new Account2(1, 1000);
        try{
            acc1.withdraw(-500);
            System.out.println("withdraw success");
        }catch (DataException  e){
            // handler for DataException
            System.err.println("failed with DataException");
            e.printStackTrace();
        }catch(InsufficientFundsException e){
            System.out.println("failed with InsufficientFundsException");
            e.printStackTrace();
        }
            // handler for DataException
    }
}
