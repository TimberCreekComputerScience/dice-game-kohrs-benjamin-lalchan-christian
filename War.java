import java.util.Scanner; 
public class War {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int dicePlayer =(int)(Math.random()*6)+1;
	int diceComputer =(int)(Math.random()*6)+1;
	Scanner scan = new Scanner(System.in); 
	System.out.println("Type 1 to roll your dice. Type anything else to terminate the program.");
	int input = scan.nextInt();	
	
	if (input == 1)
	{
	System.out.println("You rolled a "+ dicePlayer);
	System.out.println("The computer rolled a "+ diceComputer);
	if (dicePlayer > diceComputer) 
	{
		System.out.println("You win! Congratulations!");
	}
	else {
		System.out.println("You lose! You failure!");
	}
	}
	else {System.out.println("Program terminated.");
	}
		
	}
	}
