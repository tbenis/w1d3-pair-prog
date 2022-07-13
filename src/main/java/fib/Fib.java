package fib;

public class Fib {

    public static void main(String[] args) { //psvm
//        System.out.println(fibCalc(5));
        fibCalc(10);
    }

    public static int fibCalc(int num){
        int result = 1;
        int prev = 1;

        System.out.println(result);
        System.out.println(prev);
        if(num < 2) return result;

        for (int i = 2; i < num; i++) { //fori
            int temp = result;
            result += prev;
            prev = temp;
            System.out.println(result);
        }

        return result;
    }
}
