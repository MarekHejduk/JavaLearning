public class MojeMetody{
    private int vek;
    private Obdelnik obdelnik;

    /**
     * 1) konstruktor = speciální pøípad metody, díky kterému vytvoøíme NOVÝ objekt
     * 2) konstruktor nemá návratový typ
     * 3) konstruktor musí mít stejný název jako tøída
     * 4) Implicitní konstruktor = každá tøída musí mít nìjaký konstruktor.
     *      implicitní konstrktor dosadí Java VŽDY, když není žádný konstrutkro v kódu
     */
    public MojeMetody(){
        Obdelnik obdelnikObjekt = new Obdelnik();
        String obdelnikString = "obdelnik";
        obdelnikObjekt.posunVlevo();
    }
    
    /**
     * vzor obyèejné metody
     */
    public void testovaciMetoda(){
        vek = 3;
        obdelnik = new Obdelnik();
        
        System.out.println(vek);
        System.out.println(obdelnik);

        
    }
    
}