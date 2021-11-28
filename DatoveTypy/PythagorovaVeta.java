
/**
 * c * c = a * a + b * b
 */
public class PythagorovaVeta
{
    private int a;
    private int b;
    private double c;
    
    public double getC(int parametrA, int parametrB) {
        c = (parametrA * parametrA) + (parametrB * parametrB);
        c = Math.sqrt(c);
        return c;
    }
}
