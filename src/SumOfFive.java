import java.util.Scanner;

public class SumOfFive {

    public static void main(String[] args) {

        int count = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;


do {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number #1: ");

    try {
        String number1 = scanner.nextLine();

        num1 = Integer.parseInt(number1);

        count ++;

        System.out.println("Enter number #2: ");

        String number2 = scanner.nextLine();

        num2 = Integer.parseInt(number2);

        count++;

        System.out.println("Enter number #3: ");

        String number3 = scanner.nextLine();

        num3 = Integer.parseInt(number3);

        count++;

        System.out.println("Enter number #4: ");

        String number4 = scanner.nextLine();

        num4 = Integer.parseInt(number4);

        count++;

        System.out.println("Enter number #5: ");

        String number5 = scanner.nextLine();

        num5 = Integer.parseInt(number5);

        count++;

        int total = num1 + num2 + num3 + num4 + num5;

        System.out.println("Total Sum of Numbers Entered: "+total);

    } catch (NumberFormatException e){

        System.out.println("Invalid number");
    }

} while (count!=5);

    }

}
