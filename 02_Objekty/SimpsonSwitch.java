public class SimpsonSwitch{
    
    String telo;
        
    public void simpsonSwitch(String telo){
        switch(telo){
            case "tlust�":
                System.out.println("Je to Homer!");
            break;
            
            case "�t�hl�":
                System.out.println("Je to Marge!");
            break;
            
            case "mal�":
                System.out.println("Je to B�rt!");
            break;
            
            case "men�� ne� mal�":
                System.out.println("Je to L�za!");
            break;
            
            case "nejmen��":
                System.out.println("Je to Maggie!");
            break;
            
            default:
                System.out.println("To nen� nikdo z rodiny Simpsonov�ch.");
                            
            
        }
        
    }
}