
package lesson3.hw;

public class Fibonacci {

    private static int fib1=0,fib2=1;
    private static int fib3;

    public static void printFibonacciNumbers(int length){

        if(length <= 0){
            System.out.print("You entered: "+length+"\n Please, enter a positive number more than 0");
        }else if(length == 1){
            System.out.print(fib1);
        }else {
            System.out.print(fib1 + " " + fib2);
            for (int i = 2; i < length; ++i) {
                fib3 = fib1 + fib2;
                System.out.print(" " + fib3);
                fib1 = fib2;
                fib2 = fib3;
            }
        }
    }
}