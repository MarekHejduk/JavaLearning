public class Priklad{
    
    /*
        int a = 5;
        int b = 3;
        String x = "+";    
*/
    
    
     public static void prikladSwitch1(String x, int a, int b){
       
        switch(x){
            case "+":
                System.out.println("V�sledkem je " + (a + b));
            break;
            
            case "-":
                System.out.println("V�sledkem je " + (a - b));
            break;
            
            case "*":
                System.out.println("V�sledkem je " + (a * b));
            break;    
                
            case "/":
                System.out.println("V�sledkem je " + (a / b));
            break;
            
            default:
                System.out.println("Toto znam�nko nezn�m.");
                
            }
    
  }
        
        

}