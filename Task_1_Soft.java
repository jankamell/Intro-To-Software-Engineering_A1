import java.util.Scanner;
import java.util.Random;
public class Task_1_Soft {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int tries=0;
    int maxTries = 5;
    int guess;
    Random random = new Random();
    int number_to_guess=random.nextInt(101);
    boolean win =false;
    System.out.println("Welcome to guess game \nCan u guess the number from 0 to 100 ?");
    System.out.println(number_to_guess);
    while(!win && tries < maxTries)
    { 
        guess=input.nextInt();
        

        if (guess != number_to_guess)
        {
            tries+=1;
            if (guess<number_to_guess)
            {
                System.out.println("Too low !");
            }
            else
            {
                System.out.println("Too high !");
            }
        }
        else if (guess==number_to_guess)
        { tries+=1;
            win=true;
            System.out.printf("Bravoo u guess it correct after %d tries!%n",tries);
        }
        if (!win && tries == maxTries) 
        {
            System.out.println("GAME OVERRRR");
        }

    }
}
}