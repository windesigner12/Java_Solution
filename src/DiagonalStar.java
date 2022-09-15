import java.util.Scanner;

public class DiagonalStar {
    // write your code here

//    public static void printSquareStar(int number){
//        if(number < 5){
//            System.out.println("Invalid Value");
//        } else {
//
//            for (int i = 0; i < number; i++) {
//
//                // Loop denoting columns
//                for (int j = 0; j < number; j++) {
//
//
//                    if (i == 0 ||
//                            j == 0 ||
//                            i == j ||
//                            i == number - 1 ||
//                            j == number - 1 ||
//                            i + j == number - 1)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }
//                System.out.println();
//            }
//        }
//
//
//
//    }

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = scanner.nextLine();

       System.out.println("Your name is: "+ name);

       scanner.close();
    }
}