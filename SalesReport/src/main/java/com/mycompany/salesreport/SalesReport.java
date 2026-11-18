/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class SalesReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] productName = {
            "Cosy Nights mattress",
            "Restonic Barbados matress",
            "Sealy Phuket mattress",  };
        
    int[][] salesItems = new int [3][3];  
    
    for (int k = 0; k < productNames.length; k++){
        for(int i = 0; i < 3; i++){
            System.out.print("Enter number of sales for month" + (j+1) + productNames[i] + ": " );
            SalesItems[k][i] = scanner.nextInt();
        }
    }
    Product product = new Product(productNames, salesItems);
    Printproduct printer = new PrintProduct(product);
    printer.printReport();
    }
}
