
package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Administrator extends UserList implements Serializable {
    
  private int adminCode;
  
  private ArrayList<String> validUsers=new ArrayList<String>();
  private ArrayList<String> validPasswords=new ArrayList<String>();

  private static Administrator adminInstance = null;

 
  public Administrator(String username, String password,int adminCode){
    super(username, password);
    this.adminCode = adminCode;
  }
  
  public int getAdminCode() {
    return adminCode;
  }

  public void setAdminCode(int adminCode) {
    this.adminCode = adminCode;
  }

  public static Administrator getAdminInstance() {
    return adminInstance;
  }

  public static void setAdminInstance(Administrator adminInstance) {
    Administrator.adminInstance = adminInstance;
  }
    
}
