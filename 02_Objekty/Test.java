public class Test{
    
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
}