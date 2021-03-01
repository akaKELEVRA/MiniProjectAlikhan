package Lection15;

import java.util.ArrayList;

public class Main4 {
    public static void main (String[] args) {

        BankApplication bankapp1 = new BankApplication ("Bank 1");
        bankapp1.addAccount(new Account(1, "Name 1", "Surname 1", 100));
        bankapp1.addAccount(new Account(2, "Name 2", "Surname 2", 120));
        bankapp1.addAccount(new Account(3, "Name 3", "Surname 3", 140));
        bankapp1.addAccount(new Account(4, "Name 4", "Surname 4", 160));
        bankapp1.addAccount(new Account(5, "Name 5", "Surname 5", 180));
        bankapp1.addAccount(new Account(6, "Name 6", "Surname 6", 200));
        bankapp1.addAccount(new Account(7, "Name 7", "Surname 7", 220));
        bankapp1.addAccount(new Account(8, "Name 8", "Surname 8", 240));
        bankapp1.addAccount(new Account(9, "Name 9", "Surname 9", 260));
        bankapp1.addAccount(new Account(10, "Name 10", "Surname 10", 280));

        BankApplication bankapp2 = new BankApplication("Bank 2");
        bankapp2.addAccount(new Account(11, "Name 1-1", "Surname 1-1", 1000));
        bankapp2.addAccount(new Account(12, "Name 1-2", "Surname 1-2", 1100));
        bankapp2.addAccount(new Account(13, "Name 1-3", "Surname 1-3", 1200));
        bankapp2.addAccount(new Account(14, "Name 1-4", "Surname 1-4", 1300));
        bankapp2.addAccount(new Account(15, "Name 1-5", "Surname 1-5", 1400));
        bankapp2.addAccount(new Account(16, "Name 1-6", "Surname 1-6", 1500));
        bankapp2.addAccount(new Account(17, "Name 1-7", "Surname 1-7", 1600));
        bankapp2.addAccount(new Account(18, "Name 1-8", "Surname 1-8", 1700));
        bankapp2.addAccount(new Account(19, "Name 1-9", "Surname 1-9", 1800));
        bankapp2.addAccount(new Account(20, "Name 1-10", "Surname 1-10", 1900));

        BankApplication bankapp3 = new BankApplication("Bank 3");
        bankapp3.addAccount(new Account(21, "Name 2-1", "Surname 2-1", 2000));
        bankapp3.addAccount(new Account(22, "Name 2-2", "Surname 2-2", 2100));
        bankapp3.addAccount(new Account(23, "Name 2-3", "Surname 2-3", 2200));
        bankapp3.addAccount(new Account(24, "Name 2-4", "Surname 2-4", 2300));
        bankapp3.addAccount(new Account(25, "Name 2-5", "Surname 2-5", 2400));
        bankapp3.addAccount(new Account(26, "Name 2-6", "Surname 2-6", 2500));
        bankapp3.addAccount(new Account(27, "Name 2-7", "Surname 2-7", 2600));
        bankapp3.addAccount(new Account(28, "Name 2-8", "Surname 2-8", 2700));
        bankapp3.addAccount(new Account(29, "Name 2-9", "Surname 2-9", 2800));
        bankapp3.addAccount(new Account(30, "Name 2-10", "Surname 2-10", 2900));

        System.out.println(bankapp1.getBankData());

        int [] averageBalance = {(int)bankapp1.getAverageBalance(), (int)bankapp2.getAverageBalance(), (int)bankapp3.getAverageBalance()};
        for (int i = averageBalance.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (averageBalance[j] < averageBalance[i]) {
                    int temp = averageBalance[i];
                    averageBalance[i] = averageBalance[j];
                    averageBalance[j] = temp;
                }
            }
        }
        for (int i=0; i<averageBalance.length; i++) {
            System.out.println(averageBalance[i] + " ");
        }
    }
}
