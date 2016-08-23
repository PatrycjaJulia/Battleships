import java.util.*;

public class Player {
	private String name;
	private int playerNo;
	private Ships[] playerShips;
	private Board field;
	//private int []shoot;
	Scanner userInput = new Scanner (System.in);
	
	public Player( String names, int Number){
		this.name = names;
		this.playerNo = Number;
		this.playerShips= new Ships[7];
		this.assignBoard();
		this.assignShip();
		
	}
	public void assignBoard(){
		this.field = new Board();
	}
	
	// Loop go through each ship and gets it's location after it's been placed on the board
	public void assignShip(){
		for(int ship =0; ship<7; ship++){
			if(ship == 4){
				this.playerShips[ship] = new Ships(3);// 2 battelships
			}
			else if(ship>=5){
				this.playerShips[ship] = new Ships(4); // two patrol boats
			}
			else{
				this.playerShips[ship] = new Ships(ship);// rest of the ships
			}
			System.out.print(this.playerShips[ship].getName()+" in ");
			System.out.println(Arrays.toString(this.playerShips[ship].getInitPosition()) +"\n");
			
			Boolean type = this.field.lookForShips(this.playerShips[ship]);
			if(type == false){
				System.out.println("Problem Occured! Please provide location of the Ship again");
				ship--;
			}
			else{
				this.field.addShip(this.playerShips[ship]);// places ships on the board
			}
			this.field.showBoard();// displays board
		}
	}
		//public void hit (Player player){
		//System.out.println("Select row to hit");
		//playerShips[ship].getInitPosition()[0] = userInput.nextInt();
		//System.out.println("Select column to hit");
		//playerShips[ship].getInitPosition()[1] = userInput.nextInt();
		//}
	
}

	



