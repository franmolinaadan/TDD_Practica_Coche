public class Coche {
    public int velocidad;

    public void acelerar(int aceleracion) {
        velocidad+=aceleracion;
    }

    public void decelerar(int decelerar) {
        velocidad-=decelerar;
        if (velocidad<0)velocidad=0;
    }
}
