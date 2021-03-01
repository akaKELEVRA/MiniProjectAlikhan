package Lection15;

import java.util.ArrayList;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount (Account a) {
        accounts.add(a);
    }

    public void removeAccount (int i) {
        for (int j=0; j<accounts.size(); j++) {
            accounts.remove(i);
        }
    }

    public Account getMaxAccount() {
        double maxBalance = 0;
        int b = 0;
        for (Account a1 : accounts) {
            if (a1.balance > maxBalance) {
                maxBalance = a1.balance;
                b = accounts.indexOf(a1);
            }
        }
        return accounts.get(b);
    }

    public double getAverageBalance() {
        double averageOfBalance = 0;
        double sumOfBalance = 0;
        for (Account a : accounts) {
            sumOfBalance += a.balance;
        }
        averageOfBalance = sumOfBalance / accounts.size();
        return averageOfBalance;
    }

    public double getTotalBalance() {
        int sumOfBalance = 0;
        for (Account a : accounts) {
            sumOfBalance += a.balance;
        }
        return sumOfBalance;
    }

    public int totalAccounts () {
        int sumOfAccounts = 0;
        for (Account a : accounts) {
            sumOfAccounts = accounts.size();
        }
        return sumOfAccounts;
    }

    public String getBankData () {
        return "Наименование банка: " + name + " " + ". Количество пользователей = " + totalAccounts() + ". Сумма баланса пользователей: " + (int)getTotalBalance() + ". Среднее значение баланса пользователей = " + (int)getAverageBalance();
    }

}
