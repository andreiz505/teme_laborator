import java.util.Objects;

public class Student {
    private String nr_matricol;
    private String nume;
    private String prenume;
    private String formatieDeStudiu;

    public Student (String nr_matricol,String nume,String prenume,String formatieDeStudiu){
        this.nr_matricol=nr_matricol;
        this.nume=nume;
        this.prenume=prenume;
        this.formatieDeStudiu=formatieDeStudiu;
    }
    @Override
    public String toString() {
        return "Student { matricol='" + nr_matricol + "', nume='" + nume + "', prenume='" + prenume + "', grupa='" + formatieDeStudiu + "' }";
    }
    @Override
    public boolean equals(Object s){
        if(this == s) return true;
        if(s == null || getClass()!=s.getClass()) return false;
        Student student= (Student) s;
        return Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nume,prenume,formatieDeStudiu);
    }
    public String getNume() {
        return nume;
    }
    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }
}
