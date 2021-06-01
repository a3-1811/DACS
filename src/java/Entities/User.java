/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Der Mods
 */
public class User {
   private String email;
   private String password;
   private String name;
   private String phone;
   private String address;
   private boolean isAdmin;
   private Date birthday;
   private boolean gender;

    public User() {
    }

    public User(String email, String password, String name, String phone, String address, boolean isAdmin, Date birthday, boolean gender) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.isAdmin = isAdmin;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", password=" + password + ", name=" + name + ", phone=" + phone + ", address=" + address + ", isAdmin=" + isAdmin + ", birthday=" + birthday + ", gender=" + gender + '}';
    }

    
   
}
