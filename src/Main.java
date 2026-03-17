import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studenti = new HashSet<>();
        studenti.add(new Student("120", "Popa", "Alis", "T121/2"));
        studenti.add(new Student("112", "Popa", "Maria", "TI21/1"));
        Student cautareAlis = new Student("120", "Popa", "Alis", "T121/2");
        Student cautareMaria = new Student("112", "Popa", "Maria", "TI21/1");

        System.out.println(studenti.contains(cautareAlis));
        System.out.println(studenti.contains(cautareMaria));
    }
}