import java.util.List;

public class StudentiInConsola implements IStudentiExport {
    @Override
    public void doExport(List<Student> studenti) {
        System.out.println("--- Export in Consola ---");
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}