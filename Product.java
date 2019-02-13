package com.example.databaseproduct2;

public class Product {

    private int _id;
    private String _productname;
    private double _price;

    public Product() {

    }

    public Product(int id, String productname, double price) {
        this._id = id;
        this._productname = productname;
        this._price = price;
    }

    public Product(String productname, double price) {
        this._productname = productname;
        this._price = price;

    }
    public void setID(int id) {
        this._id = id;
    }
    public int getID() {
        return this._id;
    }
    public void setProductName(String productname){
        this._productname = productname;
    }
    public String getPoductName(){
        return this._productname;
    }
    public void setPrice(double price) {
        this._price = price;
    }
    public double getPrice() {
        return this._price;
    }
}

