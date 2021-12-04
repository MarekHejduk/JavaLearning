public class Strom{
    
    // 1. vytvo��me kmen stromu
    // 2. vytvo��me korunu stromu
    // 3. ulo��me oba objekty do prom�nn�ch (do atribut�)
    // atribut vs parametr: atributy m�me, parametry zad�v�me
    // v praxi to znamen�, �e atributy budou ve t��d� naho�e nad metodami (t�m
    // jsou zadan�), parametry v�dy zad�v�me do kulat�ch z�vorek
    // atributy jsou obecn� vlastnosti, 
    // parametry jsou konkr�tn� hodnoty t�ch vlastnost�
    // 4. vytvo��me novou metodu (setPozice), kter� nastav� pozici stromu
    // 5. vytvo��me dal�� konstruktor (P�ET͎�ME KONSTRUKTOR = OVERLOAD)
    // p�et�it = stejn� jm�no metody a stejn� n�vratov� typ (u konstruktoru
    // n�vratov� typ nen�), ALE mus� se li�it v datov� typ nebo po�et parametr�
    // v (kulat�ch) z�vork�ch
    // konstruktor se zavol� pouze jednou, p�i vytv��en� objektu
    // metody se volaj� kdykoliv po vytvo�en� objektu
    
    private Elipsa koruna;
    private Obdelnik kmen;
    private int x;
    private int y;
    private int sirka;
    private int vyska;
    private Barva barvaKoruny;
    private Barva barvaKmene;
    
    
    
    public Strom(){
        this(0, 0);       
    }
    
    public Strom(int x, int y){
        this.x = x;
        this.y = y;
        this.sirka = 50;
        this.vyska = 88;
        this.barvaKoruny = Barva.ZELENA;
        this.barvaKmene = Barva.HNEDA;
        kmen = new Obdelnik(x + 15, y + 48, 2 * sirka / 5 , 40, barvaKmene);
        koruna = new Elipsa(x, y, sirka, 50, barvaKoruny);
    }
      
    public void setPozice(int x, int y){
        kmen.setPozice(x + 15, y + 48);
        koruna.setPozice(x, y);
        this.x = x;
        this.y = y;
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
}


