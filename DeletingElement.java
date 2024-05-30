package quesionNo6;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        int[] array = {10, 7, 1, 20, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index to be deleted: ");
        int indexToDelete = sc.nextInt();
        deleletElement(array, indexToDelete);
    }

    private static void deleletElement(int[] array, int indexToDelete) {
        int[] newArray = new int[array.length - 1];
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("invalid index");
        }
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = array[i];
                System.out.println(Arrays.toString(newArray));
            }
        }
    }
}