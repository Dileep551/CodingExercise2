import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        long avg = 0;

        while (count >= 0) {

            String inputValue = scanner.nextLine();

            try {

                int number = Integer.parseInt(inputValue);
                sum += number;
                count++;
                avg = Math.round((double) sum / count);

            } catch (NumberFormatException nfe) {

                System.out.println("SUM = "+ sum +" AVG = "+ avg);
                break;
            }
        }
    }
}
