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
        System.out.println("Zadali jste ��slo " + cislo);
    }
    
    
    public void grafik(){
        // kdy� kliknu prav�m my��tkem na t��du Statika, tak deklaruji prom�nnou
        Statika testStatiky;
        // vyberu si konstruktor
        testStatiky = new Statika();
        // kdy� kliknu prav�m my��tkem na vytvo�en� objekt ve virtu�ln�m stroji 
        // (�erven� dole), znamen� to, �e vol�m testStatiky.n�jak�Metoda()
        testStatiky.getCislo();
        
    }
    
    
    public void getJmeno(){
        System.out.println("Tohle nic nevr�t�! Vykon�n� akce neznamen�, �e VOID metoda n�co vrac�.");
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