package HMLection18;

public class Main {
    public static void main (String[] args) {
        Operation operation1 = new Operation("Add client1 to Bank", 4);
        Operation operation2 = new Operation("Add client2 to Bank", 2);
        Operation operation3 = new Operation("Add client3 to Bank", 3);
        Operation operation4 = new Operation("Add client4 to Bank", 4);
        Operation operation5 = new Operation("Add client5 to Bank", 6);
        Operation operation6 = new Operation("Add client6 to Bank", 7);
        Operation operation7 = new Operation("Add client7 to Bank", 9);
        Operation operation8 = new Operation("Add client8 to Bank", 7);
        Operation operation9 = new Operation("Add client9 to Bank", 5);
        Operation operation10 = new Operation("Add client10 to Bank", 3);
        operation1.start();
        operation2.start();
        operation3.start();
        operation4.start();
        operation5.start();
        operation6.start();
        operation7.start();
        operation8.start();
        operation9.start();
        operation10.start();
    }
}
