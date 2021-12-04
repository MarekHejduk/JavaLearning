public class BarakNaOdstrel{
    
    private Trojuhelnik strecha;
    private Obdelnik leveOkno;
    private Obdelnik praveOkno;
    
    public BarakNaOdstrel(){
        postavDum();
        zhasni();
    }
    
    public void postavDum() {
        strecha = new Trojuhelnik(0, 0, 150, 75, Barva.CERVENA);
        new Obdelnik(0, 75, 150, 75, Barva.ZELENA);
        leveOkno = new Obdelnik(10, 95, 22, 22, Barva.ZLUTA);
        praveOkno = new Obdelnik(42, 95, 22, 22, Barva.ZLUTA);
        new Obdelnik(84, 100, 30, 50, Barva.HNEDA);
    }
    
    public void prebarviStrechu(Barva novaBarva){
        strecha.setBarva(novaBarva);
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