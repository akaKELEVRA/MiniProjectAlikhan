package OOP.Lection10;

import java.util.Scanner;

public class ERPSystem {
    User [] memory = new User[1000];
    int sizeOfUsers = 0;


    public ERPSystem () {}

    public ERPSystem(int id, String login, String password) {
        this.memory = memory;
        this.sizeOfUsers = sizeOfUsers;
    }

    public void addUser (User u) {
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printAllUsers () {
        for (int i=0; i< memory.length; i++) {
            System.out.println(memory[i]);
            i++;
        }
    }

    public void printUser(int index) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс пользователя: ");
        int userindex = in.nextInt();
        for (int i=0; i< memory.length; i++) {
            if (userindex == i) {
                System.out.println(memory[i]);
            }
            else {
                System.out.println("No user in this index");
            }
        }
    }


}
