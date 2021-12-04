public class Slunce{
    
    private Elipsa slunce;
    
    public Slunce(){
        slunce = new Elipsa(140, 10, 40, 40, Barva.ZLUTA);    
    }
        
    public void den(){
        slunce.setBarva(Barva.ZLUTA);
    }
    
    public void noc(){
        slunce.setBarva(Barva.BILA);
    }
    
}