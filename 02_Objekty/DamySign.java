public class DamySign{
    
    private Elipsa hlava;
    private Trojuhelnik telo;
    private Obdelnik ruce;
    private Obdelnik nohaPrava;
    private Obdelnik nohaLeva;
    private int x;
    private int y;
    private int sirka;
    private int vyska;
    private Barva barva;
    private int posun = 25;
    
    public DamySign(int x, int y){
        this.x = x;
        this.y = y;
        hlava = new Elipsa(x + 25, y + 25, 25, 25, Barva.RUZOVA);
        telo = new Trojuhelnik(x + 20, y + 38, 35, 75, Barva.RUZOVA);
        ruce = new Obdelnik(x + 13, y + 58, 50, 10, Barva.RUZOVA);
        nohaPrava = new Obdelnik(x + 24, y + 113, 10, 15, Barva.RUZOVA);
        nohaLeva = new Obdelnik(x + 42, y + 113, 10, 15, Barva.RUZOVA);
    }
    
    public void setPozice(int x, int y){
        this.x = x;
        this.y = y;
        hlava.setPozice(getX() + 25, getY() + 25);
        telo.setPozice(getX() + 20, getY() + 38);
        ruce.setPozice(getX() + 13, getY() + 58);
        nohaPrava.setPozice(getX() + 24, getY() + 113);
        nohaLeva.setPozice(getX() + 42, getY() + 113);

    }
    
    public void posunVpravo(){
        setPozice(getX() + posun, getY());
    }
    
    public void posunVlevo(){
        setPozice(getX() - posun, getY());
    }
    
    public void posunDolu(){
        setPozice(getX(), getY() + posun);
        nakresli();
    }
    
    public void posunNahoru(){
        setPozice(getX(), getY() - posun);
        nakresli();
    }
    
    public void setPosun(int posun){
        this.posun = posun;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getSirka(){
        return this.sirka;
    }
    
    public int getVyska(){
        return this.vyska;
    }
    
    public Barva getBarva(){
        return this.barva;
    }
    
    public void nakresli(){
        hlava.nakresli();
        telo.nakresli();
        ruce.nakresli();
        nohaPrava.nakresli();
        nohaLeva.nakresli();
    }
    
    public void smaz(){
        hlava.smaz();
        telo.smaz();
        ruce.smaz();
        nohaPrava.smaz();
        nohaLeva.smaz();
    }
    
    
    
    
    
    
}