import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AplicatieCuBursaTest {

    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test
   public void sortTest1() {
        List<StudentBursier> listaNesortata = appCuBursa.genereaza();

        List<StudentBursier> listaSortata = appCuBursa.sorteaza(listaNesortata);

        Assertions.assertEquals(5, listaSortata.size());

        Assertions.assertEquals("ISM141/1", listaSortata.get(0).getFormatieDeStudiu());
        Assertions.assertEquals("Mihalcea", listaSortata.get(0).getNume());

        Assertions.assertEquals(100.00, listaSortata.get(2).getCuantumBursa());
        Assertions.assertEquals(780.80, listaSortata.get(3).getCuantumBursa());
    }
}