import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- BMR & Daily Calorie Calculator ---");

        //han5od el data eli mehtagnha mn el user
        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Height (cm): ");
        double height = input.nextDouble();

        System.out.print("Enter Weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter Gender (m/f): ");
        char gender = input.next().toLowerCase().charAt(0);

        //hna calc el BMR 
        double bmr;
        if (gender == 'm') {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }

        //ne3rf b2a el Activity Level 34an ne7dd mo3aml el na4at
        System.out.println("\nSelect Activity Level:");
        System.out.println("1. Sedentary ");
        System.out.println("2. Lightly Active ");
        System.out.println("3. Moderately Active ");
        System.out.println("4. Very Active ");
        System.out.println("5. Extra Active ");
        System.out.print("Enter choice (1-5): ");
        int activityChoice = input.nextInt();

        double activityMultiplier;
        switch (activityChoice) {
            case 1: activityMultiplier = 1.2; break;   
            case 2: activityMultiplier = 1.375; break; 
            case 3: activityMultiplier = 1.55; break;  
            case 4: activityMultiplier = 1.725; break;
            case 5: activityMultiplier = 1.9; break;   
            default: activityMultiplier = 1.2;
        }

        double tdee = bmr * activityMultiplier; // total kcal hasb level el haraka

        System.out.println("\n--- Results ---");
        System.out.println("Base BMR: " + (int)bmr + " kcal");
        System.out.println("Daily Calories to Maintain: " + (int)tdee + " kcal");


        // hna kda zy hint aw benwarih goals lw 3ayz yeha22ha
        System.out.println("\nYour Goals:");
        System.out.println("To Lose Weight: " + (int)(tdee - 500) + " kcal");
        System.out.println("To Gain Weight: " + (int)(tdee + 500) + " kcal");

        input.close();
    }
}
