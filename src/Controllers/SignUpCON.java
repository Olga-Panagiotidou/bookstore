/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Member;
import View.SignupUI;
import Model.Signup;
import Model.UserList;
import View.LoginUI;
import java.util.ArrayList;


public class SignUpCON {
    

    private static UserList theUserList;
    private static LoginUI theLoginUI;

    private static ArrayList<UserList> validUsers;
    
    
    
    public SignUpCON(){
        
      
       
    }
    
    
    //εισαγωγή νέου μέλους
    public static void addnew(String username,String password){
        
        validUsers = new ArrayList();    
        theUserList= new UserList(); // like this
        validUsers = theUserList.getValidUsers(); 
        
        System.out.println("ArrayList Before : ");
        for(int i=0;i<validUsers.size();i++){
          if(validUsers.get(i) instanceof Member){
            System.out.println(validUsers.get(i).getPassword()+" "+validUsers.get(i).getUsername() );
          }
        } 
        
        Member mem=new Member(username,password,1);
        validUsers.add(mem);
        
        System.out.println("ArrayList After : ");
        for(int i=0;i<validUsers.size();i++){
          if(validUsers.get(i) instanceof Member){
           System.out.println(validUsers.get(i).getPassword()+" "+validUsers.get(i).getUsername() );
          }
        } 
        
        
    }
    
    public static ArrayList<UserList> getValidUsers() {
        return validUsers;
    }

    public static void setValidUsers(ArrayList<UserList> validUsers) {
        SignUpCON.validUsers = validUsers;
    }

   
}
