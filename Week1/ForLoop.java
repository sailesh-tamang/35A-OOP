package Week1;

public class ForLoop {
    public static void main(String[] args) {
        for(int index=0; index<10; index+=2) {
            System.out.println("looping " + index);
        }
        /*make te table of following */
        for(int index=10;index>0; index--){
            System.out.println("looping decrement " + index);
        }
        for(int index = 1; index < 11; index ++){
            System.out.println("2 * " +index + " = " + 2 * index);
        }
        /*nested  for  loop */
        /*loop inside loop */
        for(int outer = 0; outer < 2; outer ++){
            for(int inner = 2; inner >= 0; inner --){
                System.out.println("Inner"+ inner);
            }
            System.out.println("Ouuter " + outer);
        }
        /*make a multiplication table form 1 to 5 */
        for(int index =1;index<6;index++){
            System.out.println("1*"+index+"="+1*index);
        }
        
    }
    
}
