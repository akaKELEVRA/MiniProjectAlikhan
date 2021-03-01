package OOP.Lection9;

import java.util.Arrays;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }


    public void addCourse (String course) {
        courses [indexOfCourses] = course;
        indexOfCourses++;
    }

    public String showCourses () {
        String s = "";
        for (int i=0; i<indexOfCourses; i++) {
            s = s + "\n\t" + courses[i];
        }
        return s;
    }

    @Override
    public String getData() {
        return super.getData() + ". GPA = " + gpa + " " + courses + showCourses();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + Arrays.toString(courses) +
                ", indexOfCourses=" + indexOfCourses +
                '}';
    }
}
