package com.example.shopappdemo.customObjects;

public class Item {

    String category;
    String name;
    String sellerEmail;
    int price;
    int quantity;

    //no arg constructor for firebase
    public Item(){}

    public Item(String category, String name, int price, int quantity, String sellerEmail) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sellerEmail = sellerEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }
}
