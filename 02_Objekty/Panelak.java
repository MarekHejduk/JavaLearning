public class Panelak{
    
    private Obdelnik zdi;
    private Trojuhelnik strecha;
    private Obdelnik dvere;
    private Obdelnik okno1;
    private int sirka;
    private int vyska;
    //private Platno platno = new Platno();
    private Platno platno = Platno.getPlatno();


    
    
    public Panelak(boolean nakreslitOkna){
        
        platno.setRozmer(800, 800);    
        zdi = new Obdelnik(50, 50, 300, 700, Barva.BILA);
        strecha = new Trojuhelnik(50, 0, 300, 50, Barva.CERVENA);
        dvere = new Obdelnik(184, 690, 25, 60, Barva.CERNA);
        
        // vykøièník obecnì mìní (neguj) výraz
        // nakreslitOkna = !nakreslitOkna; (tento øádek pøemìní false na true
        // nebo true na false)
        
        // pokud je vykøièník (negace) v podmínce, tak se PTÁME na opaèný
        // výsledek
        /*
         * pøíklad:
         * if (nakreslitOkna == true) je to samé, jako if (nakreslitOkna)
         * if (nakreslitOkna == false) je to samé, jako if(nakreslitOkna != true)
         * a je to to samé, jako if(!nakreslitOkna)
         */
        if(!nakreslitOkna){ //!nakrestliOkna je to samé, jako nakreslitOkna == false
            return;
        }
        //for cyklus sloupcù
        for(int i2 = 0; i2 < 21; i2++){
            
           //for cyklus øádkù            
           for(int i = 0; i < 9; i++){
                okno1 = new Obdelnik(66 + (30 * i), 57 + (30 * i2), 22, 22, Barva.ZLUTA);
           }
        }
        
        //okno1.setBarva(Barva.CERNA);
    }
    
}