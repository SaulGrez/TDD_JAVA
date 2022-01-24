import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class testcalculadora {

    @Test

    public void TestSuma(){

        int resultado = Calculadora.sumar(2, 3);
        int esperado = 5;//SE INGRESA UN ENTERO CON EL RESULTADO ESPERADO DE LA RESTA DE A +B
        Assertions.assertEquals(esperado, resultado);//ASSERT EQUAL COMPARA EL RESULTADO ESPERADO CON EL RESUTADO FINAL
    }

    @Test

    public void TestResta(){

        int resultado = Calculadora.restar(5, 4);//TOMA LOS VALORES A Y B
        int esperado = 1; //SE INGRESA EL RESULTADO ESPERADO DE LA RESTA DE A -B
        Assertions.assertEquals(esperado, resultado);//ASSERT EQUAL COMPARA EL RESULTADO ESPERADO CON EL RESUTADO FINAL
    }

    @Test

    public void TestMult(){

        int resultado = Calculadora.multiplicar(3, 8);
        int esperado = 24;
        Assertions.assertEquals(esperado, resultado);
    }

    @Test

    public void TestDiv(){
        Calculadora calc = new Calculadora();
        int resultado = Calculadora.dividir(10,5);
        int esperado=2;
        Assertions.assertEquals(esperado,resultado);
    }

}
