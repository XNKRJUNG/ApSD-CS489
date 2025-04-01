package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;


public class Product {
    private String productId;
    private String name;
    private String dateSupplied;
    private Integer quantityInStock;
    private Double unitPrice;

    public Product (){};
    public Product (String productId, String name, String dateSupplied, Integer quantityInStock, Double unitPrice){
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }
    public Product (String productId, String name, Double unitPrice){
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return name;
    }
    public void setProductName(String name) {
        this.name = name;
    }
    public String getDateSupplied() {
        return dateSupplied;
    }
    public void setDateSupplied(String dateSupplied) {
        this.dateSupplied = dateSupplied;
    }
    public Integer getQuantityInStock() {
        return quantityInStock;
    }
    public void setQuantityInStock(int inStock) {
        this.quantityInStock = inStock;
    }
    public Double getPrice() {
        return unitPrice;
    }
    public void setPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


}
