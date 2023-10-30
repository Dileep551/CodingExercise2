import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNum = 0;
        int maxNum = 0;
        int count = 0;

        while (count >= 0) {
            System.out.println("Enter number or any character to quit");
            String numValue = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(numValue);
                if (count == 0 || validNum < minNum) {
                    minNum = validNum;
                }
                if (count == 0 || validNum > maxNum) {
                    maxNum = validNum;
                }
                count++;

            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if(count > 0){
            System.out.println("min = "+ minNum +", max = "+ maxNum);
        }else {
            System.out.println("No valid data entered");
        }

    }
}
