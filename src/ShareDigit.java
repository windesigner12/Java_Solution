public class ShareDigit {
    // write your code here

    public static boolean hasShareDigit(int num1, int num2){


        int temp=0;
        int temp2= 0;

        if(num1<=10 && num1>=99 || num2<=10 && num2>=99){
            return false;
        }

        while(num1>0){

            temp= num1%10;
            while(num2 > 0){
                temp2 = num2%10 ;
                   if(temp == temp2){
                    return true;
                   }

                num2/=10;
            }
            num1/=10;

        }
        return false;
    }


    public static void main(String[] args){

    hasShareDigit(12,23);


    }
}