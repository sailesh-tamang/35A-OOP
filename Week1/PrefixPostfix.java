package Week1;

public class PrefixPostfix {
    public static void main(String[] args) {
        /*prefix operator */
        int prefixValue = 20;
        System.out.println("prifix value updates the value in this line"+ ++prefixValue);
        System.out.println("it remains the same in the next line"+ prefixValue);
        /*PostFix opreator */
        int postFixValue =20;
        System.out.println("postfix value updates the value in next line"+ postFixValue++);
        System.out.println("the value changes int this line"+ postFixValue);

    }
    
}
