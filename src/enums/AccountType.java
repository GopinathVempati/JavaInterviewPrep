package enums;

public enum AccountType {
    SAVINGS(10000),
    CURRENT(20000),
    JOINT(400000);

    private final double minBal;
    AccountType(double minBal) {
        this.minBal = minBal;
    }

    public double getMinBal() {
        return minBal;
    }
}
