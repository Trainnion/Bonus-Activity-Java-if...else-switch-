import java.util.Scanner;

public class bonus_activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start the program");
        System.out.print("Y/N: ");
        String start = scanner.nextLine();
        System.out.println("\n\n");

        if (!start.equalsIgnoreCase("Y")) {
            System.out.println("Program Executed");
            scanner.close();
            return;
        }

        String calcContinue = "y";
        while (calcContinue.equalsIgnoreCase("y")) {
            int num2 = 0;
            int num1 = 0;
            String operation = " ";

            // Prints a welcome message
            System.out.println("===================================");
            System.out.println(" Welcome to the Simple Calculator!!");
            System.out.println("===================================");
            System.out.println("By: John Lloyd C. Gutib / Sec B ITS 202\n\n");

            // Gets what is the operation that will be used
            System.out.println("Please select the operation to use (+,-,*,/) ");
            operation = scanner.nextLine();

            // Gets what is the first number
            System.out.println("Please input the first number: ");
            num1 = scanner.nextInt();
            // Gets what is the second number
            System.out.println("Please input the second number: ");
            num2 = scanner.nextInt();

            // different case will be used dipending on what operation was inputted
            switch (operation) {

                case "+":
                    int sum = num1 + num2; // Addition
                    System.out.println("Sum is: " + sum);
                    break;

                case "-":
                    int difference = num1 - num2; // Subtraction
                    System.out.println("Difference is: " + difference);
                    break;

                case "*":
                    int product = num1 * num2; // Multiplication
                    System.out.println("Product is:" + product);
                    break;

                case "/":
                    int quocient = num1 / num2; // Division
                    System.out.println("Qoucient is: " + quocient);
                    break;

                default:
                    System.out.println(" Invalid Operation!");
                    break;
            }

            System.out.println(" ");

            System.out.println("Do you want to calculate again? (Y/N)");
            calcContinue = scanner.next();

        }
        scanner.close();
    }
}
