package Sorting;

import java.util.*;

public class insertionsort {

    public static void sorting(int arr[], int n) {

        for(int i = 1; i < n; i++) {

            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > curr) {

                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in an array:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sorting(arr, n);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}