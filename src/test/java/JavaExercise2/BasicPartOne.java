package JavaExercise2;

import java.util.Scanner;

public class BasicPartOne {
    public static void main(String[] args) {
        System.out.println("----------------Exercise 1----------------");
        exerciseOne();
        System.out.println("----------------Exercise 2----------------");
        System.out.println(exerciseTwo(74, 36));
        System.out.println("----------------Exercise 3----------------");
        System.out.println(exerciseThree(50, 3));
        System.out.println("----------------Exercise 4----------------");
        exerciseFour();
        System.out.println("----------------Exercise 5----------------");
        System.out.println(exerciseFive());
        System.out.println("----------------Exercise 6----------------");
        exerciseSix();
        System.out.println("----------------Exercise 7----------------");
        exerciseSeven();
        System.out.println("----------------Exercise 8----------------");
        exerciseEight();
        System.out.println("----------------Exercise 9----------------");
        System.out.println(exerciseNine());
        System.out.println("----------------Exercise 10----------------");
        exerciseTen();
        System.out.println("----------------Exercise 11----------------");
        exerciseEleven(7.5);
        System.out.println("----------------Exercise 12----------------");
        exerciseTwelve();
        System.out.println("----------------Exercise 13----------------");
        exerciseThirteen(5.5,8.5);
        System.out.println("----------------Exercise 14----------------");
        exerciseFourteen();
        System.out.println("----------------Exercise 15----------------");
        exerciseFifteen();

    }
    public static void exerciseOne() {
        System.out.println("Hello\n" + "Marcin Petynia");
    }
    public static int exerciseTwo(int a, int b) {
    return a+b;
    }
    public static int exerciseThree(int a, int b) {
        return a/b;
    }
    public static void exerciseFour() {
        int resultOne = -5 + 8 * 6;
        int resultTwo = (55 + 9) % 9;
        int resultThree = 20 + -3 * 5 / 8;
        int resultFour = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
    }
    public static int exerciseFive() {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide first number: ");
        int a = input.nextInt();
        System.out.print("Provide second number: ");
        int b = input.nextInt();
        return a*b;
    }
    public static void exerciseSix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide first number: ");
        int a = input.nextInt();
        System.out.print("Provide second number: ");
        int b = input.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + mod);
    }
    public static void exerciseSeven() {
        System.out.print("Provide first number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static void exerciseEight() {
        System.out.println("    J      a    v     v   a");
        System.out.println("    J     a a    v   v   a a");
        System.out.println("J   J    aaaaa    v v   aaaaa");
        System.out.println(" JJJ    a     a    v   a     a");
    }
    public static double exerciseNine() {
        return ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
    public static void exerciseTen() {
        double result = 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println(result);
    }
    public static void exerciseEleven(double radius) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter of circle with radius " + radius + " is " + perimeter);
        System.out.println("Area of circle with radius " + radius + " is " + area);
    }
    public static void exerciseTwelve() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Provide first number: ");
        double firstNumber = input1.nextDouble();
        System.out.print("Provide second number: ");
        double secondNumber = input1.nextDouble();
        System.out.print("Provide third number: ");
        double ThirdNumber = input1.nextDouble();
        double result = (firstNumber + secondNumber + ThirdNumber) / 3;
        System.out.println(result);
    }

    public static void exerciseThirteen(double width, double height) {
        double area = width * height;
        System.out.println("Area of the rectangle with " + width + " width and " + height + " height equals " + area);
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter of the rectangle with " + width + " width and " + height + " height equals " + perimeter);
    }
    public static void exerciseFourteen() {
        String lineOne = "* * * * * ==================================";
        String lineTwo = " * * * *  ==================================";
        String stripes = "============================================";
        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(lineOne);
        System.out.println(stripes);
        System.out.println(stripes);
        System.out.println(stripes);
        System.out.println(stripes);
        System.out.println(stripes);
        System.out.println(stripes);
    }
    public static void exerciseFifteen() {
        int tmp;
        Scanner variable = new Scanner(System.in);
        System.out.print("Please provide first variable ");
        int variable1 = variable.nextInt();
        System.out.print("Please provide second variable ");
        int variable2 = variable.nextInt();
        System.out.println("First Variable is " + variable1);
        System.out.println("Second Variable is " + variable2);
        tmp = variable1;
        variable1 = variable2;
        variable2 = tmp;
        System.out.println("Now, First Variable is " +variable1);
        System.out.println("Now, Second Variable is " +variable2);
    }

}
