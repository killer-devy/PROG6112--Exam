/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    
    private String [] productNames;
    private int[][] salesItems;
    
    // Setting constructors
    public Product (String [] productNames, int [][] salesItems){
       
        this.productNames = productNames;
        this.salesItems = salesItems;
        
    }
   // calculating the total products sold 
   @Override
   public int GetTotalProductsSold(){
       int total = 0;
       for(int i = 0; i < salesItems.length;  i++ ){
       for(int k = 0 ; k < salesItems[i].length; k++){
           total = salesItems[i][k];
       }
   }
    return total;
    
    //calculating the average products sold
    @Override
   
    public double GetAverageProductSold(){
       
       int totalProducts = productNames.length;
       int totalSales = GetTotalProductsSold();
       
       return (double) totalSales / totalProducts; 
   }
   
    //Determining the most popular product
    @Override
    public String GetMostPopularProduct(){
       int maxSales = -1;
       int bestProduction = 0;
       
       for(int m = 0; m < productNames.length; m++){
           int productTotal = 0;
           for (int j = 0; j < salesItems[m].length; j ++);
           productTotal = salesItems[m][j];
       }
       if(productTotal > maxSales) {
           maxSales = productTotal;
           bestProduct = i ;
       }
    }
    
    return productNames [bestProduction] + " (" + maxSales + " ")"
       
   }
}
