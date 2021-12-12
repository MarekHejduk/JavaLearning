public class Simpsonovi{
    
    private Simpson abraham = new Simpson("Abraham Simpson", null, null);
    private Simpson penelope = new Simpson("Penelope Olsen", null, null);
    private Simpson bouvier = new Simpson("Pan Bouvier", null, null);
    private Simpson jackie = new Simpson("Jackie Bouvier", null, null);
    private Simpson herb = new Simpson("Herb Powers", abraham, penelope);
    private Simpson homer = new Simpson("Homer Simpson", abraham, penelope);
    private Simpson marge = new Simpson("Marge Bouvier", bouvier, jackie);
    private Simpson selma = new Simpson("Selma Bouvier", bouvier, jackie);
    private Simpson bart = new Simpson("Bart Simpson", homer, marge);
    
    public Simpsonovi(){
        
        System.out.println("Rodokmen pro osobu " + bart.getJmeno());
        vypisRodinu(bart);
    }
    
    //rekurzivní metoda
    public void vypisRodinu(Simpson simpson){
        System.out.println(simpson.getJmeno());
        if(simpson.getOtec() != null){
            vypisRodinu(simpson.getOtec());
        }
    }
}