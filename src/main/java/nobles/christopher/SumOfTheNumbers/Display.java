package nobles.christopher.SumOfTheNumbers;
import java.util.Scanner;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Display {

    //Prompt the user for input
    //Take user input
    //Display answer
    public int getUserInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        return userInput.nextInt();
    }

    public void showResult (int output) {
        System.out.println("Your answer is: " + output);

    }



}
