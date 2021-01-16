
package Controllers;

import View.*;
import Model.*;
import Model.BookList;
import Model.Member;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextArea;


public class BookCON {
    
     static BookList thebooklist;
     static BookUserUI bookUI;
     Member member;
     
     //Δηλωση λίστας
     private static List <Book> booklist;
     
     
    public void BookCΟΝ(Member member){
        bookUI = new BookUserUI(member);    
    }
      
    public static List<Book> getBooklist() {
         return booklist;
     }

    public static void setBooklist(List<Book> booklist) {
         BookCON.booklist = booklist;
     }

    //Ψαχνει αν υπαρχει ενα βιβλιο
    public static Integer searchBook(String titlo){
         
         
         thebooklist= new BookList(); // like this
         booklist = thebooklist.getBooklist();
         
         for(int i=0; i<booklist.size();i++){
           if(booklist.get(i) instanceof Book){
             if (booklist.get(i).getTitlos().equals(titlo)){
                 //x=i;
                 //break;
                 return i;
             }
             
             
            }
          }
         return 0;
     }
       
    //Εμφάνιση βιβλίων
    public static void emfanisivivllion(JTextArea text){
        
        thebooklist= new BookList(); // like this
        booklist = thebooklist.getBooklist(); 
        for(int i=0;i<booklist.size();i++){
            if(booklist.get(i) instanceof Book){
                text.append(i+")Τίτλος:"+" "+booklist.get(i).getTitlos()+" "+"Τιμή:"+" " +booklist.get(i).getTimi()+"\n" );
                System.out.println(i+")Τίτλος:"+" "+booklist.get(i).getTitlos()+" "+"Τιμή:"+" " +booklist.get(i).getTimi() );
            }      
        }
    }
    
    //Διαγραφη βιβλιου
    public static Integer deleteBook(String bookfield){
        
        thebooklist= new BookList();
        booklist = thebooklist.getBooklist();
        System.out.println("ArrayList Before : ");
        for(int i=0; i< booklist.size();i++){
          if(booklist.get(i) instanceof Book){
            System.out.println(booklist.get(i).getTitlos()+" "+booklist.get(i).getTimi() );
          }
        } 
        int x=10000000;
        thebooklist= new BookList(); // like this
        booklist = thebooklist.getBooklist(); 
        for(int i=0; i<booklist.size();i++){
            if(booklist.get(i) instanceof Book){
                if(booklist.get(i).getTitlos().equals(bookfield)){
                   booklist.remove(i);
                   x=i;
                   break;
                }else{
                    x=10000000;
                }
            }
            
        }
        System.out.println("ArrayList After : ");
        for(int i=0;i<booklist.size();i++){
          if(booklist.get(i) instanceof Book){
           System.out.println(booklist.get(i).getTitlos()+" "+booklist.get(i).getTimi());
          }
        } 
        return x;
    }
    
    //Ελεγχος για τιμη
    public static double findpass(String bookfield){
        
       double pass=0.0;
       thebooklist= new BookList();
       booklist = thebooklist.getBooklist(); 
       for(int i=0; i<booklist.size();i++){
        if(booklist.get(i) instanceof Book){
            if (booklist.get(i).getTitlos().equals(bookfield)){
                pass=booklist.get(i).getTimi();
                break;
            }
            else{
                pass=0.0;
             }  
         }
       }
       return pass;
    }
    
    //Eισαγωγη βιβλιου
    public static void addBook(String titlos,double timi){
        
        System.out.println("ArrayList Before Insert: ");
        booklist = new ArrayList();    
        thebooklist= new BookList();
        booklist = thebooklist.getBooklist(); 
        for(int i=0;i<booklist.size();i++){
          if(booklist.get(i) instanceof Book){
            System.out.println(booklist.get(i).getTitlos()+" "+booklist.get(i).getTimi() );
          }
        }
        Book newBook=new Book(titlos,timi,1);
        booklist.add(newBook);
        System.out.println("ArrayList After Insert : ");
        for(int i=0;i<booklist.size();i++){
          if(booklist.get(i) instanceof Book){
            System.out.println(booklist.get(i).getTitlos()+" "+booklist.get(i).getTimi() );
          }
        } 
        
    }
    
    //Ψαχνει βιβλιο βαση τιτλου
    public static Book searchBookbyTitle(String titlos){
        
        thebooklist= new BookList();
        booklist = thebooklist.getBooklist();
        for(Book target : booklist)
            if(target.getTitlos().equals(titlos))
                return target;
        return null;
     }
    
}
