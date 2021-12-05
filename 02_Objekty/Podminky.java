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
    
    public void test(){
        Strom strom = new Strom();
        Podminky testPodminek = new Podminky();
        testPodminek.podminky(strom);
        strom.setPozice(25, 50);
        testPodminek.podminky(strom);
    }
    
}