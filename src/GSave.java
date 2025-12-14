public class GSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025; // 2.5%
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        // base benefits from the wrapped account plus extra benefit
        String base = bankAccount.showBenefits();
        return base + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = getBalance();
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        // reuse the wrapped account's info
        return bankAccount.showInfo();
    }
}