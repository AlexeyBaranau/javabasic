package lesson8_homework.util;

import lesson8_homework.domain.Book;
import lesson8_homework.domain.Student;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class StudentsUtilClass {
    public static final String [] studentsNames = {"Lev", "Fedor", "Mihail", "Ivan", "Anton", "Alexander", "Nikolay",
            "Vladimir", "Alexey", "Samuil"};
    public static final String [] studentsSurnames = {"Tolstoy", "Dostoevskiy", "Bulgakov", "Sholokhov", "Lermontov",
            "Pushkin", "Turgenev", "Gogol", "Nabokov", "Tolstoy", "Marshak", "Mayakovskiy"};

    public static String generateStudentName() {
        int namePosition = new Random().nextInt(studentsNames.length);
        return studentsNames[namePosition];
    }

    public static String generateStudentSurname() {
        int namePosition = new Random().nextInt(studentsSurnames.length);
        return studentsSurnames[namePosition];
    }

    public static int generateStudentAge(){
        int age = (int) (17 + Math.random()*13);
        return age;
    }

    public static Student generateStudent (int id){
        Student student = new Student();
        student.setStudentId(id);
        student.setStudentAge(generateStudentAge());
        student.setStudentName(generateStudentName());
        student.setStudentSurname(generateStudentSurname());
        return student;
    }

    public static Set<Student> generateStudentSet(int studentsCount) {
        Set<Student> students = new TreeSet<>();
        for (int i = 0; i < studentsCount; i++) {
            students.add(generateStudent(i));
        }
        return students;
    }

}
