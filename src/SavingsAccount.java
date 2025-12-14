public class SavingsAccount implements BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;

    // setters and getters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // BankAccount methods

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01; // 1%
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account number: ").append(accountNumber).append("\n");
        sb.append("Account name: ").append(accountName).append("\n");
        sb.append("Balance: ").append(balance);
        return sb.toString();
    }
}