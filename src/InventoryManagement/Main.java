package InventoryManagement;

import InventoryManagement.models.ElectronicsProduct;
import InventoryManagement.models.Product;
import InventoryManagement.models.Productcategory;
import InventoryManagement.models.WareHouse;

public class Main {
    public static void main(String[] args) {

        WareHouse wareHouse1 = new WareHouse(1 , "chennai");
        WareHouse wareHouse2 = new WareHouse(2, "coimbatore");

        Product product = new ElectronicsProduct(
                "123",
                "Tv",
                100.00,
                10,
                Productcategory.ELECTRONICS
        );
        wareHouse1.addProduct(product , product.getQuantity());
        wareHouse1.getAllProduct();
    }
}