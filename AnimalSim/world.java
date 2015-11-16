/**
  * Author: Khoa Le
  * Student ID: 200338408 
  * Class: ENSE 374-093
  * Purpose: Initialize the environment in the animal simulation program 
  * Mon.Nov.11/15 
 */
 
 import java.util.*;
 
 public class world {
	 
	ArrayList<plant> plants;
	ArrayList<animal> animals;
	ArrayList<insect> insects;
	
	//add an animal to the array of animals
	public void addAnimal(animal a){	
		animals.add(a);
	}
	
	//add an plants to the array of plants
	public void addPlant(plant p){
		plants.add(p);
	}
	
	//add an insects to the array of insects
	public void addInsect(insect i){
		insects.add(i);
	}
	
	//create the world for the animals to live in 
	public static world[][] worldSet(int size){
		world[][] grid = new world[size][size];
		for (int i =0; i<size;i++){
			for (int j =0;j<size;j++){
				grid[i][j] = new world();
				grid[i][j].plants = new ArrayList<plant>();
				//System.out.println("plant pos: " + grid[i][j].plants);
				//System.out.println("plant pos: " + grid[i][j].animal.getSymbol());
				
				grid[i][j].animals = new ArrayList<animal>();
				//System.out.print(grid[i][j].animal.getSymbol());
				//System.out.println("animals pos: " + i + " " + j);
				//System.out.println("animal symbol: " + grid[i][j].plant.getSymbol());
				
				grid[i][j].insects = new ArrayList<insect>();
				//System.out.println("insect pos: " + i + " " + j);
				//System.out.println("insect symbol: " + grid[i][j].insects.getSymbol());
			}
		}
		
	/*
	for(int i =0; i < 150; i++)// i represents the rows we are on
	 {
		 for (int j =0; j < 150; j++)
		 {			 
			 System.out.print(grid[i][j].getSymbol());			 
		 }
	 }
	 */
		return grid;
	}
	
	/*
	public char getSymbol(){
		char s;
		if(!(animals.isEmpty())){
			return animals.get(0).symbol;
		}				
		if(!(plants.isEmpty()))
			return plants.get(0).symbol;
		else
			s = ' ';
		if(!(insects.isEmpty())){
			return insects.get(0).symbol;
		}	
		return s;
	}	
*/	
}