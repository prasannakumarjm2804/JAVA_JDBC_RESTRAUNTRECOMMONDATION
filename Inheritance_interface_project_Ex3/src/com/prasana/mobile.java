package com.prasana;
public class mobile {
    private String brand;
    private String model;
    private String price;
    private int quantity;
    private int id;
    public mobile() {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + ", quantity=" + quantity + ", ID=" + id + "]";
    }
}
