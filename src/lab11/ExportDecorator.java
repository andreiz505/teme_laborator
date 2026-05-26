package lab11;

import lab10.IStudentiExport;
import lab10.Student;
import java.util.List;

public abstract class ExportDecorator implements IStudentiExport {
    protected IStudentiExport decoratedExport;

    public ExportDecorator(IStudentiExport decoratedExport) {
        this.decoratedExport = decoratedExport;
    }

    @Override
    public void doExport(List<Student> studenti) {
        decoratedExport.doExport(studenti);
    }
}