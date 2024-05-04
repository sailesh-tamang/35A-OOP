package week2;

public class task1 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        if (num1 > num2 && num2 > num3) {
            System.out.println("Number 1 is Greater");
        }
        else if(num2 > num1 && num2 > num3 ){
            System.out.println("Number 2 is greater");
        }
        else{
            System.out.println("Number 3 is greater");
        }
    }
    
}
