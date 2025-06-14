package InventoryManagement.models;

import java.util.HashMap;
import java.util.Map;

public class WareHouse {

    private int id;
    private String name;
    private Map<String , Product> productMap;

    public WareHouse(int id , String name){
        this.id = id;
        this.name = name;
        this.productMap =new HashMap<>();
    }

    public void addProduct(Product product , int quantity){
        if(product == null) return;

        if(productMap.containsKey(product.getSku())){
            Product existing = productMap.get(product.getSku());

            int existingQuantity = product.getQuantity();
            product.setQuantity(existingQuantity + quantity);
        }else{
            product.setQuantity(quantity);

            productMap.put(product.getSku() , product);
        }
    }

    public void removeProduct(String sku , int quantity){
        Product product = productMap.get(sku);
        if(product == null) return ;
        int currentQuantity = productMap.get(sku).getQuantity();

        if(currentQuantity <= quantity){
            productMap.remove(sku);
        }else{
            product.setQuantity(currentQuantity - quantity);
        }
    }

    public int getAvailableQuantity(String sku){
        Product product = productMap.get(sku);

        return (productMap.get(sku) != null) ? product.getQuantity() : 0;
    }

    public void getAllProduct(){
        for(Map.Entry<String , Product> products : productMap.entrySet()){

            String productName = products.getValue().getName();
            int quantity = products.getValue().getQuantity();
            System.out.println("Product Name " + productName +" Quantity" + quantity);
        }
    }
}