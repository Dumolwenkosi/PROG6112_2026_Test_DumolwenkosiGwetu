package com.mycompany.prog6112_2026_test;

public class PROG6112_2026_Test {

    public static void main(String[] args) {
        
        // 1D array for the cities mentioned in the test paper
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // 2D array to hold all the console numbers from the table
        // Rows match the cities array order (Cape Town, PE, Pretoria)
        int[][] salesMatrix = {
            {1000, 2000, 3000}, // cape town data
            {2000, 3000, 4000}, // port elizabeth data
            {1500, 1100, 1200}  // pretoria data
        };

        // Printing the top of the report header
        System.out.println("-----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------");
        
        // print columns headers using tabs for alignment
        System.out.println("\t\t\tPS5\t\tXBOX\t\tSWITCH");
        
        // outer loop to go through each city row
        for (int i = 0; i < cities.length; i++) {
            
            // prints the city name first before the numbers
            System.out.print(cities[i] + "\t\t");
            
            // inner loop to print out the console sales for that city
            for (int j = 0; j < salesMatrix[i].length; j++) {
                System.out.print(salesMatrix[i][j] + "\t\t");
            }
            
            // break to next line after completing the row
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");

        // Heading for the second part of the report
        System.out.println("\nCONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------");
        
        // variables to keep track of the highest sales and the city name
        int maxSales = 0;
        String topCity = "";

        // looping again to calculate totals per city
        for (int i = 0; i < cities.length; i++) {
            
            // resetting the sum for each city back to 0
            int currentCityTotal = 0;
            
            // inner loop adding up all console figures in this row
            for (int j = 0; j < salesMatrix[i].length; j++) {
                currentCityTotal += salesMatrix[i][j];
            }
            
            // printing out the calculated total for this city
            System.out.println(cities[i] + "\t\t" + currentCityTotal);

            // checking if this city's total is the new highest
            if (currentCityTotal > maxSales) {
                maxSales = currentCityTotal; // save the highest number
                topCity = cities[i]; // save the city name
            }
        }
        System.out.println("-----------------------------------------------------------------");
        
        // printing the final answer showing the winning city
        System.out.println("\nCITY WITH THE MOST SALES: " + topCity);
        System.out.println("-----------------------------------------------------------------");
    }
}
