package jKozakExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Napisać program, który wczytuje od użytkownika liczby dopóty, dopóki nie zostanie podana liczba
//mniejsza od 1. Następnie dokonuje losowania tylu liczb, ile wynosiła maksymalna z wartości podanych przez
//użytkownika. Zakres losowanych liczb, to -199 do 199. W wyniku powinien zostać wyświetlony stosunek
//średniej arytmetycznej wszystkich „co drugich" wylosowanych liczb dodatnich do wszystkich co trzecich
//wylosowanych liczb (można zacząć od dowolnego momentu, ale nie później niż od 2 i 3 z podanych liczb).
public class Exercise2 {
    public static void main(String[] args) {
        int max = 0;
        int sumEverySecond=0;
        int sumEveryThird=0;
        double average;
        List<Integer> list = getNumbers();
        System.out.println("List of numbers provided: " + list);
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        ArrayList<Integer> listOfRandomNumbers = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            listOfRandomNumbers.add(getRandomNumbers(max));
        }
        System.out.println("list of random numbers "+ listOfRandomNumbers);

        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
            if (i%2==0) {
                sumEverySecond += listOfRandomNumbers.get(i);
            }
        }
        for (int i = 0; i< listOfRandomNumbers.size();i++){
            if (i%3==0) {
            sumEveryThird += listOfRandomNumbers.get(i);
            }
        }
        average = sumEverySecond / Double.valueOf(sumEveryThird);
        System.out.println(Double.valueOf(average));
    }

    public static List<Integer> getNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Please provide number: ");
        int number = input.nextInt();

            while (number>=1) {
                list.add(number);
                System.out.print("Please provide number: ");
                number = input.nextInt();
            }
        return list;
    }
    public static int getRandomNumbers(int qty) {
        Random random = new Random();
        int min = -199;
        int max = 199;
        int rand = random.nextInt(max - min) + min;
        return (rand);

    }



    }

