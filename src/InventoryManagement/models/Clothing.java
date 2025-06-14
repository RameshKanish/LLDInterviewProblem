package InventoryManagement.models;

public class Clothing extends Product{
    public Clothing(String sku, String name, double price, int quantity, Productcategory productcategory){
        super();
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setProductcategory(productcategory);
    }
}