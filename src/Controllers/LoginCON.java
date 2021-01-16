package Controllers;

import View.*;
import Model.*;
import java.util.*;
import View.LoginUI;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.util.Collections.list;
import javax.swing.JTextArea;


public class LoginCON {
   
    private static UserList theUserList;
    private static LoginUI theLoginUI;
    Member mm;
    
    private static String pin;

    //δηλωση λιστας χρηστων
    private static ArrayList<UserList> validUsers;
    private static Object TextUtils;
    
    String s="";
    Scanner scanner = new Scanner(s); 
   

    public void LoginCΟΝ(){
        
        theLoginUI = new LoginUI();
        theUserList = new UserList();
        
    }

    public static ArrayList<UserList> getValidUsers() {
        return validUsers;
    }

    public static void setValidUsers(ArrayList<UserList> validUsers) {
        LoginCON.validUsers = validUsers;
    }

    //checks if users exists
    public static Integer authenticate(String username, String password){
         
        int x = 0;

        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers(); 
        
        for (int i = 0; i < validUsers.size(); i++) {
            if (validUsers.get(i).getUsername().equals(username) && validUsers.get(i).getPassword().equals(password)) {
                if(validUsers.get(i) instanceof Member){
                  Member mem1=(Member)validUsers.get(i);
                  Member.setMemberInstance(mem1);
                  x=1;
                }else if(validUsers.get(i) instanceof Administrator){
                  Administrator adm1=(Administrator)validUsers.get(i);
                  Administrator.setAdminInstance(adm1);
                  x=2;
                }
            }
        }
        return x;
       
     }
    
 
    //εμφανιση ολων των χρηστων
    public static void emfanisixriston(JTextArea text){
        String resultxriston;
        
        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers(); 
        
        for(int i=0;i<validUsers.size();i++){
            if(validUsers.get(i) instanceof Member){
              text.append(i+")Password:"+" "+validUsers.get(i).getPassword()+" "+"Username:"+" " +validUsers.get(i).getUsername()+"\n");
              
              System.out.println(i+")Password:"+" "+validUsers.get(i).getPassword()+" "+"Username:"+" " +validUsers.get(i).getUsername() );
                
                
            }
         
        }
        
     
    }
    
    //βρισκει τα στοιχεια χρηστη
    public static Integer searchUser(String userfield){
        int x=10000000;
         
        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers(); 
         
         for(int i=0; i<validUsers.size();i++){
           if(validUsers.get(i) instanceof Member){
             if (validUsers.get(i).getUsername().equals(userfield)){
                 x=i;
                 break;
             }else{
                 x=10000000;
             }
             
            }
          }
         return x;
    }
    
    //ελεγχος για σωστο κωδικο
    public static String findpass(String userfield){
       String pass="fail";
       validUsers = new ArrayList();    
       theUserList= new UserList(); // like this
       validUsers = theUserList.getValidUsers(); 
       for(int i=0; i<validUsers.size();i++){
         if(validUsers.get(i) instanceof Member){
             if (validUsers.get(i).getUsername().equals(userfield)){
                 pass=validUsers.get(i).getPassword();
                 break;
             }else{
                 pass="fail";
             }
             
         }
       }
       return pass;
    }
    
    //διαγραφη χρηστη
    public static int deleteUser(String user2){
        
        System.out.println("ArrayList Before : ");
        for(int i=0;i<validUsers.size();i++){
          if(validUsers.get(i) instanceof Member){
            System.out.println(validUsers.get(i).getPassword()+" "+validUsers.get(i).getUsername() );
          }
        } 
        int x=10000000;
        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers(); 
        for(int i=0; i<validUsers.size();i++){
            if(validUsers.get(i) instanceof Member){
                if(validUsers.get(i).getUsername().equals(user2)){
                   validUsers.remove(i);
                   x=i;
                   break;
                }else{
                    x=10000000;
                }
            }
            
        }
        System.out.println("ArrayList After : ");
        for(int i=0;i<validUsers.size();i++){
          if(validUsers.get(i) instanceof Member){
           System.out.println(validUsers.get(i).getPassword()+" "+validUsers.get(i).getUsername() );
          }
        } 
        return x;
    }
    
    //εισαγωγη χρηστη
    public static void addMember(String userfield,String passwd){
        
        System.out.println("ArrayList Before Insert: ");
        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers(); 
        for(int i=0;i<validUsers.size();i++){
          if(validUsers.get(i) instanceof Member){
            System.out.println(validUsers.get(i).getPassword()+" "+validUsers.get(i).getUsername() );
          }
        } 
        Member m10=new Member(userfield,passwd,1);
        validUsers.add(m10);
        
        System.out.println("ArrayList After Insert : ");
        for(int i=0;i<validUsers.size();i++){
          if(validUsers.get(i) instanceof Member){
            System.out.println(validUsers.get(i).getPassword()+" "+validUsers.get(i).getUsername() );
          }
        } 
        
    }
    
    public Member MemberbyUsr(String usr){
        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers();
        for(UserList target : validUsers)
            if(target instanceof Member)
                if(target.getUsername().equals(usr)){
                    return (Member)target;
                }
        return null;
    }
    
}

   
     

    
    
    
   

