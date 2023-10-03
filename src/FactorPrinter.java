public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(120);
    }
    public static void printFactors(int number){

        if(number < 1){

            System.out.println("Invalid Value");

        }

        else {

            int num = 1;
            while(number >= num){

                if(number % num == 0){
                    System.out.println(num);
                }

                num++;

            }

        }
    }

}
