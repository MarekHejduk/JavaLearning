public class Jedinacek{
    
    private static Jedinacek jedinacek;
    //atribut
    private String jmeno;
    
    public static Jedinacek getJedinacek() { //název tovární metody se píše buï getNazevTridy() nebo getInstance()
        if(jedinacek == null) {
            jedinacek = new Jedinacek();
        }
        return jedinacek;
    }
    
    //konstruktor
    private Jedinacek(){
        
    }
    
    //v metodì jsou parametry
    public void setJmeno(String jmeno){
     this.jmeno = jmeno;   
    }
    
    
    public String getJmeno(){
        return jmeno;
    }
    

}