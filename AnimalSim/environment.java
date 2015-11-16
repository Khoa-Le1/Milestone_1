/**
  * Author: Khoa Le
  * Student ID: 200338408 
  * Class: ENSE 374-093
  * Purpose: Initialize the environment in the animal simulation program 
  * Mon.Nov.11/15 
 */
 
 import java.util.*;
 
 public class environment{
	 
	 private world[][] grid = new world[150][150];
	 
	 public environment(){
		 grid = world.worldSet(150);
	 }
	 
	 public environment (int num_animals, int num_plants, int num_insects){
		 grid =  world.worldSet(150);
		 int plantCount  = 0;
		 int animalCount = 0;
		 int insectCount = 0; 
		 
		 //adding animals in the environment
		 while(animalCount != num_animals){
			 int i = rand(150);
			 int j = rand(150);
			 animal tempAnimal = new animal(rand(7));
			 grid[i][j].addAnimal(tempAnimal);
			 System.out.println("");
			 System.out.println("animal symbol: " + tempAnimal.getSymbol());
			 System.out.println("animal pos: " + "[" + i + "]"+ "[" + j + "]");
			 System.out.println("");
			 animalCount++; 
		 }
		 
		 //adding plants in the environment
		 	 while(plantCount != num_plants){
			 int i = rand(150);
			 int j = rand(150);
			 plant tempPlant = new plant(rand(2));
			 grid[i][j].addPlant(tempPlant);
			 System.out.println("");
			 System.out.println("plant symbol: " + tempPlant.getSymbol());
			 System.out.println("plant pos: " + "[" + i + "]"+ "[" + j + "]");
			 System.out.println("");
			 plantCount++; 
		 }
		 
		 //adding insects in the environment
		 	 while(insectCount != num_insects){
			 insect tempInsect = new insect(rand(2));
			 int i = rand(150);
			 int j = rand(150);
			 grid[i][j].addInsect(tempInsect);
			 System.out.println("");
			 System.out.println("insect symbol: " + tempInsect.getSymbol());
			 System.out.println("insect pos: " + "[" + i + "]"+ "[" + j + "]");
			 System.out.println("");
			 insectCount++; 
		 } 
	 }
	 
	 public static int rand(int r){
		 int randomNumber;
		 Random num_r = new Random();
		 randomNumber = num_r.nextInt(r-0) +0;
		 return randomNumber; 
	 }
 }