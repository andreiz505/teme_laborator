public final class Student {
    private final String nr_matricol;
    private final String nume;
    private final String prenume;
    private final String formatieDeStudiu;
    private final float nota;

    public Student(String nr_matricol, String nume, String prenume, String formatieDeStudiu, float nota) {
        this.nr_matricol = nr_matricol;
        this.nume = nume;
        this.prenume = prenume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
    }

    public String getNr_matricol() { return nr_matricol; }
    public String getNume() { return nume; }
    public String getPrenume() { return prenume; }
    public String getFormatieDeStudiu() { return formatieDeStudiu; }
    public float getNota() { return nota; }

    @Override
    public String toString() {
        return "Student{" + "matricol='" + nr_matricol + '\'' + ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' + ", formatie='" + formatieDeStudiu + '\'' +
                ", nota=" + nota + '}';
    }
}