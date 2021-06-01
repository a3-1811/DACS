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
public class Product {
   private int id;
   private String name;
   private String image;
   private String descriptions;
   private int categoryId;
   private int price;

    public Product() {
    }

    public Product(int id, String name, String image, String descriptions, int categoryId, int price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.descriptions = descriptions;
        this.categoryId = categoryId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", image=" + image + ", descriptions=" + descriptions + ", categoryId=" + categoryId + ", price=" + price + '}';
    }
   
}
