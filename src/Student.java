import java.util.Objects;

public class Student {
    private String nr_matricol;
    private String nume;
    private String prenume;
    private String formatieDeStudiu;
    protected float nota;

    public Student(String nr_matricol, String nume, String prenume, String formatieDeStudiu) {
        this.nr_matricol = nr_matricol;
        this.nume = nume;
        this.prenume = prenume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = 0.0f;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    @Override
    public String toString() {
        return "Student { matricol='" + nr_matricol + "', nume='" + nume +
                "', prenume='" + prenume + "', grupa='" + formatieDeStudiu +
                "', nota=" + nota + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, formatieDeStudiu);
    }
}