package blackjack;
import java.util.*;
public class Blackjack {

	public static void main(String[] args) {
		System.out.println("Welcome to Blackjack");
		System.out.println("");
		String again;
		Scanner input = new Scanner(System.in);
		do {
		int dealHand = randomCard();
		System.out.println("One of dealer's cards is " + dealHand);
		dealHand += randomCard();
		
		while (dealHand < 17)
		{
			dealHand += randomCard();
		}
		
		
		int playerHand1 = randomCard();
		int playerHand2 = randomCard();
		int playerHand = playerHand1 + playerHand2;
		System.out.println("Your hand is " + playerHand1 +" and " + playerHand2 +". Your total is "+ playerHand);
		
		
		
		System.out.println("Would you like to hit, y/n");
		String hit = input.next();
		
		
		while (hit.equals("y"))
		{
			System.out.println("");
			int newCard = randomCard();
			playerHand += newCard;
			System.out.println("You just got " + newCard +". Your total is " + playerHand);
			if (playerHand > 21)
			{
				break;
			}
			System.out.println("Would you like to hit again, y/n");
			hit = input.next();
			System.out.println("");
		}
		if (dealHand > 21 && playerHand < 22) 
		{
			System.out.println("The dealer has over 21. You have "+playerHand+". You win");
		}
		else if (dealHand < 22 && playerHand > 21)
		{
			System.out.println("You have over 21. The dealer has "+dealHand+". You lose");
		}
		else if (dealHand > 21 && playerHand > 21)
		{
			System.out.println("You have "+ playerHand +", dealer has " + dealHand +". Both are over 21, so it is a draw.");
		}
		else if (dealHand > playerHand)
		{
			System.out.println("You have "+ playerHand +", dealer has " + dealHand +". The dealer has won.");
		}
		else if (dealHand < playerHand)
		{
			System.out.println("You have "+ playerHand +", dealer has " + dealHand +". You have won.");
		}
		else if (dealHand == playerHand)
		{
			System.out.println("You have "+ playerHand +", dealer has " + dealHand +". It is a draw.");
		}
		System.out.println("");
		System.out.println("Would you like to play again, y/n");
		again = input.next();
		System.out.println("");
		
		}while (again.equals("y"));
		input.close();
		System.out.println("Thanks for playing!");

	}
	public static int randomCard()
	{
		Random rand = new Random();
		int random =rand.nextInt(10) + 1;
		return random;
				
	}

}
