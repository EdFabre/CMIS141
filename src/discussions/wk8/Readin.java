import java.io.*;
import java.util.*;
  public class Readin{
 
  static FileInputStream in = null; 
  public static Scanner getPut = new Scanner(System.in); 
  
  public static void main(String args[]){
    List<State> states = new ArrayList<State>(); 
    int nC = 0; 
   
    try (BufferedReader br = new BufferedReader (new FileReader("states.txt"))){
     
      
      
      
       String input = ""; 
       
      
      while ((input = br.readLine()) != null){
       
        String delims ="[,]"; 
        String[] in = input.split(delims); 
        
        State state = new State();
        
        state.setName(in[0]);
        state.setFlower(in[1]);
        state.setBird(in[2]);
        
        states.add(state); 
        nC++; 
      }
      
      
      
      
    }catch(IOException e){
      System.out.println("Cannot find file"); 
    }
    
    

     for (int i = 0; i < states.size(); i++){      
         
           System.out.println(i+1 + ": State name: " + states.get(i).getName()
                              + " State Flower: " + states.get(i).getFlower()
                             + " State Bird: " + states.get(i).getBird());
           
         
          
       }
      System.out.println( nC + " Data values were read.");
      
      
   
   
    
  }
  
  
}