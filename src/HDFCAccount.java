import java.util.UUID;

public class HDFCAccount implements BankInterface{

    private final String accountNo;
    private String name;
    private String acoountNo;
    private String password;
    private int balance;
    private double rateOfInterest;

    public HDFCAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 7.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAcoountNo(String acoountNo) {
        this.acoountNo = acoountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositeMoney(int amount) {
        this.balance += amount;
        return "money added successfully";
    }

    @Override
    public String withdraw(int amount, String enterPassword) {
        if(enterPassword.equals(this.password)){
            if(balance < amount){
                return "insufficient balance";
            }
            else{
                this.balance -= amount;
                return "money deducted";
            }
        }
        else{
            return "password is incorrect";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
