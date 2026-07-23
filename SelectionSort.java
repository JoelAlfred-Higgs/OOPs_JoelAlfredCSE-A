import java.util.Scanner;
class SelectionSort{
   public static void main(String[] args) {
      int arr[] = new int[10],i,j,minindex,temp;
      Scanner obj = new Scanner (System.in);
      System.out.print("Enter Array elements: ");
      for(i=0;i<5;i++){
        arr[i] = obj.nextInt();
      }
      for(i=0;i<5;i++){
        minindex = i;
        for(j = i+1;j<5;j++){
            if(arr[j]<arr[minindex])
                minindex = j;
        }
        // swap i and minindex elements                                                                                                                                             
        temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
      }
      // sorted array
      System.out.println("Sorted Array using Selection Sort");
      for(i=0;i<5;i++)
        System.out.print(arr[i] + " ");
      obj.close();
   } 
}