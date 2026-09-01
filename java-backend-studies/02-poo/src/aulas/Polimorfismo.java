package aulas;

import Entities.Account;
import Entities.SavingsAccount;

public class Polimorfismo {
    static void main() {
        Account x = new Account(1020, "Gizele", 1500.0);
        Account y = new SavingsAccount(1452, "Jose", 1500.0,0.02);

        x.withdraw(150.0);
        y.withdraw(150.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
