package loops;

public class ForLoop {
    public static void main(String[] args) {
        /*ForLoop is called as Syntactic Sugar*/
        /*for(int i=0;i<10;i++|| i--)   code runs like A - B - D -C - B - D - C - B - D - C
         * int i=0 is the intial condition --> A
         * i<10 is loop condition          --> B
         * i++ increment/decrement condition --> C*/
        /*For(Intial condition ; loop condition; increment/decrement condition){}*/
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"); // --> D
        }

        /*Example 1*/
        /*Write a program to compute sum of first 'n' numbers*/
        int result = 0;
        for (int i = 0; i <= 10; i++) {
            result += i;
        }
        System.out.println(result);

        /*Example 2*/
        /*WAP to print even numbers till 12*/
        for (int index = 2; index <= 12; index+=2) {
            System.out.println(index);
        }
        /*Example 3*/
        /*WAP to print no's divisible by 2 or 3 in range of*/
        for (int i=0;i<100;i++){
            if(i%2 ==0 || i%3==0)
                System.out.println(i);
        }
    }
}
