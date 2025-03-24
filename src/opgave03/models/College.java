package opgave03.models;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class College {
    private String name;
    private Set<Student> students = new LinkedHashSet<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student findStudent(int StudentNo) {
        for (Student student : students) {
            if (student.getStudentNo() == StudentNo) {
                return student;
            }
        }
        return null;
    }

    public Double calcAverageGrade() {
        int numberOfGrades = 0;
        Double sum = 0.0;
        for (Student student : students) {
            for (Integer grade : student.getGrades()) {
                sum += grade;
                numberOfGrades++;
            }
        }
        return sum / numberOfGrades;
    }

    public String toString() {
        return name;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
