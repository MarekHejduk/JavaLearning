public class PoPaduMeteoritu{
    
    private Trojuhelnik levaStrecha;
    private Trojuhelnik pravaStrecha;
    private Obdelnik komin;
    private Elipsa meteorit;
    private Obdelnik leveOkno;
    private Obdelnik praveOkno;
    private Strom strom;
    
    public PoPaduMeteoritu(){
        postavDum();
        zhasni();
        //strom = new Strom();
        //strom.setPozice(200, 200);
    }
    
    public void postavDum() {
        levaStrecha = new Trojuhelnik(30, 75, 75, 35, Barva.CERVENA);
        pravaStrecha = new Trojuhelnik(103, 75, 75, 35, Barva.CERVENA);
        komin = new Obdelnik(145, 70, 20, 40, Barva.CERVENA);
        meteorit = new Elipsa(75, 65, 60, 60, Barva.SEDA);
        new Obdelnik(30, 105, 150, 75, Barva.ZELENA);
        leveOkno = new Obdelnik(40, 125, 22, 22, Barva.ZLUTA);
        praveOkno = new Obdelnik(72, 125, 22, 22, Barva.ZLUTA);
        new Obdelnik(124, 130, 30, 50, Barva.HNEDA);
    }
    
    public void prebarviStrechu(Barva novaBarva){
        levaStrecha.setBarva(novaBarva);
        pravaStrecha.setBarva(novaBarva);
    }
        
    public void rozsvit(){
        leveOkno.setBarva(Barva.ZLUTA);
        praveOkno.setBarva(Barva.ZLUTA);    
    }
           
    public void zhasni(){
        leveOkno.setBarva(Barva.CERNA);
        praveOkno.setBarva(Barva.CERNA);
    }
    
}