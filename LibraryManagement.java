import java.util.Scanner;
class Books{
   String book_name,book_id,author,books[]=new String[10];
   int count;
   Books(){
   }
   Books(String book_name,String book_id,String author,int count){
    this.book_name = book_name;
    this.book_id = book_id;
    this.author = author;
    this.count = count;
   }
   void DisplayBooks(){
      System.out.println("==========Books==========");
      System.out.println("Book Name:   "+book_name);
      System.out.println("Book ID  :   "+book_id);
      System.out.println("Author   :   "+author);
      System.out.println("Count    :   "+count);
   }
}
class BorrowReturn extends Books{

    String bookid;
    Scanner obj = new Scanner(System.in);
    void borrow(){
     System.out.println("Enter bookId to be borrowed: ");
     book_id = obj.nextLine();
     for(int i = 0 ;i < 10;i++){
        if(bookid.equals(book_id)){
            count--;
            System.out.println("Book Borrowed Succcessfully!");
            break; 
        }
        else
            System.out.print("Book not found!");
     } }
     void Return(){
     System.out.println("Enter bookId to be returned: ");
     book_id = obj.nextLine();
     for(int i = 0 ;i < 10;i++){
        if(bookid == book_id){
            count++;
            System.out.println("Book Returned Succcessfully!");
            break; 
        }
     } }

    }
    
class Librarian extends Books{
    String user[] = new String[10],name; 
    Scanner obj = new Scanner(System.in);
    int i = 0;
    void userDetails(){
        System.out.print("=======User Details=======");
        name = obj.nextLine();
        user[i++] = name;
        System.out.print("User Name:  "+name);
        System.out.print
    }

}
class TransactionLog{

}

public class LibraryManagement{
    public static void main(String[] args) {
        int pos;
        Scanner obj = new Scanner(System.in);
        Books[] book = new Books[5];
        book[0] = Books("Harry potter","2314","Jk.Rowling",10);
        book[1] = Books("Wimpy Kid","3272","Jeff Kinney",7);
        book[2] = Books("The Shining","7281","Stephen king",2);
        book[3] = Books("Spider-Man","5821","Stan-Lee",5);
        book[4] = Books("The lord of rings","2783","Tokins",8);
        System.out.print("1-Librarian || 2-Public");
        pos = obj.nextInt();
        switch(pos){
            case 1:
                Librarian lib = new Librarian();
                System.out.print("1-BooksList,2-Users,3-Addbooks,4-Removebooks: ");
                int ch = obj.nextInt();
                if(ch==1){
                    lib.DisplayBooks();
                }
                else if(ch==2){
                    
                }

        }
        

    }
}