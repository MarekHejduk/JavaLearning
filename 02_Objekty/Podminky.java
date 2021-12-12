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
            System.out.println("Kde tu m�te z�chod?!");
        }
    }
    
    public void podminky(Strom strom){
        if(strom.getX() == 25 && strom.getY() == 50){
            new Strom();
        }
    }
    /**
     * ��dky 34 a� 36 d�laj� zcela to sam�, co ��dky 38 a� 41. Li�� se to 
     * v �e�en� "null" hodnoty.
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
     * Pokud nen� zad�n "break", vykon� case a od n�j a� do dal��ho breaku 
     * bude casy vykon�vat (viz 53 ��dka)
     * "switch" funguje jen pro int a String
     */
    public void metodaSwitch(String x){
        switch(x){
            case "0": 
                System.out.println("Je to nula.");
     
            case "1":
                System.out.println("Jsem jedni�ka.");
                break;
            case "22":
                System.out.println("Nesmysl.");
                break; //u posledn�ho by b�t nemusel, ale:
            default:
                System.out.println(x + " volbu nezn�m, nev�m, co m�m d�lat.");
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