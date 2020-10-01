package snakeladderproblem;

public class uc3snakeladderproblem {
	public static final int INITIAL_POSITION=0;
	public static final int NO_OF_PLAYERS=1;
	public static final int FINAL_POSITION=100;
	public static final int NO_PLAY=0;
	public static final int SNAKE=1;
	public static final int LADDER=2;
	
	
	
	
	
	
	public static void main(String[] args){
		//Variables
		int player_one_position =0;
		int count=0;
		

		

			
		while (player_one_position<100) {
			count++;
			System.out.println("your count is = "+ count);
			

			//Computation
			int dicenumber  =(int) Math.floor((((Math.random()*100)%6)+1));
			System.out.println("Your dice number is = "+dicenumber);

		
		int option=(int) Math.floor((Math.random()*100)%3);
		switch (option) {
		case  NO_PLAY:
			 player_one_position= player_one_position;
			 System.out.println("You got no play you will not move at "+ dicenumber);
			 
			 break;
		case  SNAKE:
			 player_one_position= player_one_position - dicenumber;
			 System.out.println("You got snake you will move backward by "+ dicenumber );
			 
			
			 break;
		case LADDER:
			player_one_position=player_one_position + dicenumber;
			System.out.println("You got ladder you will move forward by "+dicenumber );
			
			
			
			break;
		}
		
		
		
		if (player_one_position< 0 ) {
			player_one_position= 0;
			System.out.println("Since player position is below zero we start from zero");}
		
		if (player_one_position>100 ) {
			player_one_position-=dicenumber;
			System.out.println("Since player position is above 100 we stay at same position");}
			
		
		

			
			
		
		 
	
		 
		 System.out.println("the position of the player is = "+ player_one_position);}}
		

	}





	
		
		
		
		
			
		
		
		
		
