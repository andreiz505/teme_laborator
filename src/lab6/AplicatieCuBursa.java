package lab6;

import lab5.StudentBursier;
import java.util.ArrayList;
import java.util.List;

public class AplicatieCuBursa {
    public static void main(String[] args) {
        List<StudentBursier> bursieri = new ArrayList<>();

        bursieri.add(new StudentBursier(1050, "Mihai", "Dobre", "TI131/1", 9.50, 800.0));
        bursieri.add(new StudentBursier(1051, "Elena", "Ionescu", "TI131/2", 9.80, 850.0));

        System.out.println("--- Evidenta Studenti Bursieri ---");
        for (StudentBursier sb : bursieri) {
            System.out.println(sb.toString());
        }

        System.out.println("\nTotal bursieri inregistrati: " + bursieri.size());
    }
}