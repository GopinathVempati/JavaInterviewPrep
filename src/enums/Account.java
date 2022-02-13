package enums;

public class Account {
   private double amount;
    private String name;
    private AccountType accountType;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Account(double amount, String name, AccountType accountType) {
        this.amount = amount;
        this.name = name;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}
