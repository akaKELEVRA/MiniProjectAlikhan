package Lesson23;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    String operationType;
    Students student;
    ArrayList<Students> students;

    public PackageData(String operationType, Students student, ArrayList<Students> students) {
        this.operationType = operationType;
        this.student = student;
        this.students = students;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }
}
