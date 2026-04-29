import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Total instance count is " + Form.getInstanceCount());

        PasswordMaker pm2 = PasswordMaker.getInstance();
        System.out.println("\n a+b) Generated passwords: ");
        System.out.println("1:" + PasswordMaker.getInstance().getPassword());
        System.out.println("2:" + PasswordMaker.getInstance().getPassword());
        System.out.println("3:" + PasswordMaker.getInstance().getPassword());
        System.out.println("4:" + pm2.getPassword());
        System.out.println("5:" + pm2.getPassword());
        System.out.println("\n c) Number of time  " + PasswordMaker.getCallingCounts());

        Set<Student> studenti = new HashSet<>();
        studenti.add(new Student("1024", "Popescu", "Ion", "TI131", 9.5f));
        studenti.add(new Student("1025", "Ionescu", "Ana", "TI131", 8.5f));
        studenti.add(new Student("1026", "Marin", "George", "TI131", 7.0f));
        studenti.add(new Student("1027", "Vasile", "Elena", "TI131", 10.0f));
        studenti.add(new Student("1028", "Dumitru", "Alex", "TI131", 6.5f));

        Set<Student> studentiRepartizati = imparteInDouaFormatii(studenti, "TI 211 1", "TI 211 2");

        System.out.println("\n- Lista Noua Studenti -");
        for (Student s : studentiRepartizati) {
            System.out.println(s);
        }
    }

    static Student schimbaFormatia(Student st, String nouaFormatieDeStudiu) {
        return new Student(st.getNr_matricol(), st.getNume(), st.getPrenume(), nouaFormatieDeStudiu, st.getNota());
    }

    static Set<Student> imparteInDouaFormatii(Set<Student> studenti, String formatia1, String formatia2) {
        Set<Student> rezultat = new HashSet<>();
        int jumatate = studenti.size() / 2;
        int contor = 0;

        for (Student st : studenti) {
            if (contor < jumatate) {
                rezultat.add(schimbaFormatia(st, formatia1));
            } else {
                rezultat.add(schimbaFormatia(st, formatia2));
            }
            contor++;
        }
        return rezultat;
    }
}