package Sorting;
import java.util.*;
public class selectionsort {
    public static void sorting(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int minposition=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[minposition]>arr[j]){
                     minposition=j;
                } 
            }
            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
        } 
    }

        public static void main(String args[]){
            Scanner sc =new Scanner (System.in);
            System.out.print("Enter size of an array:");
            int n=sc.nextInt();
            System.out.print("Enter elements in an array:");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        sorting(arr,n);
        for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
        }       
    }
 }


