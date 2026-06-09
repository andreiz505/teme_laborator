package lab4;

import lab10.Student;
import java.util.HashMap;
import java.util.Map;

public class MainLab4 {
    public static void main(String[] args) {

        Map<Integer, Student> mapStudenti = new HashMap<>();

        Student s1 = new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10);
        Student s2 = new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70);

        mapStudenti.put(s1.getNumarMatricol(), s1);
        mapStudenti.put(s2.getNumarMatricol(), s2);

        int cautat = 1025;
        if (mapStudenti.containsKey(cautat)) {
            System.out.println("Studentul gasit: " + mapStudenti.get(cautat).toString());
        } else {
            System.out.println("Studentul nu exista in baza de date.");
        }
    }
}