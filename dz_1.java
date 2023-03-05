package org.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

//          maxxminn();
//          searchval();
        inputNameAndPrintDiversisSalutem();
    }

//    private static void maxxminn() {
//        int[] arr = {4, 56, 55, 1, 23, 45};
//
//        IntSummaryStatistics stats = Arrays.stream(arr).summaryStatistics();
//
//        System.out.println("Минимальный элемент в массиве: " + stats.getMin());
//        System.out.println("Максимальный элемент в массиве: " + stats.getMax());
//    }

//      private static void searchval() {
//        int[] A = {3, 2, 2, 3};
//        int val = 3;
//
//        for (int i : A) {
//
//            if (i != 0) {
//                A[val++] = i;
//            }
//        }
//
//        for (int i = val; i < A.length; i++) {
//            A[i] = 3;
//        }
//        System.out.println(Arrays.toString(A));
//    }
        private static void inputNameAndPrintDiversisSalutem() {

        Scanner in = new Scanner(System.in);
        System.out.printf("name: ");
        String name = in.nextLine();

        var h = (new Date()).getHours();
        if (h > 3 && h < 7) {
            System.out.println("Доброй ночи " + name);
        }
        if (h > 6 && h < 12) {
            System.out.println("Доброе утро " + name);
        }
        if (h > 11 && h < 17) {
            System.out.println("Добрый день " + name);
        }
        if (h > 16 && h < 24) {
            System.out.println("Добрый вечер " + name);
        }
        if (h > 23 || h < 4 ) {
            System.out.println("Доброй ночи " + name);
        }
        in.close();
}

}