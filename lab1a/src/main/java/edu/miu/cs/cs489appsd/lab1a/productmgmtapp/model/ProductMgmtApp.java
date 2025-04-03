package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.util.FormatDataUtil;
import java.util.Arrays;
import java.util.Comparator;

public class ProductMgmtApp {
    public static void printProducts(Product[] products) {
        Product[] sortedProducts = Arrays.copyOf(products, products.length);

        // Sort the copied array in descending order by unitPrice
        Arrays.sort(sortedProducts, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });

        // Print the sorted products in each format
        FormatDataUtil.convertToJson(sortedProducts);
        System.out.println("-------");
        FormatDataUtil.convertToXML(sortedProducts);
        System.out.println("-------");
        FormatDataUtil.convertToCSV(sortedProducts);
        System.out.println("-------");
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("3128874119", "Banana", "2023,1,24", 124, 0.55);
        products[1] = new Product("2927458265", "Apple", "2022,12,9", 18, 1.09);
        products[2] = new Product("9189927460", "Carrot", "2023,3,31", 89, 2.99);

        printProducts(products);
    }
}