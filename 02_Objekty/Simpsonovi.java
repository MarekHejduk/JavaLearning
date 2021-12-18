public class Simpsonovi{
    
    public static Simpson abraham = new Simpson("Abraham Simpson", null, null);
    public static Simpson penelope = new Simpson("Penelope Olsen", null, null);
    public static Simpson bouvier = new Simpson("Pan Bouvier", null, null);
    public static Simpson jackie = new Simpson("Jackie Bouvier", null, null);
    public static Simpson herb = new Simpson("Herb Powers", abraham, penelope);
    public static Simpson homer = new Simpson("Homer Simpson", abraham, penelope);
    public static Simpson marge = new Simpson("Marge Bouvier", bouvier, jackie);
    public static Simpson selma = new Simpson("Selma Bouvier", bouvier, jackie);
    public Simpson bart = new Simpson("Bart Simpson", homer, marge);
    
    public Simpsonovi(Simpson simpson){
        
        System.out.println("Rodokmen pro osobu " + simpson.getJmeno());
        vypisRodinu(simpson);
    }
          
    public Simpsonovi(){
        this(homer);
    }
    
    
    //rekurzivní metoda
    public void vypisRodinu(Simpson simpson){
        if(simpson.getOtec() != null){
            System.out.println(simpson.getOtec().getJmeno());  
            vypisRodinu(simpson.getOtec());            
    }
        if (simpson.getMatka() != null){
            System.out.println(simpson.getMatka().getJmeno());  
            vypisRodinu(simpson.getMatka());
    }
    
}

    public Simpson getHomer(){        
        return homer;
    }
    
}