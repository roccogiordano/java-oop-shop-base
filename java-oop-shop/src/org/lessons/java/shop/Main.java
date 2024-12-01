package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        
        // Product Instances

        Product firstProduct = new Product("Lemons", "Sorrento Lemons!", 5, 8);

        Product secondProduct = new Product("Ice Cream", "Chocolate Flavoured Ice Cream!", 8, 22);

        //


        // Methods Call

        System.out.printf(firstProduct.getBasePrice());

        System.out.println(firstProduct.getTotalPrice());

        System.out.println(firstProduct.getFullName());

        System.out.println(secondProduct.getBasePrice());

        System.out.println(secondProduct.getTotalPrice());

        System.out.println(secondProduct.getFullName());

        //

    }
}
