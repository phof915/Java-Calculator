import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner calScan = new Scanner(System.in);

        System.out.println("Term One: ");
        String inputTermOne = calScan.nextLine();

        System.out.println("Operator (+, -, *, or /): ");
        String operator = calScan.nextLine();

        System.out.println("Term Two: ");
        String inputTermTwo = calScan.nextLine();

        calScan.close();
        
        double inputOne = Double.parseDouble(inputTermOne);
        double inputTwo = Double.parseDouble(inputTermTwo);

        double result = 0;
        
        switch (operator) {
            case "+":
                result = inputOne + inputTwo;
                break;
            case "-": 
                result = inputOne - inputTwo;
                break;
            case "*":
                result = inputOne * inputTwo;
                break;
            case "/":
                result = inputOne / inputTwo;
                break;
            default:
                System.out.println("Oh no! Please use a valid operation!");
                
        }
        
        System.out.println("Answer: " + result);

    }
}