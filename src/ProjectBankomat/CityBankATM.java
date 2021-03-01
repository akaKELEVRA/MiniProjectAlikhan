package ProjectBankomat;

import java.util.Scanner;

public class CityBankATM extends Database {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Please, insert your account number:");
        String accnum = in.next();
        int indx = -1;
        for (int i = 0; i < allAccounts.length; i++) {
            if (accnum.equalsIgnoreCase(allAccounts[i].getAccountNumber())) {
                System.out.println("Please, insert your PIN-code:");
                String accpin = in.next();
                if (accpin.equalsIgnoreCase(allAccounts[i].getPinCode())) {
                    indx = i;
                }
            }
        }
        if (indx == -1) {
            System.out.println("Error! This card is invalid!");
        }
        else if (allAccounts[indx] instanceof CityBankAccount) {
            while (true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT");
                String gench = in.next();
                if (gench.equals("1")) {
                    System.out.println("Insert amount to withdraw:");
                    int cred = in.nextInt();
                    allAccounts[indx].creditBalance(cred);
                }
                if (gench.equals("2")) {
                    System.out.println("Total balance = " + allAccounts[indx].totalBalance());
                }
                if (gench.equals("3")) {
                    System.out.println("Insert new PIN code");
                    String newpin = in.next();
                    allAccounts[indx].setPinCode(newpin);
                }
                if (gench.equals("4")) {
                    System.out.println("Insert amount to deposit:");
                    int debt = in.nextInt();
                    allAccounts[indx].debetBalance(debt);
                }
                if (gench.equals("5")) {
                    System.out.println(allAccounts[indx].accountData());
                }
                if (gench.equals("6")) {
                    System.out.println("Thank you for using our ATM!");
                    break;
                }
            }
        }
        else if (allAccounts[indx] instanceof NationalBankAccount){
            while (true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO EXIT");
                String ch2 = in.next();
                if (ch2.equals("1")) {
                    System.out.println("Insert amount to withdraw:");
                    int cred = in.nextInt();
                    allAccounts[indx].creditBalance(cred + 200);
                }
                if (ch2.equals("2")) {
                    System.out.println("Total balance = " + allAccounts[indx].totalBalance());
                }
                if (ch2.equals("3")) {
                    System.out.println("THANK YOU FOR USING OUR ATM!");
                    break;
                }
            }
        }
    }
}
