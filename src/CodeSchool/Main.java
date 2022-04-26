package CodeSchool;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.print("Input Array legth: ");
        int arrayLength = sc.nextInt();
        int[] numbersArray = new int[arrayLength];


        for (int i = 0; i < arrayLength; i++) {
            int number = rn.nextInt(-100, 101);
            numbersArray[i] = number;
            System.out.println(numbersArray[i]);
        }


        int min = numbersArray[0];
        int max = numbersArray[0];

        for (int i = 1; i < numbersArray.length; i++) {

            //Search maximum
            if (numbersArray[i] >= max) {
                max = numbersArray[i];
            }

            //Search minimum
            if (numbersArray[i] <= min) {
                min = numbersArray[i];
            }

        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min + "\n");


        //Search number
        System.out.print("Search Number: ");
        int searchNumber = sc.nextInt();
        int count = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (searchNumber == numbersArray[i]) {
                count++;
            }
        }

        System.out.println("Count: " + count + "\n");


        //SQRT
        System.out.println("The numbers from which the square root comes out:");


        int sqrtArray[] = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {

            if (numbersArray[i] == 1) {
                System.out.println(numbersArray[i] + " = " + 1 + "^2");
                sqrtArray[i] = 1;
                continue;
            }

            for (int j = 0; j < numbersArray[i] / 2; j++) {
                if (j * j == numbersArray[i]) {
                    System.out.println(numbersArray[i] + " = " + j + "^2");
                    sqrtArray[i] = j;
                    break;
                }
            }

        }


        //SQRT minimum, maximum
        Arrays.sort(sqrtArray);
        if (sqrtArray[sqrtArray.length - 1] != 0) {
            System.out.println("Max SQRT: " + sqrtArray[sqrtArray.length - 1] + "^2 = " + sqrtArray[sqrtArray.length - 1] * sqrtArray[sqrtArray.length - 1]);

            for (int i = sqrtArray.length - 1; i >= 0; i--) {

                if (sqrtArray[i] == 0) {
                    System.out.println("Min SQRT: " + sqrtArray[i + 1] + "^2 = " + sqrtArray[i + 1] * sqrtArray[i + 1] + "\n");
                    break;
                }

            }

        } else if (sqrtArray[sqrtArray.length - 1] == 0) {
            System.out.println("Maximum SQRT=0 and Minimum SQRT=0, or SQRT number not valid:\n");
        }


        //Sum of two numbers
        System.out.print("Sum of two numbers: ");
        int sum = sc.nextInt();

        for (int i = 0; i < numbersArray.length; i++) {

            for (int j = i; j < numbersArray.length; j++) {
                if (i != j && numbersArray[i] + numbersArray[j] == sum) {
                    System.out.println(sum + " = " + numbersArray[i] + "(" + i + ") + " + numbersArray[j] + "(" + j + ")");
                }
            }

        }

    }
}
