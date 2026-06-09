package lab5;

import lab10.Student;
import java.util.Objects;

public class StudentBursier extends Student {
    private double cuantumBursa;

    public StudentBursier(int numarMatricol, String prenume, String nume, String formatieDeStudiu, double nota, double cuantumBursa) {
        super(numarMatricol, prenume, nume, formatieDeStudiu, nota);
        this.cuantumBursa = cuantumBursa;
    }

    public double getCuantumBursa() {
        return cuantumBursa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentBursier that = (StudentBursier) o;
        return getNumarMatricol() == that.getNumarMatricol();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumarMatricol());
    }

    @Override
    public String toString() {
        return super.toString() + "," + cuantumBursa;
    }
}