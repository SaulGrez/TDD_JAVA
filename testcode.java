import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class testcode {
    @Test //COMANDO PARA INICIAR UN TEST xdddddd

    public void test_velocidad_coche_es_cero(){//INICIALIZACION DE OBJETOS

        Coche nuevoCoche = new Coche();//ACT CONSISTE EN ESTIMULAR EL CODIGO QUE SE DESEA PROBAR

        Assertions.assertEquals(0,nuevoCoche.velocidad);//ASSERT SE EJECUTA Y SE PUEBRA SO SE CUMPLE LAS CONDICIONES
        //LA VELOCIDAD INICIAL DEL COCHE ES 0
    }

    @Test
    public void test_al_acelerar_un_coche_su_velociad_aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
        //LA ACELERACION DEL COCHE DEBE AUMENTAR EN 30
    }

    @Test
    public void test_al_desacelerar_un_coche_su_velociad_disminuye(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=30; //VELOCIDAD DEL COCHE INICIA EN 30
        nuevoCoche.desacelerar(10); //PERO DESACELERA MENOS 10
        Assertions.assertEquals(20,nuevoCoche.velocidad);//POR LO TANTO EL RESULTADO DE DESACELELERAR ES 20
    }

    @Test
    public void test_al_desacelerar_un_coche_su_velociad_no_debe_ser_menor_a_cero(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=30; //VELOCIDAD DEL COCHE INICIA EN 30
        nuevoCoche.desacelerar(40); //PERO DESACELERA MENOS 40
        Assertions.assertEquals(0,nuevoCoche.velocidad);//POR LO TANTO EL RESULTADO DE DESACELELERAR NO DEBE SER NEGATIVO
    }




}
