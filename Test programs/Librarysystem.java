import java.util.Scanner;
import java.util.ArrayList;

 class Book {
    String title ;
    String author ;
    boolean isavailable;

    Book (String title , String author) {
        this.title = title ;
        this.author = author;
        this.isavailable = true;
    }
 }

public class Librarysystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Book> books = new ArrayList<>();

        while (true){

            System.out.println("\n----------- LIBRARY MANAGEMENT SYSTEM ------------");
            System.out.println("Enter any choice ");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Search Books");
            System.out.println("5. Show Books");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:{
                     System.out.println("Enter the Book title = ");
                     String title = sc.nextLine();
                     System.out.println("Enter the Author name = ");
                     String author = sc.nextLine();
                     books.add(new Book(title, author));
                     System.out.println("Book added successfully");
                     break;
            }
               case 2 :{
                     System.out.println("Enter the Book borrow = ");
                     String borrowtitle = sc.nextLine();
                     boolean foundborrow = false ;

                     for ( Book b : books ) {
                        if (b.title.equalsIgnoreCase(borrowtitle)){

                            foundborrow = true ;

                            if(b.isavailable){
                                b.isavailable = false ;
                                System.out.println("Book Borrowed Succesfully");
                            } else {
                                System.out.println("Book already Borrowed");
                            }
                        }
                        
                     }
                     if(!foundborrow){
                            System.out.println("Book Not found");
                        }
                     break;
               }
              case 3 : {
                     System.out.println("Enter the Book to return");
                     String returntitle = sc.nextLine();
                     boolean foundreturn = false ;

                     for (Book b : books){
                         if(b.title.equalsIgnoreCase(returntitle)){

                            foundreturn = true ;

                            if (!b.isavailable){

                                b.isavailable = true ;
                                  System.out.println("Book Returned Successfully");
                            } else {
                                System.out.println("Book was not borrowed ");
                            }
                         }
                         if(!foundreturn){
                            System.out.println("The book is not found ");
                         }

                     }
                     break;
              }
               case 4 : {
                    System.out.println("Enter the Name of the book = ");
                    String searchtitle = sc.nextLine();
                    boolean foundsearch = false ;

                    for ( Book b : books) {
                        if(b.title.equalsIgnoreCase(searchtitle)){

                            foundsearch = true ;

                            System.out.println("The Requested book found is = "+searchtitle);
                            System.out.println("Authored By = " + b.author);

                        } 
                        if(!foundsearch){
                            System.out.println("Book not found");
                        }
                    };
                    break;
               }
               case 5:{
                     if(books.isEmpty()){
                        System.out.println("The Library is Empty ");
                     }
                     else {
                        for (Book b : books){
                            System.out.println(" Title "+b.title);
                            System.out.println(" Author "+b.author);
                            System.out.println(" Availability "+b.isavailable);
                        }
                     }
                     break;
               }
              case 6:{
                   System.out.println("Exited Thank You <3 ");
                   sc.close();
                   return;
              }
              default : {
                System.out.println ("Invalid Choice");
              }
        }
        
    }
 } 
    
}