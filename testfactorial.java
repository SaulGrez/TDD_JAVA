import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class testfactorial {
    @Test

    public void calcular_factorial_de_zero(){

        Factorial facto = new Factorial();

      int res = facto.Calcular(0);

        Assertions.assertEquals(1, res);
    }

    @Test

    public void calcular_factorial_de_cinco(){

        Factorial facto = new Factorial();

        int res = facto.Calcular(4);

        Assertions.assertEquals(24, res);
    }
}
