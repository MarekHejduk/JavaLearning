public class Podminky{
    
    public void podminky(int cislo){
        
        if(cislo == 1){
            new Strom();
        }else if(cislo == 2){
            new DamySign(50, 50);
        }else{
            new Elipsa(150, 150, 50, 60);
        }  
    }
    
    public void podminky(String jmeno){
        if("strom".equals(jmeno)){
            new Strom();
            System.out.println("I'm from strom.");
        }else{
            new DamySign(50, 50);
            System.out.println("Kde tu máte záchod?!");
        }
    }
    
    public void podminky(Strom strom){
        if(strom.getX() == 25 && strom.getY() == 50){
            new Strom();
        }
    }
    /**
     * Øádky 34 až 36 dìlají zcela to samé, co øádky 38 až 41. Liší se to 
     * v øešení "null" hodnoty.
     */
    public void jinyZapisPodminky(Strom strom){
        if(strom != null){
            System.out.println("I'm from strom.");
        }
        
        if (strom == null){
            return;
        }
        System.out.println("I'm from strom.");
        
    }
    /**
     * Pokud není zadán "break", vykoná case a od nìj až do dalšího breaku 
     * bude casy vykonávat (viz 53 øádka)
     * "switch" funguje jen pro int a String
     */
    public void metodaSwitch(String x){
        switch(x){
            case "0": 
                System.out.println("Je to nula.");
     
            case "1":
                System.out.println("Jsem jednièka.");
                break;
            case "22":
                System.out.println("Nesmysl.");
                break; //u posledního by být nemusel, ale:
            default:
                System.out.println(x + " volbu neznám, nevím, co mám dìlat.");
        }
        
    }
    
    public void test(){
        Strom strom = new Strom();
        Podminky testPodminek = new Podminky();
        testPodminek.podminky(strom);
        strom.setPozice(25, 50);
        testPodminek.podminky(strom);
    }
    
}