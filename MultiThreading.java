class MultiA extends Thread{
      public void run(){
        for(int i= 0 ;i<5;i++)
        System.out.print("Thread A is running! \n");
      }
}
class MultiB extends Thread{
      public void run(){
        for(int i = 0;i<5;i++)
        System.out.print("Thread B is running! \n");
      }
}

public class MultiThreading{
    public static void main(String[] args){
        MultiA A = new MultiA();
        MultiB B = new MultiB();
        A.start();
        B.start();                                                                                                                                                                 

    }
}