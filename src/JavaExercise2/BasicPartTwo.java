package JavaExercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicPartTwo {
    public static void main(String[] args) {
//        System.out.println("----------------Exercise 16----------------");
//        exerciseSixteen();
//        System.out.println("----------------Exercise 31----------------");
//        exerciseThirtyOne();
//        System.out.println("----------------Exercise 32----------------");
//        exerciseThirtyTwo(25, 39);
//        System.out.println("----------------Exercise 33----------------");
//        System.out.println(exerciseThirtyThree());
//        System.out.println("----------------Exercise 37----------------");
//        exerciseThirtySeven();
//        System.out.println("----------------Exercise 38----------------");
//        exerciseThirtyEight();
        System.out.println("----------------Exercise 39----------------");
        exerciseThrityNine();
        System.out.println("----------------Exercise 40----------------");

        System.out.println("----------------Exercise 38----------------");
        System.out.println("----------------Exercise 39----------------");
        System.out.println("----------------Exercise 40----------------");
        System.out.println("----------------Exercise 41----------------");
        System.out.println("----------------Exercise 42----------------");
        System.out.println("----------------Exercise 43----------------");
        System.out.println("----------------Exercise 44----------------");
    }

    public static void exerciseSixteen() {
        System.out.println(" +\"\"\"\"\"\"\"+");
        System.out.println("[| o   o |]");
        System.out.println(" |   ^   |");
        System.out.println(" |  '-'  |");
        System.out.println(" +-------+");
    }

    public static void exerciseThirtyOne() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }

    public static void exerciseThirtyTwo(int number1, int number2) {
        System.out.println(number1 + " != " + number2 + " -> " + (number1 != number2));
        System.out.println(number1 + " < " + number2 + " -> " + (number1 < number2));
        System.out.println(number1 + " <= " + number2 + " -> " + (number1 <= number2));
    }

    public static int exerciseThirtyThree() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number: ");
        int a = input.nextInt();
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static void exerciseThirtySeven() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide text to be reversed:");
        String rev = input.nextLine();
        String reversedTxt = new StringBuilder(rev).reverse().toString();
        System.out.println(reversedTxt);
    }
    public static void exerciseThirtyEight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please text to be analyzed:");
        String txt = input.nextLine();
        char[] chars = txt.toCharArray();
        int spacesCounter = 0;
        int lettersCounter = 0;
        int digitsCounter = 0;
        int otherMarksCounter = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isSpaceChar(chars[i])) {
                spacesCounter ++;
            } else if (Character.isDigit(chars[i])) {
                digitsCounter ++;
            } else if (Character.isLetter(chars[i])) {
                lettersCounter++;
            } else {
                otherMarksCounter ++;
            }
        }
        System.out.print("Text length equals " + txt.length()+" characters including:\n");
        System.out.print(spacesCounter + " spaces\n");
        System.out.print(lettersCounter + " letters\n");
        System.out.print(digitsCounter + " digits\n");
        System.out.print(otherMarksCounter + " other characters\n");
    }

    public static void exerciseThrityNine() {
        int count = 0;
        for(int i = 1; i <=4 ; i++) {
            for(int j = 1; j<=4 ; j++) {
                if(j == i) continue;
                for(int k = 1; k<=4 ; k++){
                    if(k == j || k == i) continue;
                    System.out.println(""+i+j+k);
                    count++;
                }
            }
        }
        System.out.println("Count: "+ count);

}

}