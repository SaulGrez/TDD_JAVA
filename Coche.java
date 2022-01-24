public class Coche {
    public int velocidad;

    public void acelerar(int aceleracion) {

        velocidad = velocidad + aceleracion;
    }

    public void desacelerar(int desacelerar) {

        velocidad = velocidad - desacelerar;

        if (velocidad-desacelerar<0) velocidad=0;
      }
}
