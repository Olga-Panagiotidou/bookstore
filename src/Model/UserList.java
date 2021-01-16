
package Model;

import java.util.ArrayList;


public class UserList {
    
    private String username;
    private String password;
    
    public static ArrayList <UserList> validUsers;
    
    //αρχικοποιηση χρηστων στη λιστα
    public UserList(){
        
      Member mem1=new Member("Olga","123",1);
      Member mem2=new Member("Orfeas","456",1);
      Member mem3=new Member("Maria","789",1);
      Member mem4=new Member("Nikos","1011",1);
      Member mem5=new Member("Kostas","1112",1);
      Member memdoki=new Member("Dokimi","111",1);
      
      Administrator adm1=new Administrator("admin","12345",2);
      
      validUsers = new ArrayList();
    
      validUsers.add(mem1);
      validUsers.add(mem2);
      validUsers.add(mem3);
      validUsers.add(mem4);
      validUsers.add(mem5);
      validUsers.add(memdoki);
      
      validUsers.add(adm1);

    }


    public UserList(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    //Προσθετει νεο χρηστη στη λιστα
    public static void addNew(String username, String password){
        Member newMem =new Member(username,password,1);
        validUsers.add(newMem);
    
    }
    
    //Αναζητει χρηστη βαση ονοματος
    public static Member searchByName(String name){
        for(UserList target : validUsers)
            if(target.getUsername().equals(name))
                return (Member)target;
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static ArrayList<UserList> getValidUsers() {
        return validUsers;
    }

    public static void setValidUsers(ArrayList<UserList> validUsers) {
        UserList.validUsers = validUsers;
    }
    
    
}
