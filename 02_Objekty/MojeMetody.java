public class MojeMetody{
    private int vek;
    private Obdelnik obdelnik;

    /**
     * 1) konstruktor = speci�ln� p��pad metody, d�ky kter�mu vytvo��me NOV� objekt
     * 2) konstruktor nem� n�vratov� typ
     * 3) konstruktor mus� m�t stejn� n�zev jako t��da
     */
    public MojeMetody(){
        Obdelnik obdelnikObjekt = new Obdelnik();
        String obdelnikString = "obdelnik";
        obdelnikObjekt.posunVlevo();
    }
    
    /**
     * vzor oby�ejn� metody
     */
    public void testovaciMetoda(){
        vek = 3;
        obdelnik = new Obdelnik();
        
        System.out.println(vek);
        System.out.println(obdelnik);

        
    }
    
}