import java.io.*;
import java.util.Scanner;
public class FileHandling {
    public static void main(String []args){
        String line ;
        try(
        FileReader f1 = new FileReader("File1.txt");
        Scanner sc = new Scanner(f1);
        FileWriter c_f1 = new FileWriter("copyfile1.txt")){
        while(sc.hasNextLine()){
              line = sc.nextLine();
              c_f1.write(line);
        }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program ended!!!");
        }
    }
}
