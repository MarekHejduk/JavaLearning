public class Panelak{
    
    private Obdelnik zdi;
    private Trojuhelnik strecha;
    private Obdelnik dvere;
    private Obdelnik okno1;
    private Obdelnik okno2;
    private Obdelnik okno3;
    private Obdelnik okno4;
    private Obdelnik okno5;
    private Obdelnik okno6;
    private Obdelnik okno7;
    private Obdelnik okno8;
    private Obdelnik okno9;
    private int sirka;
    private int vyska;
    //private Platno platno = new Platno();
    private Platno platno = Platno.getPlatno();


    
    
    public Panelak(){
        
        platno.setRozmer(800, 800);    
        zdi = new Obdelnik(50, 50, 300, 700, Barva.BILA);
        strecha = new Trojuhelnik(50, 0, 300, 50, Barva.CERVENA);
        dvere = new Obdelnik(184, 690, 25, 60, Barva.CERNA);
        okno1 = new Obdelnik(66, 57, 22, 22, Barva.ZLUTA);
        okno2 = new Obdelnik(96, 57, 22, 22, Barva.ZLUTA);
        okno3 = new Obdelnik(125, 57, 22, 22, Barva.ZLUTA);
        okno4 = new Obdelnik(154, 57, 22, 22, Barva.ZLUTA);
        okno5 = new Obdelnik(183, 57, 22, 22, Barva.ZLUTA);
        okno6 = new Obdelnik(212, 57, 22, 22, Barva.ZLUTA);
        okno7 = new Obdelnik(241, 57, 22, 22, Barva.ZLUTA);
        okno8 = new Obdelnik(270, 57, 22, 22, Barva.ZLUTA);
        okno9 = new Obdelnik(299, 57, 22, 22, Barva.ZLUTA);


        
        
        
    }
}