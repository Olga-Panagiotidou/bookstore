
package Ex;


public class DuplicateException extends Exception{
    String str = "This item already exists in ";
    String str1;
    public DuplicateException(String str21){
        this.str1=str1;
    }
   public String toString(){ 
	return (str+str1) ;
   }
}
