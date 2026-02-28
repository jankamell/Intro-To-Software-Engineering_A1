import java.util.Scanner;
public class QuizApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        String[] questions = {
                "Which of the following is a valid Java data type?",
                "Which keyword is used to define a class in Java?",
                "Which method is the entry point of a Java program?",
                "Which operator is used for comparison in Java?",
                "Which collection class allows dynamic array resizing?"
        };
        String[][] options = {
                {"A) number", "B) text", "C) int", "D) value"},
                {"A) define", "B) class", "C) create", "D) object"},
                {"A) start()", "B) main()", "C) run()", "D) execute()"},
                {"A) =", "B) ==", "C) :=", "D) equals"},
                {"A) Array", "B) List", "C) ArrayList", "D) Collection"}
        };
        char[] answers = {'C', 'B', 'B', 'B', 'C'};
        System.out.println("Welcome to the Quiz!");
        System.out.println("----------------------");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer: ");
            char userAnswer = input.next().toUpperCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("\nYour final score is: " + score + "/" + questions.length);
        double percentage = ((double) score / questions.length) * 100;
        System.out.println("Your percentage is: " + percentage + "%");
        input.close();
    }
}