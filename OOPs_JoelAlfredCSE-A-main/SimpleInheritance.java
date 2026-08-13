class Parent{
    void house(){
        System.out.println("Parent's House!");
    }
    void car(){
        System.out.print("Parent's car!");
    }
}
class Child extends Parent{
    void study(){
        System.out.println("child goes to school!");
    }
    void play(){
        System.out.print("Child plays!");
    }
}

public class SimpleInheritance{
    public static void main(String[] args){
       Child prop = new Child();
       prop.house();
       prop.car();
       prop.study();
       prop.play();
    
    }
}