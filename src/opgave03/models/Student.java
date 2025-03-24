package opgave03.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addgrade(int grade) {
        this.grades.add(grade);
    }

    public String toString() {
        return studentNo + " " + name;
    }
}
