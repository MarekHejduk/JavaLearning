public class Strom{
    
    // 1. vytvoøíme kmen stromu
    // 2. vytvoøíme korunu stromu
    // 3. uložíme oba objekty do promìnných (do atributù)
    // atribut vs parametr: atributy máme, parametry zadáváme
    // v praxi to znamená, že atributy budou ve tøídì nahoøe nad metodami (tím
    // jsou zadané), parametry vždy zadáváme do kulatých závorek
    // atributy jsou obecné vlastnosti, 
    // parametry jsou konkrétní hodnoty tìch vlastností
    // 4. vytvoøíme novou metodu (setPozice), která nastaví pozici stromu
    // 5. vytvoøíme další konstruktor (PØETÍŽÍME KONSTRUKTOR = OVERLOAD)
    // pøetížit = stejné jméno metody a stejný návratový typ (u konstruktoru
    // návratový typ není), ALE musí se lišit v datový typ nebo poèet parametrù
    // v (kulatých) závorkách
    // konstruktor se zavolá pouze jednou, pøi vytváøení objektu
    // metody se volají kdykoliv po vytvoøení objektu
    
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


