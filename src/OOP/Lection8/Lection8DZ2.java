package OOP.Lection8;

public class Lection8DZ2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alikhan", "Mussurmanov", 3.8);
        Student s2 = new Student(2, "Dinara", "Shaikhiyeva", 4);
        Student s3 = new Student(3, "Zhazira", "Shaikhiyeva", 3.9);
        Student s4 = new Student(4, "Baurzhan", "Abdugali", 3.8);
        Student s5 = new Student(5, "Assel", "Alikhan", 3);
        Student s6 = new Student(6, "Larisa", "Ten", 3.2);
        Student s7 = new Student(7, "Olesya", "Li", 3.7);
        Student s8 = new Student(8, "Stas", "Ogorodov", 2.9);
        Student s9 = new Student(9, "Aybol", "Nurmaganbetov", 3.75);
        Student s10 = new Student(10, "Timur", "Tamashev", 3.65);
        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        topStudent(students);
    }

    public static void topStudent (Student students[]) {
        double GPAmax = students[0].getGpa();
        int index = 0;
        for (int i=0; i< students.length; i++) {
            if (GPAmax<students[i].getGpa()) {
                GPAmax = students[i].getGpa();
                index = i;
            }
        }
        System.out.println("Данные самого лучшего студента, у которого высокий gpa: " + students[index].getName() + " " + students[index].getSurname() + " " + students[index].getGpa());
    }
}
