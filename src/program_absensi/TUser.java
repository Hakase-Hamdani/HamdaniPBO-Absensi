/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;

/**
 *
 * @author Administrator 10
 */
public class TUser {
    private int idAdmin;
    private String username;
    private String password;

    String inputUsername = "admin";
    String inputPassword = "admin";
    
    
    public TUser(int idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }
    
    public int getIdAdmin() {
        return idAdmin;
    }
    
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
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
    
    public boolean login() {
    if (!this.password.equals(inputPassword) && !this.username.equals(inputUsername)) {
        System.out.println("Login Gagal!");
        return false;
    } else {
        System.out.println("Login Sukses!");
        return true;
    }
}

}

