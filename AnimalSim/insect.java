/**
  * Author: Khoa Le
  * Student ID: 200338408 
  * Class: ENSE 374-093
  * Purpose: Initialize the insect class in the animal simulation program 
  * Mon.Nov.11/15 
 */
 
  public class insect{
	 
	public int movement;
	public char symbol; 
	public int starvation; 
	
	public insect(int insectType){
		if(insectType == 0){ 
			this.starvation = 0; 
			this.symbol = 'c'; 	 //represents a caterpillar
			this.movement = 1;
		}
		else if(insectType == 1){ 
			this.starvation = 0; 
			this.symbol = 'G';   //represents a grasshopper
			this.movement = 1;   
		}
	}
	
	public int getStarvation(){
		return starvation;
	}
	
	public char getSymbol(){
		return symbol;
	}
	
	public int getMovement(){
		return movement;
	}
  }