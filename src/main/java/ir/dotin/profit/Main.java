package ir.dotin.profit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        maxProfit maxInterest = new maxProfit();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array members : ");
        int n = input.nextInt();
        int prices[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter a[" + i + "] : ");
            prices[i] = scanner.nextInt();
        }
        System.out.print("maxProfit: " + maxInterest.maxProfit(prices));

    }
}