public class PoPaduMeteoritu{
    
    private Trojuhelnik levaStrecha;
    private Trojuhelnik pravaStrecha;
    private Obdelnik komin;
    private Elipsa meteorit;
    private Elipsa slunce;
    private Obdelnik leveOkno;
    private Obdelnik praveOkno;
    
    public PoPaduMeteoritu(){
        postavDum();
        zhasni();
    }
    
    public void postavDum() {
        levaStrecha = new Trojuhelnik(30, 75, 75, 35, Barva.CERVENA);
        pravaStrecha = new Trojuhelnik(103, 75, 75, 35, Barva.CERVENA);
        komin = new Obdelnik(145, 70, 20, 40, Barva.CERVENA);
        meteorit = new Elipsa(75, 65, 60, 60, Barva.SEDA);
        slunce = new Elipsa(140, 10, 40, 40, Barva.ZLUTA);
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
        slunce.setBarva(Barva.ZLUTA);
    }
    
    public void zhasni(){
        leveOkno.setBarva(Barva.CERNA);
        praveOkno.setBarva(Barva.CERNA);
        slunce.setBarva(Barva.BILA);
    }
    
}