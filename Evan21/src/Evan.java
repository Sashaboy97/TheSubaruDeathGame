
import java.util.Scanner;

public class Evan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = keyboard.nextLine();
		
		System.out.println("Would you like to buy a subaru or an apple watch");
		
		boolean loop = true;
		while(loop)
		{
			String input = keyboard.nextLine();
			if(input.equalsIgnoreCase("subaru")){
				loop = false;
				System.out.println(name+", you have died");
			}
			else if(input.equalsIgnoreCase("apple watch"))
			{
				loop = false;
				System.out.println("You should have gone with an Android watch. "+name+" has been sentenced to life in prison");
			}
			else
			{
				System.out.println("I did not understand your answer fooool.\nTry again");
			}
			
			
		}
		
		System.out.println("You have finished the game");
		
		for(int i = 0; i < name.length()*3; i ++)
		{
			System.out.print(name +" is a loser ");
		}
		
System.out.println("\nEvan has been to the demons lair!! aaaaaaaahhhhhhhhhhhh!!!!" );
	}

}
