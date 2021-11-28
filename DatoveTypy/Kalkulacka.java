

public class Kalkulacka
{    
    public int secti(int a, int b) {
        return a + b;
    }
    
    public int odecti(int a, int b) {
        return a - b;
    }
    
    public int vynasob(int a, int b) {
        return a * b;
    }
    
    public double pythagorovaVeta(int a, int b) {
        double c = 0;
        c = a * a + b * b;
        c = Math.sqrt(c);
        return c;
        
        //PythagorovaVeta pythagorka = new PythagorovaVeta();
        //return pythagorka.getC(a, b);
    }
}
