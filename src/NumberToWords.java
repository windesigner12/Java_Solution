public class NumberToWords {
    // write your code here
    public static void numberToWords(int number1){
        if(number1 < -1){
            System.out.println("Invalid Value");
        }
//        while(number >0){
//            int extractNum =  number % 10;
//            if(extractNum == 0){
//                String result = "ZERO";
//            }
//
//        }

    }

    public static int reverse(int number){
         number = 987654; int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return number;
    }
}