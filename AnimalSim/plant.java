/**
  * Author: Khoa Le
  * Student ID: 200338408 
  * Class: ENSE 374-093
  * Purpose: Initialize the plant class in the animal simulation program 
  * Mon.Nov.11/15 
 */
 
  public class plant{
	  
	  public char symbol; 
	  
	  public plant(int plantType){
		if(plantType == 0){ 
			this.symbol = 'T'; 	 //represents a Tree
		}
		else if(plantType == 1){  
			this.symbol = 'S';   //represents a Shrub 
		}
		else{
			this.symbol = 'g';   //represents grass 
		}
	  }
	  
	public char getSymbol(){
		return symbol;
	}
  }