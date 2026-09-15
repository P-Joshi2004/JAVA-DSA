package Sorting;

import java.util.Scanner;

public class countingsort {
    public static void sorting(int arr[],int n){
        int largest= Integer.MIN_VALUE;//finding argest element
        for(int i=0;i<n-1;i++){
           largest=Math.max (largest,arr[i]);
        }
        //creating count array
        int count[]=new int[largest+1];
        //count element
        for(int i=0;i<n-1;i++){
            count[arr[i]]++;
        }
        //put element 
        int j=0;
        for(int i=0;i<n-1;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements in an array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
     sorting(arr,n);
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
       }
        
    }
}
    
    
        
