import java.util.Scanner;

class bonusactivity {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Start the program");
            System.out.print("Y/N: ");
            String start = scanner.nextLine();
            System.out.println("\n\n");

            if (!start.equalsIgnoreCase("Y")) {
                return;
            }

            String calcContinue = "y";
            while (calcContinue.equalsIgnoreCase("y")) {
                int num2 = 0;
                int num1 = 0;
                int result = 0;
                String operation;

                // Prints a welcome message
                System.out.println("===================================");
                System.out.println(" Welcome to the Simple Calculator!!");
                System.out.println("===================================");
                System.out.println("By: John Lloyd C. Gutib / Sec B ITS 202\n\n");

                // Gets what is the operation that will be used
                System.out.println("Please select the operation to use (+,-,*,/) ");
                operation = scanner.nextLine();

                // Gets what is the first number
                System.out.print("Please input the first number: ");
                num1 = scanner.nextInt();
                // Gets what is the second number
                System.out.print("Please input the second number: ");
                num2 = scanner.nextInt();

                // different case will be used depending on what operation was inputted
                switch (operation) {

                    case "+":
                        result = num1 + num2; // Addition
                        System.out.println("Sum is: " + result);
                        break;

                    case "-":
                        result = num1 - num2; // Subtraction
                        System.out.println("Difference is: " + result);
                        break;

                    case "*":
                        result = num1 * num2; // Multiplication
                        System.out.println("Product is: " + result);
                        break;

                    case "/":
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero!");
                        } else {
                            result = num1 / num2; // Division
                            System.out.println("Quotient is: " + result);
                        }
                        break;

                    default:
                        System.out.println(" Invalid Operation!");
                        break;
                }

                if (999999 < result) {
                    System.out.println("Result is too long");
                }

                System.out.println(" ");

                System.out.println("Press Y to calculate again");
                calcContinue = scanner.next();
                scanner.nextLine();

            }
        }

    }
}
