package lab2;

import lab10.Student;
import java.util.HashSet;
import java.util.Set;

public class MainLab2 {
    public static void main(String[] args) {
        Set<Student> studentiSet = new HashSet<>();

        studentiSet.add(new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10));
        studentiSet.add(new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70));
        studentiSet.add(new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10)); // Duplicat

        System.out.println("Lista de studenti fara duplicate:");
        for (Student s : studentiSet) {
            System.out.println(s.toString());
        }
    }
}