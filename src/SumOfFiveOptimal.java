import java.util.Scanner;

public class SumOfFiveOptimal {

    public static void main(String[] args) {

        int count = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("Enter number #" + count + " :");
            String nextNumber = scanner.nextLine();

            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            }catch (NumberFormatException e){
                System.out.println("Invalid Number");
            }
        }while (count<=5);
        System.out.println("Total Sum of Numbers: "+ sum);
    }
}
