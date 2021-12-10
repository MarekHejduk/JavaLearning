public class Panelak{
    
    private Obdelnik zdi;
    private Trojuhelnik strecha;
    private Obdelnik dvere;
    private Obdelnik okno;
    private int sirka;
    private int vyska;


    
    
    public Panelak(){
    
        zdi = new Obdelnik(50, 50, 300, 700, Barva.BILA);
        strecha = new Trojuhelnik(50, 0, 300, 50, Barva.CERVENA);
        dvere = new Obdelnik(184, 690, 25, 60, Barva.CERNA);

        
        
        
    }
}