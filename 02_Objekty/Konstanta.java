public class Konstanta{
    
    /*
     * 1. konstanta se v kódu pozná tak, že atribut nebo metoda má v deklaraci slovíèko "final"
     * 2. pokud je nìco "final", je to nemìnné - je nutné to naplnit, ale lze to jen jednou
     * (v atributech nebo v konstruktoru, nebo v pøípadì lokální promìnné ihned)
     * 3. smyslem "final" je prevence pro programátory, aby nechtì nezmìnili nìco, 
     * co zmìnit nechtìjí
     * 4. pokud je atribut "static final", tak podle konvence se název tohoto atributu píše
     * velkými písmeny (a "_" mezi slovy) - statické konstanty ("static final") se píše 
     * pøed atributy
     */
    
    private static final String JMENO_DO_DATABAZE = "db/api";
    private final int cislo = 77;
    
    public int getCislo(){
        return cislo;
    }
    
    /* 
    public void zmenCislo(){
        cislo = 3; //kvùli tomu, že èíslo je final, zde pøi kompilaci ohlásí poèítaè chybu
    }
    */
}