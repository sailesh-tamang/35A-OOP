package Week1;

public class OperatorClass {
    public static void main(String[] args) {
        /*Arthimetic operators */
        int num1 =10, num2 = 20;
        int sum=num1 +num2;
        System.out.println("num1 + num2 is"+sum);
        System.out.println("num - num2 is'"+(num1-num2));
        System.out.println("num*num2 is"+(num1*num2));
        System.out.println("num1/num2 is" + (num1/num2));
        System.out.println("num1 modulo num2 is "+(num1%num2));
        /*Assignment operators */
    
        int aNum1;
        aNum1 = 200; //here "=" is assignment to assign value
        System.out.println(aNum1);
        System.out.println("aNum += can be "+ (aNum1+=2 ));
        /*aNum1+=2; is equivalnet to aNum1 = aNum1 + 2; /* */
        System.out.println("aNum -= can be " + (aNum1-=10));
        System.out.println("aNum= can be " + (aNum1*=3));
        System.out.println("aNum /= can be " + (aNum1/=3));
        System.out.println("aNum %= can be " + (aNum1%=2));
        /*Relational operators */
        int rNum1 = 20, rNum2 =21;
        boolean rExpression = rNum1 == rNum2;
        System.out.println("Is rNum1 equal to rNum2" +rExpression);
        System.out.println("Is rNum1 equal to rNum2"+(rNum1>rNum2));
        System.out.println("Is rNum1 lesser or equal to rNum2"+(rNum1<=rNum2));
        System.out.println("Is rNum1 not equal to rNum2"+(rNum1!=rNum2));
        /*logical operators */
        boolean rOperators1 = false, rOperators2 = false;
        System.out.println("rOperators1 && rOperators2"+(rOperators1 && rOperators2));
        System.out.println("Or using ||"+(rOperators1 || rOperators2));
        System.out.println("Not using !"+!rOperators1);
        /* Unary Operators */
        int uNum1 = 10;
        uNum1++; //equivalent to uNum1 = uNum +1 and changes calue from next line;
        ++uNum1; // equivalent to uNum1 = uNum1 + 1 and changes ccalue in this line;
        System.out.println("Unary for ++ "+ uNum1);
        System.out.println("Unary for operand -- " + uNum1--);
        System.out.println("Unary for --operator "+ --uNum1);
        /*Ternary Operators 
         * For example
         * string output;
         * int a=10;
         * int b=20;
         * if(a>b){
         * output ="true statemet";
         * }else{
         * output ="false statemet";
         * }
        */
        /*we can use ternary for this */
        int a= 10, b= 20;
        String output = a>b? "true statemet" : "false statemet";
        /* here ternary takes expression? ture statemet : false statemet
        if the expression is true it takes the statement after the "?""
        if the express is false it takes the statement after the ":""
         */
        int outputNumb = a< b ? 100 : 200;
        System.out.println(output);
        System.out.println(outputNumb);





    }
    
}
