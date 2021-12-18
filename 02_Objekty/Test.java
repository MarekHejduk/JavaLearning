public class Test{
    private int cislo;
    public Test(){
        
        for (int y = 0; y < 20; y++){
            if(y == 6){
                continue;
            }
            for(int x = 0; x < 20; x++){
                new Elipsa(x * 15, y * 15, 10, 10, Barva.MODRA);
            }         
        }       


    }
    
    public void pokus(int cislo){
        if(cislo == 0){
            return;
        }
        System.out.println("Zadali jste èíslo " + cislo);
    }
    
    
    public void grafik(){
        // kdy kliknu pravım myšítkem na tøídu Statika, tak deklaruji promìnnou
        Statika testStatiky;
        // vyberu si konstruktor
        testStatiky = new Statika();
        // kdy kliknu pravım myšítkem na vytvoøenı objekt ve virtuálním stroji 
        // (èervené dole), znamená to, e volám testStatiky.nìjakáMetoda()
        testStatiky.getCislo();
        
    }
    
    
    public void getJmeno(){
        System.out.println("Tohle nic nevrátí! Vykonání akce neznamená, e VOID metoda nìco vrací.");
    }
    
    public String getJmeno2(){        
        return "Magda";
    }
    
    public void testik(){
        System.out.println(getJmeno2());
    }
    
    public void provolaniSimpsonu(){
        Simpsonovi volanyHomer = new Simpsonovi(Simpsonovi.homer);
        Simpsonovi objektBart = new Simpsonovi();
        Simpsonovi volanyBart = new Simpsonovi(objektBart.bart);
    }

}