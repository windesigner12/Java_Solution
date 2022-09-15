import java.util.Scanner;

public class UserInput {



    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Your name is: "+ name);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int i=1;
        int sum =0;
        boolean hasNextInt = scanner.hasNextInt();
        int number = scanner.nextInt();

        while(i<=10){

            System.out.println("Enter the number : " + i);
            scanner.nextLine();

           if(hasNextInt){
                sum+=number;
                System.out.println(" Sum of the number are " + sum);
                i++;
           }else{
                System.out.println("Enter the number : " + i);
break;
         }

            //scanner.nextLine();
        }
        scanner.close();
    }

}
