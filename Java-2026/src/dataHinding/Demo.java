package dataHinding;


class Account{

    //data /state
    private double balance;

    //operations / behaviour

    public void withdraw(double amount){
        if((balance - amount) > 0){
            balance -= amount;
        }
    }

    public void deposit(double amount){
       if (amount > 0){
            balance += amount;
        }
    }

    double getBalance(){
        return balance;
    }
}
public class Demo {

    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.withdraw(1000);

        //acc1.balance = -9999; //modifify directly /avoid

        System.out.println(acc1.getBalance());

    }
}
