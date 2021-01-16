/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;


public class Signup {
    
    private String username;
    private String password;
    private int m_id;
    private String user;
    private String name;
    private String lastName;
    private String cellphone;
    private String email;
    private String birthYear;
    private String address;
    
    private ArrayList<String> validUsers=new ArrayList<String>();
    private ArrayList<String> validPasswords=new ArrayList<String>();

    public Signup(String username, String password, int m_id, String user, String name, String lastName, String cellphone, String email, String birthYear, String address) {
        this.username = username;
        this.password = password;
        this.m_id = m_id;
        this.user = user;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.birthYear = birthYear;
        this.address = address;
        
        validUsers.add(username);
        validPasswords.add(password);
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

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getValidUsers() {
        return validUsers;
    }

    public void setValidUsers(ArrayList<String> validUsers) {
        this.validUsers = validUsers;
    }

    public ArrayList<String> getValidPasswords() {
        return validPasswords;
    }

    public void setValidPasswords(ArrayList<String> validPasswords) {
        this.validPasswords = validPasswords;
    }
    
    
    
}
