package fib;

public class Fib {

    public static void main(String[] args) { //psvm
//        System.out.println(fibCalc(5));
        System.out.println(fibCalc(7, 21));
//        sout(fibCalc(5, 2));
    }

    public static boolean fibCalc(int num, int numToCheck){
        int result = 1;
        int prev = 1;

        System.out.println(result);
        System.out.println(prev);
//        if(num < 2) return result;

        for (int i = 2; i < num; i++) { //fori
            int temp = result;
            result += prev;
            prev = temp;
            if (result == numToCheck) {
                return true;
            }
            System.out.println(result);
        }
        return false;
//        return result;
    }
}
