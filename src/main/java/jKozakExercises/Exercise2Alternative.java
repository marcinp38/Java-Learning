package jKozakExercises;

import java.util.Random;
import java.util.Scanner;
//Napisać program, który wczytuje od użytkownika liczby dopóty, dopóki nie zostanie podana liczba
//mniejsza od 1. Następnie dokonuje losowania tylu liczb, ile wynosiła maksymalna z wartości podanych przez
//użytkownika. Zakres losowanych liczb, to -199 do 199. W wyniku powinien zostać wyświetlony stosunek
//średniej arytmetycznej wszystkich „co drugich" wylosowanych liczb dodatnich do wszystkich co trzecich
//wylosowanych liczb (można zacząć od dowolnego momentu, ale nie później niż od 2 i 3 z podanych liczb).
//W programie nie należy używać tablic
public class Exercise2Alternative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max;
        int number;
        Random ran = new Random();
        int sumEverySecond = 0;
        int sumEveryThird = 0;
        double average;

        System.out.print("Please provide a number: ");
        number = in.nextInt();
        max = number;
        while (number > 0) {
            System.out.print("Please provide a number: ");
            number = in.nextInt();
            if (number > max) {
                max = number;
            }
        }
        for (int i = 0; i < max; i++) {
            int r = ran.nextInt(200 +199)-199;
            System.out.println(r);
            if (i == 0) {
            } else if (i % 6 == 0) {
                sumEverySecond += r;
                sumEveryThird += r;
            } else if (i % 2 == 0) {
                sumEverySecond += r;
            } else if (i % 3 == 0) {
                sumEveryThird += r;
            }
        }
        average = sumEverySecond / (double) sumEveryThird;
        System.out.println("The average of every second by every third number randomly picked is: " + average);

    }
}
