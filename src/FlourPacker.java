public class FlourPacker {
    // write your code here

    public static boolean canPack(int bigCount, int smallCount, int goal){




        if(bigCount < 0 || smallCount < 0 || goal < 0 ){
            System.out.println("False");
            return false;
        }

        if(bigCount >0 && smallCount >0 && goal > 0){
            if( goal-((bigCount*5)+smallCount) == 0 || goal - bigCount*5 == 0 || (bigCount*5)%goal == 0) {
                System.out.println("True");
                return true;
            }
            if(goal > bigCount*5){

                if( goal%(bigCount*5) >0 && smallCount > goal-(bigCount*5)) {
                    System.out.println("True Last");
                    System.out.println(goal-(bigCount*5));
                    return true;
                }
            }
            if(goal < bigCount*5){

                if( goal%5 >0 && smallCount > goal - ((bigCount -1)*5)) {
                    return true;
                }
            }
        }

        if(bigCount >0 && smallCount ==0){
            if(goal-(bigCount*5) == 0){
                System.out.println("True");
                return true;
            }
        }
        if(bigCount ==0 && smallCount >0){
            if(goal-(smallCount) <= 0){
                System.out.println("True");
                return true;
            }
        }

        System.out.println("Last False");
        return false;


////for(int i=0; i <= goal; i++){
//
//    int result = goal%(bigCount*5);
//
//    if (result > 0 && smallCount > result){
//        System.out.println(true);
//        return true;
//    }
//
////}
//return false;


    }//class canPack


    public static void main(String[] args){

     canPack(5,3,24);

    }
}