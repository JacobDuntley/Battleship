import java.util.Scanner;

public class firstProject {
    public static void main(String[] args) {
      Scanner spot = new Scanner(System.in);
      
      
    	String[][] board = new String[10][10];
    	boolean[][] realBoard = new boolean[10][10];
    	for (int row = 0; row < realBoard.length; row++){
    	  for (int col = 0; col < realBoard[row].length; col++){
    	    realBoard[row][col] = false;
    	  }
    	}
    	
    	for (int row = 0; row < 10; row++){
    	  for (int col = 0; col < 10; col++){
    	    board[row][col] = "-";
    	  }
    	}
    	placeShips(realBoard);
    	while (true){
    	  int spotRow = 0;
    	  int spotCol = 0;
    	  do{
      	  makeBoard(board);
      	  System.out.println("Choose the row you want to attack on.");
      	  spotRow = spot.nextInt();
      	  System.out.println("Choose the collumn you want to attack on.");
      	  spotCol = spot.nextInt();
      	  if (spotRow < 0 || spotRow > 9 || spotCol < 0 || spotCol > 9){
      	    System.out.println("Your coordinates are out of bounds!");
      	  }
    	  } while (spotRow < 0 || spotRow > 9 || spotCol < 0 || spotCol > 9);
    	  
    	  if (realBoard[spotRow][spotCol] == true){
    	    board[spotRow][spotCol] = "X";
    	  }
    	  else if (board[spotRow][spotCol].equals("X")){
    	    System.out.println("You already entered these coordinates!");
    	  }
    	  else if (realBoard[spotRow][spotCol] == false){
    	    System.out.println("You missed!");
    	    board[spotRow][spotCol] = ("O");
    	  }
    	  
    	}
    	
    	
    	
    	
    	
    	
    }
    public static void makeBoard(String[][] board){
      System.out.print("  ");
      for (int ten = 0; ten < 10; ten++){
        System.out.print(ten);
        System.out.print("  ");
      }
      System.out.println();
      
      for (int row = 0; row < board.length; row++){
        System.out.print(row);
        for (int col = 0; col < board[row].length; col++){
          System.out.print(" " + board[row][col] + " ");
        }
        System.out.println();
      }
    }
    public static void placeShips(boolean[][] realBoard){
      int firstRow = ((int)(Math.random() * 6) + 2);
      int firstCol = ((int)(Math.random() * 6) + 2);
      realBoard[firstRow][firstCol] = true;
      realBoard[firstRow + 1][firstCol] = true;
      realBoard[firstRow + 2][firstCol] = true;
      
      int secRow = ((int)(Math.random() * 5) + 1);
      int secCol = ((int)(Math.random() * 5) + 1);
      realBoard[secRow][secCol + 1] = true;
      realBoard[secRow][secCol + 2] = true;
      realBoard[secRow][secCol + 3] = true;
      realBoard[secRow][secCol + 4] = true;
      
    }
    
}
