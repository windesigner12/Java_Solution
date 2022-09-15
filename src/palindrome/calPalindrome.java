package palindrome;


public class calPalindrome {

    public static void main(String[] args){

        int reverse = 0;
        int lastDigit =0;
        int num1 = 100;

        while(num1 > 0){
            lastDigit = num1 / 10;
            System.out.println("Last Digit" + lastDigit);
        }


    }
}
