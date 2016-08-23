
public class Board {
	private int board[][];

	public Board(){
		this.createBoard();
	}
		//creates the board
		public void createBoard(){
			this.board = new int [12][12];
		for(int row=0; row <12; row++)
			for(int column=0; column<12; column++)
				board[row][column]= -1;				
			}
		
		//displays board
		public void showBoard(){
		System.out.println("    1  "+ " 2  " + "3  " + " 4  " +" 5  " + " 6  "+ " 7  " +" 8  "+ " 9  "+" 10  "+	"11  "+"12  "); //column number
		  System.out.println("---------------------------------------------------"); 
		  	 	
		for (int row=0; row <12; row++){// row numbers
			if(row<9){
			System.out.print(" "+(row+1)+" ");}
			else
				System.out.print((row+1)+" ");
			for(int column=0; column<12; column++){
				if(board[row][column]==-1){
					System.out.print(" " + "~");// water
				}else if(board[row][column]==0){// miss
					System.out.print(" " + "0" );
				}else if(board[row][column]==1){// hit 
					System.out.print(" " + "X" );
				}
	            if (column != column - 1) {
	                System.out.print(" "+"|"); //prints out lines between
	                 }
			}

			
			  if (row != row - 1) {
				
		         }
			  System.out.println();
		}
		
	}
		// hides ships on the board
	public void hideShipsBoard(){
		System.out.println("    1  "+ " 2  " + "3  " + " 4  " +" 5  " + " 6  "+ " 7  " +" 8  "+ " 9  "+" 10  "+	"11  "+"12  ");
		  System.out.println("---------------------------------------------------"); 
		  	 	
		for (int row=0; row <12; row++){
			if(row<9){
			System.out.print(" "+(row+1)+" ");}
			else
				System.out.print((row+1)+" ");
			for(int column=0; column<12; column++){
				if(board[row][column]==-1){
					System.out.print(" " + "~");
				}else if(board[row][column]==0){
					System.out.print(" " + "0" );
				}else if(board[row][column]==-1){
					System.out.print(" " + "X" );
				}
	            if (column != column - 1) {
	                System.out.print(" "+"|"); 
	                 }
			}

			
			  if (row != row - 1) {
				
		         }
			  System.out.println();
		}
		
	}
	
public void addShip(Ships ship){		// adds user ships onto the board
	int xPosition = ship.getInitPosition()[1];
	int yPosition = ship.getInitPosition()[0];
	if(ship.getShipDirection()==0){
		for(int s = 0; s < ship.getShipSize(); s++){
			board[yPosition +s ][xPosition] = 1;
		}
	}
	else{
		for(int s = 0; s < ship.getShipSize(); s++){
			board[yPosition][xPosition + s] = 1;
		}
	}
}
			//checks if the ship  has been placed on the board
	public Boolean lookForShips(Ships ship){
		int xPosition = ship.getInitPosition()[1];
		int yPosition = ship.getInitPosition()[0];
		if(0> yPosition || yPosition >13 || 0> xPosition || xPosition >13){
		if(ship.getShipDirection()==0){
			for(int s =0; s<ship.getShipSize(); s++){
				if(0>(yPosition +s) || (yPosition +s ) >13){
					return false;
				}
				else if(this.board[yPosition+s][xPosition]== 1){
					return false;
				}
			}
		}
		else{
			if(ship.getShipDirection()==0){
				for(int s =0; s<ship.getShipSize(); s++){
					if(0>(xPosition +s) || (xPosition +s) >13){
						return false;
					}
					else if(this.board[yPosition][xPosition+s]== 1){
						return false;
					}
				}
			}
		}
	}
		return true;

	}

}


