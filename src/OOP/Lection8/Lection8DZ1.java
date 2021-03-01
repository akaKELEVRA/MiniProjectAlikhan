package OOP.Lection8;

public class Lection8DZ1 {
    public static void main (String[] args) {
        Student s1 = new Student (1, "Alikhan", "Mussurmanov", 3.8);
        Student s2 = new Student (2, "Dinara", "Shaikhiyeva", 4);
        Student s3 = new Student (3, "Zhazira", "Shaikhiyeva", 3.9);
        Student s4 = new Student (4, "Baurzhan", "Abdugali", 3.8);
        Student s5 = new Student (5, "Assel", "Alikhan", 3);
        Student [] arrs = {s1, s2, s3, s4, s5};
        for (int i=0; i< arrs.length; i++) {
            System.out.println(arrs[i].getStudentData());
        }
    }
}
