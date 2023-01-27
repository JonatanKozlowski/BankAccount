package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        System.out.println("Witaj na swoim koncie bankowym!");
        System.out.println("Jeśli chesz zobaczyć stan konta napisz: '1'. ");
        System.out.println("Jeśli chesz wypłacić pieniądze napisz: '2'. ");
        System.out.println("Jeśli chesz wpłacić pieniądze na konto napisz: '3'. ");

    }
    static class BankAccount
    {
        boolean wplac(int ile)
        {
           if (ile < 0){
               saldo += ile;
               return true;
           }else
               return false;

        }
        boolean wyplac(int ile)
        {
            if(saldo < ile)
                return false;
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