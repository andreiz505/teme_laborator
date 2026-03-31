import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fisierStudenti = "studenti_in.txt";
        String fisierNote = "note.txt";
        Map<String, Student> mapStudenti = new HashMap<>();
        try {
            List<String> liniiStudenti = Files.readAllLines(Paths.get(fisierStudenti));
            for (String linie : liniiStudenti) {
                String[] bucati = linie.split(",");
                if (bucati.length == 4) {
                    String matricol = bucati[0].trim();
                    String prenume = bucati[1].trim();
                    String nume = bucati[2].trim();
                    String formatie = bucati[3].trim();
                    mapStudenti.put(matricol, new Student(matricol, nume, prenume, formatie));
                }
            }
        } catch (IOException e) {
            System.out.println("Nu se poate citi");
        }
        try {
            List<String> liniiNote = Files.readAllLines(Paths.get(fisierNote));
            for (String linie : liniiNote) {
                String[] bucati = linie.split(",");
                if (bucati.length == 2) {
                    String matricol = bucati[0].trim();
                    float nota = Float.parseFloat(bucati[1].trim());
                    Student studentGasit = mapStudenti.get(matricol);
                    if (studentGasit != null) {
                        studentGasit.setNota(nota);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Nu s-a putut citi note.txt");
        }

        System.out.println(" Lista studentilor actualizata cu note ");
        for (Student s : mapStudenti.values()) {
            System.out.println(s);
        }
        float notaM = gasesteNota("Bianca", "Popescu", mapStudenti);
        float notaN = gasesteNota("loan", "Popa", mapStudenti);

        System.out.println("Nota Bianca: " + notaM);
        System.out.println("Nota loan: " + notaN);
    }

    public static float gasesteNota(String prenume, String nume, Map<String, Student> mapInitial) {

        Map<String, Student> mapDupaNume = new HashMap<>();

        for (Student s : mapInitial.values()) {
            String cheieNoua = s.getPrenume() + "-" + s.getNume();
            mapDupaNume.put(cheieNoua, s);
        }
        String cheieCautata = prenume + "-" + nume;
        Student studentCautat = mapDupaNume.get(cheieCautata);

        if (studentCautat != null) {
            return studentCautat.getNota();
        }
        return 0.0f;
    }
}