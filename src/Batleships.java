import java.util.*;

public class Batleships {

	public static void main(String[] args) {
		int[] shoot = new int[2];
		
		int	shotHit=0;
		
		System.out.println("Welcome to Battleship Game");
		System.out.println("This is Phase 1");
		System.out.println("Player 1 Place Your Ships on the Board");
		new Board().showBoard();
		Player player1 = new Player("Player", 1);
		System.out.println();
		new Board().hideShipsBoard();
		System.out.println();
		System.out.println("Player 2 Place your ships");
		Player player2 = new Player("Player 2", 2);
		System.out.println();
		System.out.println("Phase 1 Completed! Time to begin Phase 2");
		
			
		/*** System.out.println();
		
		do{
			Board().showBoard();
			Ships.shoot(shoot);
			
			
			if(Ships.hit(shoot, ships)){
			shotHit++;
				Board.updateBoard(shoot, ships, board);
		}
			else
				Board.updateBoard(shoot, ships, board);

	
	}while(shotHit!=12);
		
		Board.showBoard(board);***/
	}

}
