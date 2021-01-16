
package Model;

import java.io.Serializable;


public class Book   {

    private String titlos;
    private double timi;
    private int b_id;
    
    public Book(String titlos, double timi,int b_id) {
        
        this.titlos = titlos;
        this.timi = timi;
        this.b_id = b_id;
        
        
    }
    
    public String getTitlos() {
        return titlos;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    public double getTimi() {
        return timi;
    }   

    public void setTimi(int timi) {
        this.timi = timi;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    
    
   
}
