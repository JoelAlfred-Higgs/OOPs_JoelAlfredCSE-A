import java.util.Scanner;
public class InsertionSort{
    public static void main(String[] args){
        int arr[] = new int[10],i,n,key;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        n = obj.nextInt();
        System.out.print("Enter array elements: ");
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        
        for(i=1;i<n;i++){
            key = arr[i];
            int j = i-1;
            if(arr[j]>key)
                while(arr[i]<arr[j]&&j>=0){
                   arr[j+1] = arr[j];
                   j--;
             }
             arr[j+1] = key;       
        }
        System.out.println("Sorted array using Insertion sort: ");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

}