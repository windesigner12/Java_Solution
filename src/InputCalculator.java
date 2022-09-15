import java.util.Scanner;

public class InputCalculator {
    // Write your code here

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;


        while(true){

            System.out.println("Inserez le nombre: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();
                sum+=number;
                count++;
                double divident = (double) count;
                avg =Math.round(sum /divident);

            }else{
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)

        }

        System.out.println("SUM = " + sum + " "+"AVG = "+ avg );
        System.out.println(11/ 3.0);
    }

    public static void main(String[] args){
 inputThenPrintSumAndAverage();
    }

}
