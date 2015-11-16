/**
  * Author: Khoa Le
  * Student ID: 200338408 
  * Class: ENSE 374-093
  * Purpose: Initialize the animal class in the animal simulation program 
  * Mon.Nov.11/15 
 */
 
 public class animal{
	 
	public int movement;
	public char symbol; 
	public int starvation; 
	
	public animal(int animalType){
		if(animalType == 0){ 
			this.starvation = 0; 
			this.symbol = 'm'; 	 //represents a mouse
			this.movement = 3;
		}
		else if(animalType == 1){ 
			this.starvation = 0; 
			this.symbol = 's';   //represents a squirrel
			this.movement = 3;   
		}
		else if(animalType == 2){
			this.starvation = 0; 
			this.symbol = 'r';	 //represents a rabbit
			this.movement = 3;   
		}
		else if(animalType == 3){ 
			this.starvation = 0; 
			this.symbol = 'd';	 //represents a deer
			this.movement = 3;
		}
		else if(animalType == 4){
			this.starvation = 0; 
			this.symbol = 'b';	 //represents a Bluejay
			this.movement = 5;
		}
		else if(animalType == 5){
			this.starvation = 0; 			
			this.symbol = 'h';	 //represents a hawk
			this.movement = 5;
		}
		else if(animalType == 6){ 
			this.starvation = 0; 
			this.symbol = 'w';	 //represents a wolf
			this.movement = 3;
		}
		else if(animalType == 7){
			this.starvation = 0; 
			this.symbol = 'f';	 //represents a fox
			this.movement = 3;
		}
		else{
			this.starvation = 0; 
			this.symbol = ' ';	 
			this.movement = 0;
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