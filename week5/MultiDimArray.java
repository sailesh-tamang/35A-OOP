package week5;

public class MultiDimArray {
    public static void main(String[] args) {
        
        /*the number of square bracket determine the dimension */
        //1 dim arrya
        int[] oneDArray;
        //2 dim array
        int[][] twoDArray;
        //3 dim array
        int[][][] threeDArray;
        /*memory allocation */
        twoDArray = new int[2][3];
        /*the first 2 is the number of array inside towDArray 
         * the second 3 is the number of value/length of inner array
         * [
         * [0,0,0]
         * [0,0,0]
         * ]
        */
        twoDArray[0][0] =100;
        twoDArray[0][1]=200;
        twoDArray[1][2]=-100;
        twoDArray[1][1]=100;
        //access value the same way
        int arrayValue = twoDArray[0][0];
        System.out.println((twoDArray[0][1]));

        /*task
         * [
         * [10,20]
         * [30,40]
         * [50,60]
         * [70,80]
         * [-10,-20]
         * ]
         */

        int[][] twoDArrayValue = {
            {10,20},
            {30,40},
            {50,60},
            {70,80},
            {-10,-20}

        };
        
    }
    
}
