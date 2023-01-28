package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj na swoim koncie bankowym!");
        System.out.println("Jeśli chesz zobaczyć stan konta napisz: '1'. ");
        System.out.println("Jeśli chesz wypłacić pieniądze napisz: '2'. ");
        System.out.println("Jeśli chesz wpłacić pieniądze na konto napisz: '3'. ");
        int choose = sc.nextInt();
        if(choose == 1){
            System.out.println("Twoje obecne saldo wynosi:" + bank.getSaldo());
        } else if (choose == 2) {
            System.out.println("Ile pieniędzy chcesz wypłacić?:");
            int ile1 = sc.nextInt();
            System.out.println(bank.wyplac(ile1));
            System.out.println("Twoje obecne saldo wynosi:" + bank.getSaldo());
        } else if (choose == 3) {
            System.out.println("Ile pieniędzy chcesz wpłacić?:");
            int ile2 = sc.nextInt();
            System.out.println(bank.wplac(ile2));
            System.out.println("Twoje obecne saldo wynosi:" + bank.getSaldo());
        }
    }
    static class BankAccount
    {
        boolean wplac(int ile)
        {
           if (ile > 0){
               saldo += ile;
               return true;
           }else
               return false;
        }
        boolean wyplac(int ile)
        {
            if(saldo < ile)
                return true;
            else
                saldo -= ile;
            return true;
        }
        private int saldo = 100;
        public int getSaldo()
        {
            return saldo;
        }
    }
}