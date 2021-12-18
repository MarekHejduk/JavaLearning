public class Jedinacek{
    
    private static Jedinacek jedinacek;
    //atribut
    private String jmeno;
    
    public static Jedinacek getJedinacek() { //n�zev tov�rn� metody se p�e bu� getNazevTridy() nebo getInstance()
        if(jedinacek == null) {
            jedinacek = new Jedinacek();
        }
        return jedinacek;
    }
    
    //konstruktor
    private Jedinacek(){
        
    }
    
    //v metod� jsou parametry
    public void setJmeno(String jmeno){
     this.jmeno = jmeno;   
    }
    
    
    public String getJmeno(){
        return jmeno;
    }
    

}