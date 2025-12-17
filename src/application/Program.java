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
        double amount = 0;

        Bank bk = new Bank(actNumber, actHolder, amount);

        if (choiceDeposit.equals("n")) {
            bk.updatedData();
        } else if (choiceDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            bk.deposit(amount); // faz chamada de mudança do set
            bk.updatedData();
        } else {
            System.out.println("--try again--");
            return;
        }

        // DEPOSIT VALUE
        System.out.print("Enter a deposit value: ");
        amount = sc.nextDouble();
        bk.deposit(amount);
        bk.updatedData();

        //  WITHDRAW VALUE
        System.out.print("Enter a withdraw value: ");
        double remove = sc.nextDouble();
        bk.withdraw(remove);
        bk.updatedData();


        sc.close();
    }
}
