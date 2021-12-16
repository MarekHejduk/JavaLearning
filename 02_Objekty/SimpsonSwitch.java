public class SimpsonSwitch{
    
    String telo;
        
    public void simpsonSwitch(String telo){
        switch(telo){
            case "tlusté":
                System.out.println("Je to Homer!");
            break;
            
            case "štíhlé":
                System.out.println("Je to Marge!");
            break;
            
            case "malé":
                System.out.println("Je to Bárt!");
            break;
            
            case "menší než malé":
                System.out.println("Je to Líza!");
            break;
            
            case "nejmenší":
                System.out.println("Je to Maggie!");
            break;
            
            default:
                System.out.println("To není nikdo z rodiny Simpsonových.");
                            
            
        }
        
    }
}