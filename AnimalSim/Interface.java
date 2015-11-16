/**
  * Author: Khoa Le
  * Student ID: 200338408 
  * Class: ENSE 374-093
  * Purpose: To run the animal simulator 
  * Mon.Nov.11/15 
 */
 
import java.util.*;

public class Interface{	

	static String endl = System.getProperty("line.separator");
    Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Animal Simulator" + endl);
		int noP = 150;
		int noA = 50;
		int noI = 10;
		
		environment createWorld = new environment(noA, noP, noI);
	}
}