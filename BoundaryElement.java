class BoundaryElement{
    void main(String[] args){
        int [][] arr = {
            {10,20,30},
            {1,2,3,4,5,6},
            {16,8}
        };
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                if(i==0||j==0||i == arr.length-1||j == arr[i].length-1)
                    System.out.print(arr[i][j] + "\t");
                else
                    System.out.print("\t");
              }  
              System.out.println(); 
        }
    }
}