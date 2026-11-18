/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    private IProduct product;
    
    public PrintProduct(IProduct product){
        
        this.product = product;
    }
    
    public void printReport(){
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("***********************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
        System.out.println("************************************");        
    }
}
