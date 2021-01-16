
package Model;
import Controllers.*; 
import View.LoginUI;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Member extends UserList implements Serializable{
    
    private static UserList UserList;
    private static LoginUI theLoginUI;
    
    private String username;
    private String password;
    private int studcode;
    private Cart cart;
    private Faves faves;
    private ArrayList <Book> bought = new ArrayList();
    
    
    private static Member memberInstance = null;

    public  Member(String username, String password,int studcode) {super(username, password);
        this.username = username;
        this.password = password;
        this.studcode=studcode;
        this.cart = new Cart();
        this.faves= new Faves();
        bought.clear();
    }

    public int getStudcode() {
        return studcode;
    }

    public void setStudcode(int studcode) {
        this.studcode = studcode;
    } 

    public static Member getMemberInstance() {
        return memberInstance;
    }

    public static void setMemberInstance(Member memberInstance) {
        Member.memberInstance = memberInstance;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public void addBought(){
        for(Book target : cart.getPeriexomeno())
            if(!bought.contains(target))
                bought.add(target);
    }

    public Faves getFaves() {
        return faves;
    }

    public ArrayList<Book> getBought() {
        return bought;
    }

    @Override
    public String toString() {
        return "Member{" + "username=" + username + ", password=" + password 
                + ", studcode=" + studcode + '}';
    }
    
    
    

    
    
 
}
