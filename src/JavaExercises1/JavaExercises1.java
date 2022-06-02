package JavaExercises1;


public class JavaExercises1 {
    public static void main(String[] args) {
        System.out.println("----------exercise 1----------");
        System.out.println(sum1(5,4));
        System.out.println("----------exercise 2----------");
        System.out.println(sum2(13));
        System.out.println("----------exercise 3----------");
        System.out.println(factorial(10));


    }
    public static Integer sum1(Integer i, Integer j) {
        System.out.print("Sum of " + i + " and " + j + " is ");
        return i + j;
    }
    public static Integer sum2(Integer n) {
        int sum = 0;
        for (int i = 0; i <=n ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.print("Sum of elements that multiplies of three and five up to " + n + " is ");
        return sum;
    }
    public static String factorial(Integer n) {
        int factorial = 1;
        if (n <= 0) {
            return("Improper value of n");
        } else if (n == 1) {
            return ("Factorial for 1 is " + 1);
        } else
            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
            }
        return ("Factorial for " + n + " is " +factorial);
    }
}
