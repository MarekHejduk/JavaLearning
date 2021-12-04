public class Osoba {
    private String jmeno;
    
    /**
     * this je odkaz na danou globální promìnnou
     * používá se hlavnì když lokální a globální promìnná mají stejný název
     * to znamená zpùsob jak lokální promìnnou z jedné metody moci použít v jiné metodì dané tøídy
     */
    public Osoba(String jmeno){
        this.jmeno = jmeno;
    }
    
    public void pozdrav(){
        System.out.println("Ahoj, jmenuji se " + jmeno);
    }
}