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

    // numero da conta n pode ser alterado
    // public void setActNumber(int actNumber) {
    //     this.actNumber = actNumber;
    // }

    public String getActHolder() {
        return actHolder;
    }

    // set ativado pois titular pode alterar de nome em futuras atualizacoes
    public void setActHolder(String actHolder) {
        this.actHolder = actHolder;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    // metodo deposit
    public void setDeposit(double amount){
        currency += amount;
    }

    public void setWithDraw(double remove){
        currency = currency - remove - 5;
    }

    public void updatedData(){
        System.out.println("Updated account data: ");
        System.out.printf("Account %d, Holder: %s, balance: $ %.2f \n", getActNumber(), getActHolder(), getCurrency() );
    }


}
