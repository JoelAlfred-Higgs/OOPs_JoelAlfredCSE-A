class Animal{
    void eat(){
        System.out.println("Eating!");
    }
}
class Lion extends Animal{
    void hunt(){
        System.out.println("Hunting!");
    }
}
class BabyLion extends Lion{
    void play(){
        System.out.println("Playing!");
    }
}
public class MultilevelInheritance{
    public static void main(String[] args) {
        BabyLion lion =  new BabyLion();
        lion.eat();
        lion.hunt();
        lion.play();
    }    
}