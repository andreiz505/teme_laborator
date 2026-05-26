package lab11;

import lab10.IStudentiExport;
import lab10.Student;
import java.util.List;

public class TimeExecutionDecorator extends ExportDecorator {

    public TimeExecutionDecorator(IStudentiExport decoratedExport) {
        super(decoratedExport);
    }

    @Override
    public void doExport(List<Student> studenti) {
        long startTime = System.currentTimeMillis();

        super.doExport(studenti);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("-> Timpul de executie pentru acest export a fost: " + duration + " ms\n");
    }
}