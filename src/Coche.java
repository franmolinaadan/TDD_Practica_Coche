public class Coche {
    public int velocidad;

    public void acelerar_FRAN_MOLINA(int aceleracion) {
        velocidad+=aceleracion;
    }

    public void decelerar_FRAN_MOLINA(int decelerar) {
        velocidad-=decelerar;
        if (velocidad<0)velocidad=0;
    }
}
