package discussions.wk3;

public class Week3 {
    public static void main(String[] args) {
        
        // Creates a random integer between 1 and 100(inclusive)
        int cnt = (int )(Math.random() * 100 + 1);
        
        // This is used to count how many times Harambe is printed. 
        // Appened as prefix.
        int timesPrinted = 0;
        
        // Effectively creates an infinite loop.
        while (true) { 
            
            // Checks for positive
            while (cnt > 0) {
                
                // Innermost loop which does the printing of Harambe
                for (int i = 0; i < cnt; i+=10) {
                    timesPrinted++;
                    System.out.println(timesPrinted + ": Harambe");
                }
                
                // Fixed decrement per iteration of while loop
                cnt-=20; 
            }
            
            // Ironic break statement breaks out of potential infinite loop.
            break; 
        }
    }
}