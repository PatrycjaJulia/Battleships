import java.util.*;

public class Ships {
	private int type, direction, size;
	private String name;
	private int[] initPosition;
	private Board board;
	Scanner userInput = new Scanner(System.in);
	private int []shoot;
	
	public Ships(int stype){
		this.type = stype;
		this.initPosition = new int[2];
		this.createShip();
	}
	// creates the ships and specifies its attributes
	public void createShip(){
		
		if(this.type == 0){
			this.name = "Carrier";
			this.size = 5;
		}
		else if(this.type == 1){
			this.name = "Destroyer";
			this.size = 4;
		}
		else if(this.type == 2){
			this.name = "Submarine";
			this.size = 3;
		}
		else if(this.type == 3){
			this.name = "Battleship";
			this.size = 3;
		}
		else if(this.type == 4){
			this.name = "Patrol Boat";
			this.size = 2;
		}
		//gets location of the ship from the user 
		System.out.print(this.name + " Size:  " +this.size +". Select row: ");
		this.initPosition[0] = userInput.nextInt()-1;
		System.out.print(this.name +" Size:  " + this.size + ". Select column: ");
		this.initPosition[1] = userInput.nextInt()-1;
		System.out.print(this.name + " Direction ( Vertical = 0, Horizontal = 1):  ");
		this.direction = userInput.nextInt();
	}
	//returns name of the ship
	public String getName(){
		return this.name;
			}
	//returns position of the ship
	public int[] getInitPosition(){
		return this.initPosition;
	}
	//returns direction of the ship - horizontal and vertical 
	public int getShipDirection(){
		return this.direction;
	}
	// returns ship size
	public int getShipSize(){
		return this.size;
	}

	
}
