public class Osoba {
    private String jmeno;
    
    /**
     * this je odkaz na danou glob�ln� prom�nnou
     * pou��v� se hlavn� kdy� lok�ln� a glob�ln� prom�nn� maj� stejn� n�zev
     * to znamen� zp�sob jak lok�ln� prom�nnou z jedn� metody moci pou��t v jin� metod� dan� t��dy
     */
    public Osoba(String jmeno){
        this.jmeno = jmeno;
    }
    
    public void pozdrav(){
        System.out.println("Ahoj, jmenuji se " + jmeno);
    }
}