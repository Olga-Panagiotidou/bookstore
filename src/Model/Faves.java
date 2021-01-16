
package Model;

import Ex.DuplicateException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Faves {
    private ArrayList <Book> periexomeno = new ArrayList();
    
    public void addToFaves (Book book){
        if(isInFaves(book)){
            JOptionPane.showMessageDialog(null, "This book is already in your "
                    + "Faves");
        return;}
        periexomeno.add(book);
    }
    
    public void rmFromFaves(Book book){
        if(isInFaves(book))
            for(Book target : periexomeno){
                if(target == book)
                    periexomeno.remove(book);
            }
    }
    
    public Boolean isInFaves(Book book){
        for(Book target : periexomeno)
            if(target.equals(book))
                return true;
        return false;      
    }
    
    public void rmFavesBought(Cart cart){
        for (Book target : periexomeno)
            if (cart.getPeriexomeno().contains(target))
                periexomeno.remove(target);
    }

    public void setPeriexomeno(ArrayList<Book> periexomeno) {
        this.periexomeno = periexomeno;
    }

    public ArrayList<Book> getPeriexomeno() {
        return periexomeno;
    }
    
}
