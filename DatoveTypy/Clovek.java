

public class Clovek
{
    private String jmeno = "Marek";
    private int vek = 30;
    private String motoDne = "Žiju, piju a miluju";
    private int cisloRostliny = 5;
    private String typRostliny = "fialka";
    private int vyskaRostliny = 70;
    private Rostlina rostlina = new Rostlina();
    
    public void zjistiNeco() {
        System.out.println(cisloRostliny);
        System.out.println(typRostliny);
        System.out.println(rostlina.getCislo());
        System.out.println(rostlina.getVyskaRostliny());
        
    //rostlina.getTypRostliny();
    }
}
