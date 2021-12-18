public class Statika{
    
    /*
     * 1. v Javì "static" neznamená, že je nìco statické (nemìnné)
     * 2. "static" najdeš jen v deklaraci atibutu nebo metody
     * 3. Java nerozlišuje statické a dynamické (nemìnné, mìnící se), ale "statické" 
     * a "instanèní" - neboli "tøídní" a "instanèní"
     * a) když je nìkde "static", znamená to, že není potøeba vytváøet objekt 
     * (volat konstruktor na danou tøídu), ale atribut nebo metodu mohu zavolat pøímo na danou
     * tøídu
     */
   
    private static int pocetInstanci = 1;
    private int cislo = 23;
    private int id = pocetInstanci++;
    
    public Statika(){
    }
    
    // tuto metodu mohu volat pouze na existující objekt (na nìco, co bylo vytvoøeno konstruktorem)    
    public int getCislo(){
        return cislo;
    }
    
    private static int cislo2 = 222;
    // nepotøebuji mít vytvoøený objekt, abych tuto metodu zavolal
    public static int getCislo2(){
        return cislo2;
    }
    
    public void test2(){
        System.out.println(getCislo());
        System.out.println(Statika.getCislo2());
    }
    
    public String getPoradi(){
        return id + "/" + (pocetInstanci - 1);
    }
}