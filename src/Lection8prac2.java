public class Lection8prac2 {
    public static void main (String[] args) {
        Student s1 = new Student(111, "Dinara", "Makhambet", 4);
        Student s2 = new Student(222, "Aysulu", "Orazbayeva", 3.7);
        Student s3 = new Student (333, "Stanislav", "Ogorodov", 3.5);
        Student s4 = new Student (444, "Rustem", "Karimov", 3.8);
        Student s5 = new Student (555, "Olesya", "Li", 3.9);
        Student [] students = {s1, s2, s3, s4, s5};
        topStudent(students);
    }
    public static void topStudent (Student[] students) {
        double maxGPA = students[0].getGpa();
        int index = 0;
        for (int i=0; i<students.length; i++) {
            if (maxGPA<students[i].getGpa()) {
                maxGPA = students[i].getGpa();
                index = i;
            }
        }
        System.out.println((students[index].getName() + " " + students[index].getSurname() + ". GPA = " + students[index].getGpa()));
    }
}
