package GameOfLife;
			
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
			
public class RulesOfLife {
					public static int gridWidth = 50;
					public static int gridHeight = 50;
					public static HashSet<Point> Glider = new HashSet<Point>(
											Arrays.asList(
												new Point(4,3), new Point(5,4), new Point(5,5), new Point(4,5), new Point(3,5)
											)
					);
					public static HashSet<Point> Blinker = new HashSet<Point>(
																Arrays.asList(
																	new Point(3,3), new Point(3,4), new Point(21,20), new Point(3,5)
																)
										);
					public static ArrayList<Point> populatedCells;
					public static HashSet<Point> initialCells;
					
					static {
						initialCells = new HashSet<Point>(
												Arrays.asList(
												)
											);
						initialCells.addAll(Glider);
						populatedCells = new ArrayList<>(initialCells);
					}
					 
					public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
			        	// Iterate through the array, follow game of life rules
			       	 for (int i=1; i<gameBoard.length-1; i++) {
			            for (int j=1; j<gameBoard[0].length-1; j++) {
			                int surrounding = 0;
			                if (gameBoard[i-1][j-1]) { surrounding++; }
			                if (gameBoard[i-1][j])   { surrounding++; }
			                if (gameBoard[i-1][j+1]) { surrounding++; }
			                if (gameBoard[i][j-1])   { surrounding++; }
			                if (gameBoard[i][j+1])   { surrounding++; }
			                if (gameBoard[i+1][j-1]) { surrounding++; }
			                if (gameBoard[i+1][j])   { surrounding++; }
			                if (gameBoard[i+1][j+1]) { surrounding++; }
if ((gameBoard[i][j]) && 
(surrounding < 2) 
){
	Point pointToRemove = new Point(i, j);
	                		survivingCells.removeIf(point -> point.equals(pointToRemove));
}
if ((gameBoard[i][j]) && 
(surrounding == 2) ||
(surrounding == 3) 
){
	survivingCells.add(new Point(i-1,j-1));
}
if ((!gameBoard[i][j]) && 
(surrounding == 3) 
){
	survivingCells.add(new Point(i-1,j-1));
}
if ((gameBoard[i][j]) && 
(surrounding >= 4) 
){
	Point pointToRemove = new Point(i, j);
	                		survivingCells.removeIf(point -> point.equals(pointToRemove));
}
			}
					}
					}
				}
