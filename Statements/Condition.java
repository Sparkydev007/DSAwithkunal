public class Condition {
    public static void main(String[] args) {
        System.out.println("Hello, Prathmesh");
        boolean isAlien = false;
        if (isAlien == false) {
        
        System.out.println("It is not an alien!");
        System.out.println("and i'm damm scared of them");
        }

        int topScore = 80;
        if (topScore <100) {
            System.out.println("You got the high score!");
        }
        

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore <100)) {
            System.out.println("Greater than second top and less than 100");
        }

        /*operators */
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if  (newValue == 50) {
            System.out.println("This is an true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }

        /*Ternary Operator */
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic our country");
        }
        String s = (isDomestic) ? "This car is domestic" : "this car is not domestic";

        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondvalue = 80.00d;
    }
}