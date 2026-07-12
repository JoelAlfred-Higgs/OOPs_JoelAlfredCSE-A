import java.util.Scanner;

public class binarysearch {
    public static void main(){
    int low,high,mid,n,arr[] = new int[5],i;
    boolean found = false;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to be searched:");
    n = sc.nextInt();
    System.out.print("Enter sorted array elements: ");
    for(i=0;i<5;i++){
        arr[i] = sc.nextInt();
    }
    low = 0;
    high = 4;
    while ((low<=high)) {
        mid = low + (high-low)/2;
        if(arr[mid] == n){
            System.err.println("Element "+n+" is present");
            found = true;
            break;}
        else if(n>arr[mid])
            low = mid+1;
        else
            high= mid-1;

    }
      if(!found )
      System.err.println("Element is not present");

      sc.close();
    }


}
