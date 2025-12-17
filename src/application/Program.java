package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int actNumber = sc.nextInt();

        System.out.print("Enter account name holder: ");
        sc.nextLine(); // limpa buffer do scanner
        String actHolder = sc.nextLine();

        System.out.print("Is there a initial deposit? (y/n): ");
        String choiceDeposit = sc.next();
        double currency = 0;

        Bank bk = new Bank(actNumber, actHolder, currency);

        if (choiceDeposit.equals("n")) {
            System.out.println("Account data: ");
            System.out.printf("Account %d, Holder: %s, balance: $ %.2f \n", bk.getActNumber(), bk.getActHolder(), bk.getCurrency());
        } else if (choiceDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            currency = sc.nextDouble();
            bk.setCurrency(currency); // faz chamada de mudança do set
            System.out.println("Updated account data: ");
            System.out.printf("Account %d, Holder: %s, balance: $ %.2f \n", bk.getActNumber(), bk.getActHolder(), bk.getCurrency());
        } else {
            System.out.println("--try again--");
            return;
        }

        // DEPOSIT VALUE
        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        bk.setDeposit(amount);
        bk.updatedData();

        //  WITHDRAW VALUE
        System.out.print("Enter a withdraw value: ");
        double remove = sc.nextDouble();
        bk.setWithDraw(remove);
        bk.updatedData();


        sc.close();
    }
}
