public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4.0%
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        String base = bankAccount.showBenefits();
        return base + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = getBalance();
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}