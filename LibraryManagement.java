import java.util.Scanner;
class Books{
   String book_name,book_id,author;
   int count;
   Books(){
   }
   Books(String book_name,String book_id,String author,int count){
    this.book_name = book_name;
    this.book_id = book_id;
    this.author = author;
    this.count = count;
   }
   void DisplayBooks(Books book[]){
    for(int i=0;i<book.length;i++){
     if(book[i]!=null){
      System.out.println("==========Books==========");
      System.out.println("Book Name:   "+book[i].book_name);
      System.out.println("Book ID  :   "+book[i].book_id);
      System.out.println("Author   :   "+book[i].author);
      System.out.println("Count    :   "+book[i].count);
      System.out.println();
     }
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
     for(int i = 0 ;i < book.length;i++){
        if(book[i]!= null && book[i].book_id.equals(bookid)){
            if(book[i].count > 0){
               book[i].count--;
               found = true;
               System.out.println("Book Borrowed Succcessfully!");
               break; } 
            else
                System.out.print("Book not avaiable!");
        }
        
        
     } 
    if(!found)
            System.out.print("Book not found!");}
     void Return(Books book[]){
     System.out.print("Enter bookId to be returned: ");
     bookid = obj.nextLine();
     boolean found = false;
     for(int i = 0 ;i < book.length;i++){
        if(book[i]!=null && book[i].book_id.equals(bookid)){
            book[i].count++;
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
    int i = 0;
    Scanner obj = new Scanner(System.in);
        void userDetails() {
        System.out.print("=======User Details=======\n");
        System.out.print("Enter User Name: ");
        name = obj.nextLine();

        if (i < user.length) {
            user[i++] = name;
            System.out.println("User Name: " + name);
        } else {
            System.out.println("User limit reached!");
        }
    }
    void AddBook(Books book[])
    {
        System.out.print("Enter book name: ");
        String book_name = obj.nextLine();
        System.out.print("Enter book id: ");
        String book_id = obj.nextLine();
        System.out.print("Enter author: ");
        String author = obj.nextLine();
        System.out.print("Enter count: ");
        int count = obj.nextInt();
        obj.nextLine();
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new Books(book_name, book_id, author, count);
                System.out.println("Book Added Successfully!");
                return;
            }
        }
        System.out.println("Book storage is full!");
    }
    void RemoveBook(Books[] book) {
        System.out.print("Enter book id to remove: ");
        String id = obj.nextLine();
        for (int i = 0; i < book.length; i++) {
            if (book[i].book_id.equals(id)) {
                book[i] = null;
                System.out.println("Book Removed Successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }
}
    


class TransactionLog{
    

}

public class LibraryManagement{
    public static void main(String[] args) {
        int pos; char ch;
        Scanner obj = new Scanner(System.in);
        Books[] book = new Books[10];
        book[0] = new Books("Harry potter","2314","Jk.Rowling",10);
        book[1] = new Books("Wimpy Kid","3272","Jeff Kinney",7);
        book[2] = new Books("The Shining","7281","Stephen king",2);
        book[3] = new Books("Spider-Man","5821","Stan-Lee",5);
        book[4] = new Books("The lord of rings","2783","Tokins",8);
        System.out.print("1-Librarian || 2-Public: ");
        pos = obj.nextInt();
        obj.nextLine();
        switch(pos){
            case 1:
            
                Librarian lib = new Librarian();
            do{
                System.out.print("1-BooksList,2-Users,3-Addbooks,4-Removebooks: ");
                int ch1 = obj.nextInt();
                switch(ch1){
                    case 1:
                        lib.DisplayBooks(book);
                        break;
                    case 2:
                        lib.userDetails();
                        break;
                    case 3:
                        lib.AddBook(book);
                        break;
                    case 4:
                        lib.RemoveBook(book);
                        break;
                    default:
                        System.out.print("Try Again!");
                }
                System.out.print("Go back to home(y/n): ");
                ch = obj.next().charAt(0);}
                while(ch=='y');
                break;
            
            case 2:
                BorrowReturn br = new BorrowReturn();
                
                do{
                System.out.print("1-Bookslist,2-BorrowBook,3-ReturnBook: ");
                int ch2 = obj.nextInt();
                
                switch(ch2){
                    case 1:
                        br.DisplayBooks(book);
                        break;
                    case 2:
                        br.borrow(book);
                        break;
                    case 3:
                        br.Return(book);
                        break;
                    default:
                        System.out.print("Try Again!");
                }

           
                
                System.out.print("Go back to home(y/n): ");
                ch = obj.next().charAt(0);}
        
                while(ch=='y');
                break;
             default:
                    System.out.print("System Crashed Try again!");
        }

            }
        }
    
