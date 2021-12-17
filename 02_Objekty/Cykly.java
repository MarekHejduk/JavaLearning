public class Cykly{
    
    
    private int x = 0;
/*
 * Existuj� �ty�i cykly:
 * for
 * while
 * do while
 * rekurze (rekurze = metoda, kter� vol� samu sebe)
 */
    /**
     * 1. hlavi�k for cyklu obsahuje t�i ��sti:
     * a) po��te�n� prom�nnou
     * b) podm�nku dal��ho kroku (neza��n�me if, ale jde n�m o logick� v�raz)
     * c) iterace (nav��en�/sn�en� prom�nn�)
     * 2. v hlavi�ce jsou tyto ��sti odd�len� st�edn�ky
     * 3. cyklus "iteruje" = iterace znamen� proch�zen�
     * 4. pokud zvy�ujeme/sni�ujeme pouze o jednu hodnotu, m�me v Jav� syntaxi
     * ++ nebo -- u prom�nn�, kterou zvy�ujeme/sni�ujeme (POZOR, FUNGUJE TO V�DY,
     * NE JEN V CYKLU) i = i+1 je to sam�, jako i++ (nav��en� + p�i�azen�)
     * 5. pr�b�h for cyklu: 
     * a) z hlavi�ky si vezme po��te�n� hodnotu (int i = 0)
     * b) ov��� si podm�nku z druh� ��sti hlavi�ky (zda je i < 100)
     * c) pokud podm�nka plat�, vykon� se t�lo cyklu
     * d) na konci v�ech p��kaz� z t�la cyklu se vykon� t�et� ��st hlavi�ky (i++)
     * e) prvn� ��st se u� ne�e�� a p�ejde se k podm�nce ze druh� ��sti hlavi�ky
     * pozn. dalo by se ��ci, �e cyklus plat�, dokud plat� podm�nka ve druh� ��sti
     * 6. pokud je v t�le cyklu p��kaz "continue", ukon�� se aktu�ln� iterace 
     * (ignoruje se zbytek t�la cyklu a p�ejde se na podm�nky z druh� ��sti
     * hlavi�ky)
     * pozn. "continue" pouze v cyklu, "break" funguje v cyklu a ve switchi
     * 7. pokud je v k�du p��kaz "break", tak se cyklus ukon��
     * pozn. p��kazy "continue" i "break" se zapisuj� tak, �e se zap�e na ��dek
     * jen tento p��kaz a ";"
     * pozn. pokud nen� "continue" nebo "break" v t�le podm�nky (if(){toto t�lo}),
     * tak se cyklus provede jen do dan�ho bodu, v�e ostatn� bude ignorov�no
     */
    public void forCyklus(){
        
        for(int i = 0; i < 100; i++){
            System.out.println("Hodnota i = " + i);
            new Obdelnik();
        }

    }        

    //nekone�n� cyklus
    public void nekonecnyCyklus(){
        int x = 12;
        for(;true;){
            System.out.println(x++);
        }    
    }
    
    /**
     * 1. u while plat� "d�lej n�co, dokud plat� podm�nka"
     * 2. rozd�l mezi for a while: while pracuje se vstupem
     * while pracuje do doby, ne� dojde ke zm�n� stavu (nap�. ne� n�co u�ivatel 
     * zad�, ne� bude ta a ta hodina, ne� uplyne ur�it� �as...)
     * for pracuje s p�esn� stanoven�m po�tem prvk�
     */
    public void metodaWhile(){
      int i = 0;
        while(i < 100){
    //    jinak napsan� for cyklus
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
     * projde alespo� jednou (i kdyby podm�nka nebyla spln�na)
     * funguje to tak, �e se poprv� provede "do", potom se vyhodnot� podm�nka
     * a pokud podm�nka plat�, program se vr�t� p�ed "do" a op�t jej provede,
     * pokud podm�nka neplat�, pokra�uje d�l v k�du
     */
    public void metodaDoWhile(){
        int x = 0;
        do{
            System.out.println("Jsem do while metoda.");
            x++;
        } while(x<6);
        System.out.println("Skon�il jsem.");
    }
    
    /**
     * 1. rekurze je metoda, kter� vol� samu sebe
     * 2. je velice d�le�it�, aby v rekurzi byla podm�nka, do kdy m� platit
     * pozn. pokud takov� podm�nka chyb�, program se zacykl� (velmi �ast� chyba)
     * 3. rekurze se vyu��v� p�i proch�zen� adres���, p��padn� jin�ch stromov�ch
     * struktur
     * 4. rekurze by m�la m�t parametry, alespo� jeden
     * pozn. smyslem rekurze je v�dy porovn�vat parametr a pokud vol� sama
     * sebe znovu, tak se vol� s jin�m parametrem
     */
    public void rekurze(int cislo){
        if(cislo < 10){
            System.out.println("Hodnota je " + cislo + ", co� je < 10. Zvy�uji " +
            "hodnotu o jedno.");
            rekurze(cislo + 1);
        }
    }
}

