
package Model;
import java.util.ArrayList;
import Ex.*;
import javax.swing.JOptionPane;

public class Cart{
    
    private double telPrice;
    private ArrayList <Book> periexomeno = new ArrayList();
    
    //��������� ������ ��� ������
    public void addToCart(Book book){
        if(isInCart(book)){
            JOptionPane.showMessageDialog(null, "This book is already in your "
                    + "cart");
            return;
        }
        periexomeno.add(book);
    }
    
    //������� ������ ��� �� ������
    public void rmFromCart(Book book){
        if(isInCart(book))
            for(Book target : periexomeno){
                if(target == book)
                    periexomeno.remove(book);
        }
    }
    //������� �� ��� ������ ��������� ��� ������
    public Boolean isInCart(Book book){
        for(Book target : periexomeno)
            if(target.equals(book))
                return true;
        return false;      
    }

    public ArrayList<Book> getPeriexomeno() {
        return periexomeno;
    }
    
    //���������� �� �������� ������ ��� ������� ��� ������
    public double sumFinal(){
        for (Book target : periexomeno)
            telPrice+=target.getTimi();
        return telPrice;
    }

    public void setPeriexomeno(ArrayList<Book> periexomeno) {
        this.periexomeno = periexomeno;
    }
    
}
