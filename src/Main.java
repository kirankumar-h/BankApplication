import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name,password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

       SBIAccount kiranAcc = new SBIAccount(name,balance,password);

        System.out.println("your SBIAccount has been created with account number:" +kiranAcc.getAccountNo());

        //getBalnce
        System.out.println("your current balnce is:" + kiranAcc.getBalance());

        //deposit
        System.out.println(kiranAcc.depositeMoney(500));
        System.out.println("New balance is:" +kiranAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn:");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enterpassword = sc.next();

        System.out.println(kiranAcc.withdraw(amount,enterpassword));

        //interest
        System.out.println("Interest for 4 years on current balance " +kiranAcc.getBalance()+ " is " +kiranAcc.calculateInterest(4));


        System.out.println("Enter your name,password and initial balance");
         name = sc.next();
         password = sc.next();
         balance = sc.nextInt();

        HDFCAccount kiran = new HDFCAccount(name,password,balance);

        System.out.println("your HDFCAccount has been created with account number:" +kiran.getAccountNo());

        //getBalnce
        System.out.println("your current balnce is:" + kiran.getBalance());

        //deposit
        System.out.println(kiran.depositeMoney(500));
        System.out.println("New balance is:" +kiran.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn:");
        amount = sc.nextInt();
        System.out.println("Enter your password");
         enterpassword = sc.next();

        System.out.println(kiran.withdraw(amount,enterpassword));

        //interest
        System.out.println("Interest for 4 years on current balance " +kiran.getBalance()+ " is " +kiran.calculateInterest(4));

    }
}