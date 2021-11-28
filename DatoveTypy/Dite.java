

public class Dite
{
    private static int pocetDetiNaSvete = 654648;
    
    public static int getPocetDetiNaSvete() {
        return pocetDetiNaSvete;
    }
    
    public static void setPocetDetiNaSvete(int pocetDetiNaSvete) {
        Dite.pocetDetiNaSvete = pocetDetiNaSvete;
    }
    
    public void umyjMiAuto() {
        System.out.println("Leopolde, umyj mi auto!");
        System.out.println("Táto, seru na tebe!");
    }
    
    public void umyjMiAuto2(){
        Marek marek = new Marek();
        marek.vychovejDite();
        System.out.println("Leopolde, umyj mi auto!");
        System.out.println("Táto, už jdu na to!");
    }
}
