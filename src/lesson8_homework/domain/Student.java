package lesson8_homework.domain;

import lesson15.Annotation;

import java.util.Objects;

@Annotation
public class Student implements Comparable<Student>{
    private int studentId;
    private String studentName;
    private String studentSurname;
    private int studentAge;

    public Student() {    }

    public Student(int studentId, String studentName, String studentSurname, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
    }

    public String getStudentName() {        return studentName;    }
    @Annotation
    public void setStudentName(String studentName) {        this.studentName = studentName;    }

    public String getStudentSurname() {        return studentSurname;    }

    public void setStudentSurname(String studentSurname) {        this.studentSurname = studentSurname;    }

    public int getStudentAge() {        return studentAge;    }

    public void setStudentAge(int studentAge) {        this.studentAge = studentAge;    }

    public int getStudentId() {        return studentId;    }

    public void setStudentId(int studentId) {        this.studentId = studentId;    }

    @Override
    public String toString() {
        return "Student #" +
                " " + studentId +
                " " + studentName  +
                " " + studentSurname +
                "\t\t Student Age " + studentAge;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
                studentAge == student.studentAge &&
                Objects.equals(studentName, student.studentName) &&
                Objects.equals(studentSurname, student.studentSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentSurname, studentAge);
    }

    @Override
    public int compareTo(Student o) {
               return 1;
    }
}
