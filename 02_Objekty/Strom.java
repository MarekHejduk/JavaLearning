    /**
    * 1. vytvo��me kmen stromu
    * 2. vytvo��me korunu stromu
    * 3. ulo��me oba objekty do prom�nn�ch (do atribut�)
    * atribut vs parametr: atributy m�me, parametry zad�v�me
    * v praxi to znamen�, �e atributy budou ve t��d� naho�e nad metodami (t�m
    * jsou zadan�), parametry v�dy zad�v�me do kulat�ch z�vorek
    * atributy jsou obecn� vlastnosti, 
    * parametry jsou konkr�tn� hodnoty t�ch vlastnost�
    * 4. vytvo��me novou metodu (setPozice), kter� nastav� pozici stromu
    * 5. vytvo��me dal�� konstruktor (P�ET͎�ME KONSTRUKTOR = OVERLOAD)
    * p�et�it = stejn� jm�no metody a stejn� n�vratov� typ (u konstruktoru
    * n�vratov� typ nen�), ALE mus� se li�it v datov� typ nebo po�et parametr�
    * v (kulat�ch) z�vork�ch
    * konstruktor se zavol� pouze jednou, p�i vytv��en� objektu
    * metody se volaj� kdykoliv po vytvo�en� objektu
    * 6. vytvo��me GETtery (n�vratov� metody, kter� vrac� atributy)
    */
public class Strom{
    
    private Elipsa koruna;
    private Obdelnik kmen;
    private int x;
    private int y;
    private int sirka;
    private int vyska;
    private int velikostPosunu = 50;
    private Barva barvaKoruny;
    private Barva barvaKmene;
    
    
    
    public Strom(){
        this(100, 100);       
    }
    
    public Strom(int x, int y){
        this(x, y, 50, 90);
    }
    
    public Strom(int x, int y, int sirka, int vyska){
        this(x, y, sirka, vyska, Barva.ZELENA, Barva.HNEDA);
    }
    
    public Strom(int x, int y, int sirka, int vyska, Barva barvaKoruny, Barva barvaKmene){
        this.x = x;
        this.y = y;
        this.sirka = sirka;
        this.vyska = vyska;
        this.barvaKoruny = barvaKoruny;
        this.barvaKmene = barvaKmene;
        koruna = new Elipsa(getX(), getY(), sirka, 5 * vyska / 9, barvaKoruny);
        kmen = new Obdelnik(getX() + sirka / 2 - 2 * sirka / 10, 
                            getY() + koruna.getVyska() - 5, 
                            2 * sirka / 5, 
                            40 * vyska / 90, 
                            barvaKmene);
        koruna.nakresli();
    }
      
    public void setPozice(int x, int y){
        this.x = x;
        this.y = y;
        kmen.setPozice(getX() + sirka / 2 - 2 * sirka / 10, 
        getY() + koruna.getVyska() - 5);
        koruna.setPozice(getX(), getY());
    }
    
    public void setRozmer(int sirka, int vyska){
        this.sirka = sirka;
        this.vyska = vyska;
        kmen.setRozmer(2 * sirka / 5, 40 * vyska / 90);
        koruna.setRozmer(sirka, 5 * vyska / 9);
        setPozice(getX(), getY());
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
    
    public Barva getBarvaKoruny(){
        return this.barvaKoruny;
    }
    
    public Barva getBarvaKmene(){
        return this.barvaKmene;
    }
    
    public void posunVpravo(int posun){
        setPozice(getX() + posun, getY());
    }
    
    public void posunDolu(int posun){
        setPozice(getX(), getY() + posun);
    }
    
    public void posunDolu(){
        posunDolu(velikostPosunu);    
    }
    
    public void posunNahoru(){
        posunDolu(- velikostPosunu);
        nakresli();
    }
    
  
    public void posunVpravo(){
        posunVpravo(velikostPosunu);
    }
    /*
     * obecn� koment�� (nen� dokumenta�n�)
     */
    public void posunVlevo(){
        posunVpravo(- velikostPosunu);
    }
    /**
     * dokumenta�n� koment��
     */
    public void setVelikostPosunu(int velikostPosunu){
        this.velikostPosunu = velikostPosunu;
    }
    
    public void nakresli(){
        kmen.nakresli();
        koruna.nakresli();
    }
    
    public void smaz(){
        kmen.smaz();
        koruna.smaz();
    }
    

}

