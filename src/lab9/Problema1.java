package lab9;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problema1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numere = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista:" + numere);

        int suma = numere.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma:" + suma);

        int max = numere.stream().max(Comparator.naturalOrder()).orElseThrow();
        int min = numere.stream().min(Comparator.naturalOrder()).orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);

        List<Integer> filtrate = numere.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("Filtrate [10..20]: " + filtrate);

        List<Double> duble = numere.stream()
                .map(Double::valueOf)
                .collect(Collectors.toList());
        System.out.println("Mapate la Double: " + duble);

        boolean contine12 = numere.stream().anyMatch(n -> n == 12);
        System.out.println("Contine 12 " + contine12);
    }
}