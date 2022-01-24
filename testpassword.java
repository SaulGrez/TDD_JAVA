import com.company.Seguridad_password;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static sun.java2d.Disposer.WEAK;

public class testpassword {

    @Test

    public void password_es_de_nivel_debil_cuando_tiene_menos_de_ocho_letras(){

        Assertions.assertEquals(Seguridad_password.Niveldeseguridad.DEBIL, Seguridad_password.accesoPassword("1234567"));

    }

    @Test

    public void password_es_de_nivel_debil_cuando_tiene_solo_letras(){

        Assertions.assertEquals(Seguridad_password.Niveldeseguridad.DEBIL, Seguridad_password.accesoPassword("abcdefg"));

    }

    @Test

    public void password_es_de_nivel_medio_cuando_tiene_letras_y_numeros(){

        Assertions.assertEquals(Seguridad_password.Niveldeseguridad.MEDIO, Seguridad_password.accesoPassword("ABCD1234"));

    }

    @Test

    public void password_es_de_nivel_alto_cuando_tiene_letras_numeros_y_simbolos(){

        Assertions.assertEquals(Seguridad_password.Niveldeseguridad.FUERTE, Seguridad_password.accesoPassword("ABCD12XC34?¡"));

    }
}
