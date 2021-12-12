public class Simpson{
    
    private String jmeno;
    private Simpson matka;
    private Simpson otec;
    
    public Simpson(String jmeno, Simpson otec, Simpson matka){
        this.jmeno = jmeno;
        this.otec = otec;
        this.matka = matka;        
    }
    
    public String getJmeno(){
        return jmeno;
    }
    
    public Simpson getOtec(){
        return otec;
    }
    
    public Simpson getMatka(){
        return matka;
    }



}