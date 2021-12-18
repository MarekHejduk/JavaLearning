public class Konstanta{
    
    /*
     * 1. konstanta se v k�du pozn� tak, �e atribut nebo metoda m� v deklaraci slov��ko "final"
     * 2. pokud je n�co "final", je to nem�nn� - je nutn� to naplnit, ale lze to jen jednou
     * (v atributech nebo v konstruktoru, nebo v p��pad� lok�ln� prom�nn� ihned)
     * 3. smyslem "final" je prevence pro program�tory, aby necht� nezm�nili n�co, 
     * co zm�nit necht�j�
     * 4. pokud je atribut "static final", tak podle konvence se n�zev tohoto atributu p�e
     * velk�mi p�smeny (a "_" mezi slovy) - statick� konstanty ("static final") se p�e 
     * p�ed atributy
     */
    
    private static final String JMENO_DO_DATABAZE = "db/api";
    private final int cislo = 77;
    
    public int getCislo(){
        return cislo;
    }
    
    /* 
    public void zmenCislo(){
        cislo = 3; //kv�li tomu, �e ��slo je final, zde p�i kompilaci ohl�s� po��ta� chybu
    }
    */
}