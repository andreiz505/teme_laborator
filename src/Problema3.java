import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problema3 {
    public static void main(String[] args) {
        List<Student> studentiCuNote = Arrays.asList(
                new Student("1025", "Andrei", "Popa", "ISM141/2", 8.70f),
                new Student("1024", "Ioan", "Mihalcea", "ISM141/1", 10f),
                new Student("1026", "Anamaria", "Prodan", "TI131/1", 8.90f),
                new Student("1029", "Bianca", "Popescu", "TI131/1", 10f),
                new Student("1030", "Maria", "Pana", "TI131/2", 4.10f),
                new Student("1031", "Gabriela", "Mohanu", "TI131/2", 7.33f),
                new Student("1032", "Marius", "Nasta", "TI131/2", 3.20f),
                new Student("1033", "Marius", "Nasta", "TI131/1", 5.12f),
                new Student("1034", "Andrei", "Dobrescu", "TI131/2", 2.22f)
        );

        System.out.println("Studenti cu nota 10:");
        studentiCuNote.stream()
                .filter(s -> s.getNota() == 10f)
                .forEach(System.out::println);

        System.out.println("\nStudenti cu nota < 5:");
        studentiCuNote.stream()
                .filter(s -> s.getNota() < 5f)
                .forEach(System.out::println);

        List<Student> studentiMapati = studentiCuNote.stream()
                .map(s -> s.getNota() < 4f ? new Student(s.getNr_matricol(), s.getNume(), s.getPrenume(), s.getFormatieDeStudiu(), 4f) : s)
                .collect(Collectors.toList());

        System.out.println("\nLista mapata (nota < 4 devine 4):");
        studentiMapati.forEach(System.out::println);

        float sumaNotelor = studentiCuNote.stream()
                .map(Student::getNota)
                .reduce(0f, Float::sum);
        System.out.println("\nSuma notelor: " + sumaNotelor);

        double media = sumaNotelor / studentiCuNote.size();
        System.out.println("Media notelor: " + media);
    }
}