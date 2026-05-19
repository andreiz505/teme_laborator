import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierXlsx implements IStudentiImport {
    private String fileName;

    public StudentiDinFisierXlsx(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doImport() {
        System.out.println("Simulare citire studenti din fisierul Excel: " + fileName);
        return new ArrayList<>();
    }
}