package lab8;

import lab10.Student;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AppLab8 {

    public static void main(String[] args) {

        List<Student> studenti = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90)
        );

        // 8.5.4 a
        String xlsFileName = "laborator8_students.xlsx";
        writeToXls(studenti, xlsFileName);

        // 8.5.4 b
        List<Student> studentsFromXls = readFromXls(xlsFileName);
        System.out.println("\nStudenti cititi din xlsx:");
        for (Student st : studentsFromXls) {
            System.out.println(st.toString());
        }
    }

    public static void writeToXls(Collection<Student> studenti, String filename) {
        try (XSSFWorkbook workbook = new XSSFWorkbook();
             FileOutputStream out = new FileOutputStream(filename)) {

            XSSFSheet sheet = workbook.createSheet("Studenti");
            int rowNum = 0;

            for (Student s : studenti) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(s.getNumarMatricol());
                row.createCell(1).setCellValue(s.getPrenume());
                row.createCell(2).setCellValue(s.getNume());
                row.createCell(3).setCellValue(s.getFormatieDeStudiu());
                row.createCell(4).setCellValue(s.getNota());
            }

            workbook.write(out);
            System.out.println("Fisierul " + filename + " a fost salvat cu succes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readFromXls(String filename) {
        List<Student> students = new ArrayList<>();

        try (FileInputStream in = new FileInputStream(filename);
             XSSFWorkbook workbook = new XSSFWorkbook(in)) {

            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                int matricol = (int) row.getCell(0).getNumericCellValue();
                String prenume = row.getCell(1).getStringCellValue();
                String nume = row.getCell(2).getStringCellValue();
                String formatie = row.getCell(3).getStringCellValue();
                double nota = row.getCell(4).getNumericCellValue();

                students.add(new Student(matricol, prenume, nume, formatie, nota));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
}