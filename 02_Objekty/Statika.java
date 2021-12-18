public class Statika{
    
    /*
     * 1. v Jav� "static" neznamen�, �e je n�co statick� (nem�nn�)
     * 2. "static" najde� jen v deklaraci atibutu nebo metody
     * 3. Java nerozli�uje statick� a dynamick� (nem�nn�, m�n�c� se), ale "statick�" 
     * a "instan�n�" - neboli "t��dn�" a "instan�n�"
     * a) kdy� je n�kde "static", znamen� to, �e nen� pot�eba vytv��et objekt 
     * (volat konstruktor na danou t��du), ale atribut nebo metodu mohu zavolat p��mo na danou
     * t��du
     */
   
    private static int pocetInstanci = 1;
    private int cislo = 23;
    private int id = pocetInstanci++;
    
    public Statika(){
    }
    
    // tuto metodu mohu volat pouze na existuj�c� objekt (na n�co, co bylo vytvo�eno konstruktorem)    
    public int getCislo(){
        return cislo;
    }
    
    private static int cislo2 = 222;
    // nepot�ebuji m�t vytvo�en� objekt, abych tuto metodu zavolal
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