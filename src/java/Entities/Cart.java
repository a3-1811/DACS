/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Der Mods
 */
public class Cart {
    private String email;
    private int id;
    private int amount;

    public Cart() {
    }

    public Cart(String email, int id, int amount) {
        this.email = email;
        this.id = id;
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cart{" + "email=" + email + ", id=" + id + ", amount=" + amount + '}';
    }
    
    
}
