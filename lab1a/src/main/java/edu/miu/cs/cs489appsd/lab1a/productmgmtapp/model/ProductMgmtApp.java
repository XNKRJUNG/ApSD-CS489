package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.util.FormatDataUtil;


public class ProductMgmtApp {
    public static void printProducts(Product[] products){
        FormatDataUtil.convertToJson(products);
        System.out.println("-------");
        FormatDataUtil.convertToXML(products);
        System.out.println("-------");
        FormatDataUtil.convertToCSV(products);
        System.out.println("-------");
    }
    public static void main(String[] args) {
        Product[] products= new Product[3];
        Product product1 = new Product("3128874119", "Banana", "2023,1,24", 124, 0.55);
        Product product2 = new Product("2927458265", "Apple", "2022,12,9", 18, 1.09);
        Product product3 = new Product("9189927460", "Carrot", "2023,3,31", 89, 2.99);
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        printProducts(products);
    }
}
