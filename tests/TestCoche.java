import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_FRAN_MOLINA(){
        Coche nuevoCoche =new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_FRAN_MOLINA(){
        Coche nuevoCoche =new Coche();
        nuevoCoche.acelerar_FRAN_MOLINA(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_FRAN_MOLINA(){
        Coche nuevoCoche =new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar_FRAN_MOLINA(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_FRAN_MOLINA(){
        Coche nuevoCoche =new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar_FRAN_MOLINA(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
