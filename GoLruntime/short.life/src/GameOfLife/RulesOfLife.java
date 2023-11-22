package GameOfLife;
			
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
			
public class RulesOfLife {
					public static int gridWidth = 50;
					public static int gridHeight = 50;
					public static ArrayList<Point> populatedCells = new ArrayList<Point>(
						Arrays.asList(
							new Point(1,49), 
							new Point(3,4)
						)
					);
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
(surrounding == 2) ||
(surrounding == 6) 
){
	survivingCells.add(new Point(i-1,j-1));
}
if ((!gameBoard[i][j]) && 
(surrounding == 3) 
){
	survivingCells.add(new Point(i-1,j-1));
}
if ((gameBoard[i][j]) && 
(surrounding == 4) 
){
	Point pointToRemove = new Point(i, j);
	                		survivingCells.removeIf(point -> point.equals(pointToRemove));
}
if ((gameBoard[i][j]) && 
(surrounding == 4) 
){
	Point pointToRemove = new Point(i, j);
	                		survivingCells.removeIf(point -> point.equals(pointToRemove));
}
			}
					}
					}
				}
