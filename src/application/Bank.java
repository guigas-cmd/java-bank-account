package application;

public class Bank {
    private int actNumber;
    private String actHolder;
    private double currency;

    // CONSTRUCTOR
    public Bank(int actNumber, String actHolder, double currencyActValue) {
        this.actNumber = actNumber;
        this.actHolder = actHolder;
        this.currency = currencyActValue;
    }

    public int getActNumber() {
        return actNumber;
    }


    public String getActHolder() {
        return actHolder;
    }

    public double getCurrency() {
        return currency;
    }

    // metodo deposit
    public void deposit(double amount) {
        currency += amount;
    }

    public void withdraw(double remove) {
        currency = currency - remove - 5;
    }

    public void updatedData() {
        System.out.println("Updated account data: ");
        System.out.printf("Account %d, Holder: %s, balance: $ %.2f \n", getActNumber(), getActHolder(), getCurrency());
    }


}
