package lab10;

public class Student {
    private int numarMatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;
    private double nota;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu, double nota) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
    }

    public double getNota() { return nota; }
    public String getPrenume() { return prenume; }
    public String getNume() { return nume; }
    public int getNumarMatricol() { return numarMatricol; }
    public String getFormatieDeStudiu() { return formatieDeStudiu; }

    @Override
    public String toString() {
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu + "," + nota;
    }
}