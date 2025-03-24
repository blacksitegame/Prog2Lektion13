package opgave03;

import opgave03.models.College;
import opgave03.models.Student;

public class Main {
    public static void main(String[] args) {
        College college = new College("MIT");
        System.out.println(college);

        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jane");
        college.addStudent(student1);
        college.addStudent(student2);
        for (Student student : college.getStudents()) {
            System.out.println(student);
        }

        student1.addgrade(5);
        student1.addgrade(4);
        student2.addgrade(3);
        student2.addgrade(2);
        System.out.println(college.calcAverageGrade());

        college.removeStudent(college.findStudent(2));
        for (Student student : college.getStudents()) {
            System.out.println(student);
        }



    }
}
