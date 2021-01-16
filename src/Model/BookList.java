
package Model;


import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class BookList implements Serializable{
    
    private String titlos;
    private int timi;
    private int b_id;
    
    private static List<Book> booklist = new ArrayList<Book>();
    
   //αρχικοποιηση βιβλιων στη λιστα
    public BookList(){
        
        //comedy
         Book b0=new Book("Let's pretend it never happened.",15.99,0);
         Book b1=new Book("2030.",10.50,1);
         Book b2=new Book("Catcher in the Rye.",23.99,2);
         Book b3=new Book("One day We'll matter.",18.99,3);
         Book b4=new Book("American Cornball.",9.99,4);
         Book b5=new Book("Sick in the Head.",16.99,5);
         
         //thriller
         Book b6=new Book("These bones are not my child.",13.99,6);
         Book b7=new Book("The Shining.",20.99,7);
         Book b8=new Book("Dead Letters.",21.99,8);
         Book b9=new Book("Silent patient.",17.99,9);
         Book b10=new Book("He died with his eyes open.",12.99,10);
         Book b11=new Book("Killing floor.",15.99,11);
         
         //psycho
         Book b12=new Book("Dreams.",11.99,12);
         Book b13=new Book("Να έχεις ή να είσαι.",22.99,13);
         Book b14=new Book("Όταν έκλαψε ο Νίτσε.",19.99,14);
         Book b15=new Book("Success.",13.99,15);
         Book b16=new Book("¶κου ανθρωπάκο.",9.99,16);
         Book b17=new Book("Blink.",13.99,17);
         
         //prog
         Book b18=new Book("Το δώρο του θυμού.",10.99,18);
         Book b19=new Book("Ο μοναχός.",12.99,19);
         Book b20=new Book("Αποτυχία.",13.99,20);
         Book b21=new Book("Η τέχνη του να ακούς.",24.99,21);
         Book b22=new Book("Ο Γίγαντας μέσα μας.",20.99,22);
         Book b23=new Book("Ελευθερία.",12.99,23);
         
         //poetry
         Book b24=new Book("Η σονάτα του σεληνόφωτος.",15.99,24);
         Book b25=new Book("¶ξιον εστί.",10.99,25);
         Book b26=new Book("Ιθάκη.",18.99,26);
         Book b27=new Book("Στοιχειομαχία.",23.99,27);
         Book b28=new Book("Σονέτα.",23.99,28);
         Book b29=new Book("Ποιήματα ¶.",14.99,29);
         
         //scifi
         Book b30=new Book("Hitchickers guide to the galaxy.",13.99,30);
         Book b31=new Book("Dune.",19.99,31);
         Book b32=new Book("Foundation.",16.99,32);
         Book b33=new Book("Solaris.",20.99,33);
         Book b34=new Book("The three body problem.",9.99,34);
         Book b35=new Book("Hyperion.",7.99,35);
         
         //fantasy
         Book b36=new Book("The lies of Locke Lamora.",12.99,36);
         Book b37=new Book("Silmarillion.",18.99,37);
         Book b38=new Book("The dark tower.",21.99,38);
         Book b39=new Book("Good omens.",20.99,39);
         Book b40=new Book("American Gods.",23.99,40);
         Book b41=new Book("Pedrido Street Station.",19.99,41);
         
         //history
         Book b42=new Book("Life and Fate.",16.99,42);
         Book b43=new Book("Ordinary Men.",10.99,43);
         Book b44=new Book("On War.",20.99,44);
         Book b45=new Book("The histories.",25.99,45);
         Book b46=new Book("The printing press.",13.99,46);
         Book b47=new Book("The Crusades.",30.99,47);
         
         //crime
         Book b48=new Book("The snowman.",17.99,48);
         Book b49=new Book("Mr Mercedes.",16.99,49);
         Book b50=new Book("A game of shadows.",20.99,50);
         Book b51=new Book("Still life.",13.99,51);
         Book b52=new Book("Murder on the Orient Express.",27.99,52);
         Book b53=new Book("American Heroin.",17.99,53);
         
         //romance
         Book b54=new Book("Pride and Prejudice.",19.99,54);
         Book b55=new Book("The notebook.",14.99,55);
         Book b56=new Book("Jayne Eyre.",20.99,56);
         Book b57=new Book("Gone with the wind.",13.99,57);
         Book b58=new Book("Memoirs of Geisha.",29.99,58);
         Book b59=new Book("It ends with us.",8.99,59);
         
         
        
         
         //add 
         booklist.add(b0);
         booklist.add(b1);
         booklist.add(b2);
         booklist.add(b3);
         booklist.add(b4);
         booklist.add(b5);
         booklist.add(b6);
         booklist.add(b7);
         booklist.add(b8);
         booklist.add(b9);
         booklist.add(b10);
         booklist.add(b11);
         booklist.add(b12);
         booklist.add(b13);
         booklist.add(b14);
         booklist.add(b15);
         booklist.add(b16);
         booklist.add(b17);
         booklist.add(b18);
         booklist.add(b19);
         booklist.add(b20);
         booklist.add(b21);
         booklist.add(b22);
         booklist.add(b23);
         booklist.add(b24);
         booklist.add(b25);
         booklist.add(b26);
         booklist.add(b27);
         booklist.add(b28);
         booklist.add(b29);
         booklist.add(b30);
         booklist.add(b31);
         booklist.add(b32);
         booklist.add(b33);
         booklist.add(b34);
         booklist.add(b35);
         booklist.add(b36);
         booklist.add(b37);
         booklist.add(b38);
         booklist.add(b39);
         booklist.add(b40);
         booklist.add(b41);
         booklist.add(b42);
         booklist.add(b43);
         booklist.add(b44);
         booklist.add(b45);
         booklist.add(b46);
         booklist.add(b47);
         booklist.add(b48);
         booklist.add(b49);
         booklist.add(b50);
         booklist.add(b51);
         booklist.add(b52);
         booklist.add(b53);
         booklist.add(b54);
         booklist.add(b55);
         booklist.add(b56);
         booklist.add(b57);
         booklist.add(b58);
         booklist.add(b59);
         
         
    }

     public BookList(String titlos, int timi,int b_id) {
        this.titlos = titlos;
        this.timi = timi;
        this.b_id = b_id;
    }
    

    public static List<Book> getBooklist() {
        return booklist;
    }

    public static void setBooklist(List<Book> booklist) {
        BookList.booklist = booklist;
    }
    
    
    
}
