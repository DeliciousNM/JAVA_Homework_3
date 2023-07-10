package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class homework {
    static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    /*
    Задание
    Пусть дан произвольный список целых чисел.
    1) Нужно удалить из него чётные числа
    2) Найти минимальное значение
    3) Найти максимальное значение
    4) Найти среднее значение 
    */

    static void findAverage(){
        int size = random.nextInt(10,16);
        ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(0,101));
        }
        System.out.println(arrayList);
        System.out.printf("Среднее значение: %.2f\n", average(arrayList));
    }

    static void findMax(){
        int size = random.nextInt(10,16);
        ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(0,101));
            }
        System.out.println(arrayList);
        System.out.printf("Максимальное значение: %d\n", Collections.max(arrayList));
    }

    static void findMin(){
        int size = random.nextInt(10,16);
        ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(0,101));
        }
        System.out.println(arrayList);
        System.out.printf("Минимальное значение: %d\n", Collections.min(arrayList));
    }

    static void removeEven(){
        int size = random.nextInt(10,16);
        ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(0,101));
            }
        System.out.println(arrayList);
        arrayList.removeIf(n -> n % 2 == 0);
        System.out.println(arrayList);
    }


    static double average (ArrayList<Integer> arrayList) {
        
        double sum = 0;
            for(int i = 0 ; i < arrayList.size();i++) {
                sum += arrayList.get(i);
            }   
        return sum / arrayList.size();
    }


    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 Удалить чётные числа");
            System.out.println("2 Найти минимальное значение");
            System.out.println("3 Найти максимальное значение");
            System.out.println("4 Найти среднее значение");
            System.out.println("0 завершение работы");
            System.out.print("Введите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());

            if (no == 1) {
                removeEven();
                System.out.println();
            } else if (no == 2) {
                findMin();
                System.out.println();
                System.out.println();
            } else if (no == 3) {
                findMax();
                System.out.println();
                System.out.println();
            } else if (no == 4) {
                findAverage();
                System.out.println();
                System.out.println();
            } else if (no == 0) {
                f = false;
                System.out.print("Завершение работы");
            }
        }
    }
}

