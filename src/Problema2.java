import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problema2 {
    public static void main(String[] args) {
        String text = "Acesta este un program scris pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        List<String> filtrate = cuvinte.stream()
                .filter(c -> c.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Cuvinte >= 5 caractere (" + filtrate.size() + "): " + filtrate);

        List<String> ordonate = filtrate.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Lista ordonata: " + ordonate);

        String cuvantCuP = cuvinte.stream()
                .filter(c -> c.startsWith("p"))
                .findFirst()
                .orElse("Nu exista");
        System.out.println("Primul cuvant cu 'p': " + cuvantCuP);
    }
}