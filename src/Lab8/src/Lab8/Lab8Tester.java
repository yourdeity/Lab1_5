package Lab8;

import java.util.Scanner;

public class Lab8Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input k = ");
        int k = in.nextInt();

        System.out.print("Input s = ");
        int s = in.nextInt();
        System.out.println("Result " + SumChecker(k, s));
    }

        static int SumChecker(int k, int s) {
        int startNumber = (int) Math.pow(10, k-1);
        int endNumber = (int) Math.pow(10, k) - 1;

        int currentNumber = startNumber;
        int sumCount = 0;
        while (currentNumber <= endNumber) {
            if (DigitsSum(currentNumber) == s) {

                sumCount++;
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
            return sumCount;
    }

        static int DigitsSum(int number){
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }
