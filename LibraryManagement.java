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
   void DisplayBooks(Books Book[]){
    for(int i=0;i<Book.length;i++){
      System.out.println("==========Books==========");
      System.out.println("Book Name:   "+Book[i].book_name);
      System.out.println("Book ID  :   "+Book[i].book_id);
      System.out.println("Author   :   "+Book[i].author);
      System.out.println("Count    :   "+Book[i].count);
      System.out.println();
   }
   }
}
class BorrowReturn extends Books{

    String bookid;
    Scanner obj = new Scanner(System.in);
    void borrow(Books book[]){
     boolean found = false;
     System.out.println("Enter bookId to be borrowed: ");
     bookid = obj.nextLine();
     for(int i = 0 ;i < 10;i++){
        if(book[i].book_id.equals(bookid)){
            if(book[i].count > 0){
               count--;
               found = true;
               System.out.println("Book Borrowed Succcessfully!");
               break; } 
            else
                System.out.print("Book not avaiable!");
        }
        if(!found)
            System.out.print("Book not found!");
        
     } }
     void Return(Books book[]){
     System.out.println("Enter bookId to be returned: ");
     bookid = obj.nextLine();
     boolean found = false;
     for(int i = 0 ;i < 10;i++){
        if(book[i].book_id == bookid){
            count++;
            found = true;
            System.out.println("Book Returned Succcessfully!");
            break; 
        }
     } 
     if(!found)
        System.out.print("Book not found!");

    }

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
        System.out.print("Book Name: "+
    }
    void AddBook()
    {

    }

}
class TransactionLog{

}

public class LibraryManagement{
    public static void main(String[] args) {
        int pos,count;
        String book_name,book_id,author;
        Scanner obj = new Scanner(System.in);
        Books[] book = new Books[10];
        book[0] = new Books("Harry potter","2314","Jk.Rowling",10);
        book[1] = new Books("Wimpy Kid","3272","Jeff Kinney",7);
        book[2] = new Books("The Shining","7281","Stephen king",2);
        book[3] = new Books("Spider-Man","5821","Stan-Lee",5);
        book[4] = new Books("The lord of rings","2783","Tokins",8);
        System.out.print("1-Librarian || 2-Public");
        pos = obj.nextInt();
        switch(pos){
            case 1:
                Librarian lib = new Librarian();
                System.out.print("1-BooksList,2-Users,3-Addbooks,4-Removebooks: ");
                int ch = obj.nextInt();
                switch(ch){
                    case 1:
                        lib.DisplayBooks(book[]);
                        break;
                    case 2:
                        int id;
                        System.out.print("Enter User ID: ");
                        id = obj.nextInt();
                        lib.userDetail(id);
                        break;
                    case 3:
                        System.out.print("Enter book name,id,author: ");
                        book_id = obj.nextInt();
                        book_name = obj.nextLine();
                        author = obj.nextLine();
                        
                    case 4:

            
            case 2:
                BorrowReturn obj = new BorrowReturn();
                System.out.print("1-Bookslist,2-BorrowBook,3-ReturnBook: ");
                int ch = obj.nextInt();
                switch(ch){
                    case 1:
                        obj.DisplayBooks(book[]);
                        break;
                    case 2:
                        obj.borrow(book[]);
                        break;
                    case 3:
                        obj.Return(book[]);
                        break;
                    default:
                        System.out.print("Try Again!");
                }


                    

                }
                



        }
        

    }
}