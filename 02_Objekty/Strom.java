    /**
    * 1. vytvoøíme kmen stromu
    * 2. vytvoøíme korunu stromu
    * 3. uložíme oba objekty do promìnných (do atributù)
    * atribut vs parametr: atributy máme, parametry zadáváme
    * v praxi to znamená, že atributy budou ve tøídì nahoøe nad metodami (tím
    * jsou zadané), parametry vždy zadáváme do kulatých závorek
    * atributy jsou obecné vlastnosti, 
    * parametry jsou konkrétní hodnoty tìch vlastností
    * 4. vytvoøíme novou metodu (setPozice), která nastaví pozici stromu
    * 5. vytvoøíme další konstruktor (PØETÍŽÍME KONSTRUKTOR = OVERLOAD)
    * pøetížit = stejné jméno metody a stejný návratový typ (u konstruktoru
    * návratový typ není), ALE musí se lišit v datový typ nebo poèet parametrù
    * v (kulatých) závorkách
    * konstruktor se zavolá pouze jednou, pøi vytváøení objektu
    * metody se volají kdykoliv po vytvoøení objektu
    * 6. vytvoøíme GETtery (návratové metody, které vrací atributy)
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
     * obecný komentáø (není dokumentaèní)
     */
    public void posunVlevo(){
        posunVpravo(- velikostPosunu);
    }
    /**
     * dokumentaèní komentáø
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

