public class Test{
    
    public Test(){
        Strom strom = new Strom();
        strom.setPozice(55, 75);
        if (strom.getX() == 55){
            System.out.println("Pøesunuto v poøádku.");
        } else{
            System.out.println("Chybná pozice.");
        }
    }
    
}