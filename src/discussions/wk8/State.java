public class State{
  
 private String sName = "None", sFlower = "None", sBird = "None"; 
 
 public State (){
  sName = this.sName; 
  sFlower = this.sFlower;
  sBird = this.sBird; 
  
 }
 
 
 public State(String sN, String sF,String sB){
   this.sName   = sN;
   this.sFlower = sF;
   this.sBird   = sB; 
   
 }
 
 public String getName(){
  return this.sName; 
 }
 
 public String getFlower(){
  return this.sFlower; 
 }
 
 public String getBird(){
  return this.sBird;  
 }
 
 public void setName(String sN){
  this.sName = sN;  
 }
 public void setFlower(String sF){
  this.sFlower = sF;  
 }
 public void setBird(String sB){
  this.sBird = sB; 
 }
 
  
}