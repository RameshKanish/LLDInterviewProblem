package InventoryManagement.models;

public class ElectronicsProduct extends Product{
    public ElectronicsProduct(String sku, String name, double price, int quantity, Productcategory productcategory) {
        super();

        setSku(sku);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setProductcategory(productcategory);
    }
}