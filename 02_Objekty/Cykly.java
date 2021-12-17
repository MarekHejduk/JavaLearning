public class Cykly{
    
    
    private int x = 0;
/*
 * Existují ètyøi cykly:
 * for
 * while
 * do while
 * rekurze (rekurze = metoda, která volá samu sebe)
 */
    /**
     * 1. hlavièk for cyklu obsahuje tøi èásti:
     * a) poèáteèní promìnnou
     * b) podmínku dalšího kroku (nezaèínáme if, ale jde nám o logický výraz)
     * c) iterace (navýšení/snížení promìnné)
     * 2. v hlavièce jsou tyto èásti oddìlené støedníky
     * 3. cyklus "iteruje" = iterace znamená procházení
     * 4. pokud zvyšujeme/snižujeme pouze o jednu hodnotu, máme v Javì syntaxi
     * ++ nebo -- u promìnné, kterou zvyšujeme/snižujeme (POZOR, FUNGUJE TO VŽDY,
     * NE JEN V CYKLU) i = i+1 je to samé, jako i++ (navýšení + pøiøazení)
     * 5. prùbìh for cyklu: 
     * a) z hlavièky si vezme poèáteèní hodnotu (int i = 0)
     * b) ovìøí si podmínku z druhé èásti hlavièky (zda je i < 100)
     * c) pokud podmínka platí, vykoná se tìlo cyklu
     * d) na konci všech pøíkazù z tìla cyklu se vykoná tøetí èást hlavièky (i++)
     * e) první èást se už neøeší a pøejde se k podmínce ze druhé èásti hlavièky
     * pozn. dalo by se øíci, že cyklus platí, dokud platí podmínka ve druhé èásti
     * 6. pokud je v tìle cyklu pøíkaz "continue", ukonèí se aktuální iterace 
     * (ignoruje se zbytek tìla cyklu a pøejde se na podmínky z druhé èásti
     * hlavièky)
     * pozn. "continue" pouze v cyklu, "break" funguje v cyklu a ve switchi
     * 7. pokud je v kódu pøíkaz "break", tak se cyklus ukonèí
     * pozn. pøíkazy "continue" i "break" se zapisují tak, že se zapíše na øádek
     * jen tento pøíkaz a ";"
     * pozn. pokud není "continue" nebo "break" v tìle podmínky (if(){toto tìlo}),
     * tak se cyklus provede jen do daného bodu, vše ostatní bude ignorováno
     */
    public void forCyklus(){
        
        for(int i = 0; i < 100; i++){
            System.out.println("Hodnota i = " + i);
            new Obdelnik();
        }

    }        

    //nekoneèný cyklus
    public void nekonecnyCyklus(){
        int x = 12;
        for(;true;){
            System.out.println(x++);
        }    
    }
    
    /**
     * 1. u while platí "dìlej nìco, dokud platí podmínka"
     * 2. rozdíl mezi for a while: while pracuje se vstupem
     * while pracuje do doby, než dojde ke zmìnì stavu (napø. než nìco uživatel 
     * zadá, než bude ta a ta hodina, než uplyne urèitý èas...)
     * for pracuje s pøesnì stanoveným poètem prvkù
     */
    public void metodaWhile(){
      int i = 0;
        while(i < 100){
    //    jinak napsaný for cyklus
        i++;
        System.out.println("Hodnota i = " + i);
        new Obdelnik();      
        }
    /*
        long time = System.currentTimeMillis();
        while(System.currentTimeMillis() <= time + 20000){
            System.out.println(System.currentTimeMillis());
        }
    */    
    }
    
    /**
     * projde alespoò jednou (i kdyby podmínka nebyla splnìna)
     * funguje to tak, že se poprvé provede "do", potom se vyhodnotí podmínka
     * a pokud podmínka platí, program se vrátí pøed "do" a opìt jej provede,
     * pokud podmínka neplatí, pokraèuje dál v kódu
     */
    public void metodaDoWhile(){
        int x = 0;
        do{
            System.out.println("Jsem do while metoda.");
            x++;
        } while(x<6);
        System.out.println("Skonèil jsem.");
    }
    
    /**
     * 1. rekurze je metoda, která volá samu sebe
     * 2. je velice dùležité, aby v rekurzi byla podmínka, do kdy má platit
     * pozn. pokud taková podmínka chybí, program se zacyklí (velmi èastá chyba)
     * 3. rekurze se využívá pøi procházení adresáøù, pøípadnì jiných stromových
     * struktur
     * 4. rekurze by mìla mít parametry, alespoò jeden
     * pozn. smyslem rekurze je vždy porovnávat parametr a pokud volá sama
     * sebe znovu, tak se volá s jiným parametrem
     */
    public void rekurze(int cislo){
        if(cislo < 10){
            System.out.println("Hodnota je " + cislo + ", což je < 10. Zvyšuji " +
            "hodnotu o jedno.");
            rekurze(cislo + 1);
        }
    }
}

