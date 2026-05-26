package lab10;

import lab10.Student;

import java.util.List;

public class Exporter {
    public void startExport(IStudentiExport strategyInstance, List<Student> students) {
        strategyInstance.doExport(students);
    }
}