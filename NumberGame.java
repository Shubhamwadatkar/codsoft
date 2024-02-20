import java.util.*;
    
public class NumberGame 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
		
        while(true)
        {
			int numberToGuess = rand.nextInt(100) + 1;
			int noofattempt=0;  //taking number of attempts
            System.out.println("Welcome to the number guessing game!");
      
           while (true) 
          {
			System.out.println("Guess a number between 1 and 100:");
            guess = sc.nextInt();  //taking guess number
			noofattempt++;
            if (guess == numberToGuess) 
            {
                System.out.println("Congratulations, you guessed the number! and number of attempts are : "+ noofattempt);
                break;
            } else if (guess < numberToGuess) 
            {
                System.out.println("Your guess is too low. Try again:");
            } else
			{
                System.out.println("Your guess is too high. Try again:");
            }
          }
		  System.out.println("Do you want to play again (y/n) ?");
		  String tryagain = sc.next();
		  if(!tryagain.equalsIgnoreCase("y"))    
		  {
			 break;
		  }                   
	   }
    }
}