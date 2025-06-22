package ecommerceplatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();

        Product result1 = LinearSearch.search(products, searchName);
        System.out.println("\nLinear Search Result: " + (result1 != null ? result1 : "Product not found"));

        
        Product result2 = BinarySearch.search(products, searchName);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));

        sc.close();
    }
}
