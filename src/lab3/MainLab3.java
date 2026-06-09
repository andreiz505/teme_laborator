package lab3;

import lab10.Student;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLab3 {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student(1029, "Maria", "Pana", "TI131/2", 4.10),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90),
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70)
        );

        // Sortare folosind Comparator
        studenti.sort(Comparator.comparing(Student::getFormatieDeStudiu)
                .thenComparing(Student::getNume));

        System.out.println("Studenti sortati dupa Grupa si Nume:");
        for (Student s : studenti) {
            System.out.println(s.toString());
        }
    }
}