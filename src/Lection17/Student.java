package Lection17;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    String name;
    String surname;
    ArrayList<Subject> subjects = new ArrayList<Subject>();

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getAllSubjects () {
        String s = "";
        for (Subject subject : subjects) {
            s = s + "\n\t" + subject;
        }
        return s;
    }

    @Override
    public String toString() {
        return name + " " + surname + getAllSubjects();
    }
}
