package jKozakExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
//Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
//podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide number ");
        int number = input.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(number);

        while (number!=150) {
            System.out.print("Please provide next number ");
            number = input.nextInt();
            list.add(number);
        }
        int sum = 0;
        double average = 0;
        int div = 0;

        for (int i=0;i<list.size();i++) {
            sum += list.get(i);
        }
        sum-=150;
        average = sum/(list.size()-1);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>3 && list.get(i) % 3 == 0) {
                div++;
            }
        }
        div -=1;

        System.out.println("Sum of all declared numbers without 150 is: " + sum);
        System.out.println("Average of all declared numbers without 150 is: " + average);
        System.out.println("The amount of the numbers that can be divided by 3 without 150 is: " + div);
    }

}
