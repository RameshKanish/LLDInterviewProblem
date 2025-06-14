package InventoryManagement.models;

public abstract class Product {
    private String sku;
    private String name;
    private double price;
    private int quantity;
    private Productcategory productcategory;


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Productcategory getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(Productcategory productcategory) {
        this.productcategory = productcategory;
    }
}