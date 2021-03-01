package OOP.Lection9;

import java.util.Scanner;

public class Lection9DZ1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int indexOfUsers = 0;
        int indexOfCourses = 0;
        int index = 10;
        Student stud1 = new Student (11, "", "", "Zhazira", "Shaikhiyeva", 4);
        Student stud2 = new Student (12, "", "", "Baurzhan", "Abdugali", 3.9);
        Student stud3 = new Student (13, "", "", "Aysulu", "Orazbayeva", 3.5);
        Student stud4 = new Student (14, "", "", "Aybol", "Nurmaganbetov", 3.8);
        Student stud5 = new Student (15, "", "", "Timur", "Tamashev", 3.8);
        Staff staf1 = new Staff (21, "", "", "Dinara", "Shaikhiyeva", 1000);
        Staff staf2 = new Staff (22, "", "", "Larisa", "Ten", 800);
        Staff staf3 = new Staff (23, "", "", "Assel", "Alikhan", 700);
        Staff staf4 = new Staff (24, "", "", "Alfiya", "Toxeitova", 800);
        Staff staf5 = new Staff (25, "", "", "Assel", "Koptileuova", 750);
        User [] users = {stud1, stud2, stud3, stud4, stud5, staf1, staf2, staf3, staf4, staf5};
        String course = in.next();
        String subject = in.next();
        for (int i=0; i<users.length; i++) {
            if (users[i] instanceof Student) {
                ((Student) users[i]).addCourse(course);
                users[i].getData();
            }
            if (users[i] instanceof Staff) {
                ((Staff) users[i]).addSubject(subject);
                users[i].getData();
            }
        }
    }
}
