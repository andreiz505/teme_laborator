package lab5;

import lab10.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppLab5 {
    public static void main(String[] args) {

        List<StudentBursier> bursieri = new ArrayList<>(); // [cite: 840]

        // [cite: 841, 842]
        bursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        bursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        bursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        bursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 780.80));

        writeToFile("bursieri_out.txt", bursieri); // [cite: 843, 913]
    }

    // [cite: 845, 914]
    static void writeToFile(String filename, Collection<? extends Student> studenti) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student s : studenti) {
                writer.write(s.toString());
                writer.newLine();
            }
            System.out.println("Fisierul " + filename + " a fost generat cu succes!");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea in fisier: " + e.getMessage());
        }
    }
}