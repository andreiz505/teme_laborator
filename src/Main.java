import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fisierIntrare = "studenti_in.txt";
        String fisierIesire = "studenti_out.txt";
        List<Student> listaStudenti = new ArrayList<>();

        try {
            Path pathIntrare = Paths.get(fisierIntrare);
            List<String> linii = Files.readAllLines(pathIntrare);

            for (String linie : linii) {
                String[] bucati = linie.split(",");

                if (bucati.length == 4) {
                    String matricol = bucati[0].trim();
                    String prenume = bucati[1].trim();
                    String nume = bucati[2].trim();
                    String formatie = bucati[3].trim();

                    listaStudenti.add(new Student(matricol, nume, prenume, formatie));
                }
            }
            System.out.println("Am citit " + listaStudenti.size() + "studentii din fisier:");
            for (Student s : listaStudenti) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Eroare la citire!");
            e.printStackTrace();
            return;
        }


        Collections.sort(listaStudenti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int rezultatFormatie = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());
                if (rezultatFormatie == 0) {
                    return s1.getNume().compareTo(s2.getNume());
                }

                return rezultatFormatie;
            }
        });

        System.out.println("\n--- Lista studentilor sortati ---");
        for (Student s : listaStudenti) {
            System.out.println(s);
        }

        try {
            List<String> liniiDeScris = new ArrayList<>();
            for (Student s : listaStudenti) {
                liniiDeScris.add(s.toString());
            }

            Path pathIesire = Paths.get(fisierIesire);
            Files.write(pathIesire, liniiDeScris);

            System.out.println("\nDatele au fost salvate in: " + fisierIesire);

        } catch (IOException e) {
            System.out.println("Eroare la scrierea fisierului!");
            e.printStackTrace();
        }
    }
}