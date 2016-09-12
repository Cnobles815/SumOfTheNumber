package nobles.christopher.SumOfTheNumbers;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Brain {

    Display display;
    Calculator calculator;

    public Brain(){

      this.display = new Display();
        this.calculator = new Calculator();

    }

    public void combine() {


    int userInput1 = display.getUserInput();



        display.showResult(calculator.calculate(userInput1));
        //return display.showResult(calculator.calculate(userInput1));

    }

}
