/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author hakase
 */
public class dataTUser {
    private ArrayList<Integer> idAdmin;
    public ArrayList<String> username;
    public ArrayList<String> password;
    
    public dataTUser(){
        idAdmin = new ArrayList<>();
        username = new ArrayList<>();
        password = new ArrayList<>();
    }
     
    //idAdmin
    public void insertIdAdmin(Integer isi){
        this.idAdmin.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdAdmin(){
        return this.idAdmin;
    }
    
    //username
    public void insertUsername(String isi){
        this.username.add(isi);
    }
    
    public ArrayList<String> getRecordUsername(){
        System.out.println("inserted Tusr: "+ username);
        return this.username;
    }
    
    //password
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    
    public ArrayList<String> getRecordPassword(){
        System.out.println("inserted Tpsws: "+ password);
        return this.password;
    }
}