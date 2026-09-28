package com.mycompany.prog6112_2026_test;

public class PROG6112_2026_Test {

    public static void main(String[] args) {
        
        // =========================================================================
        // ARRAY DECLARATION & POPULATION 
        // =========================================================================
        
        // Create a single-dimensional array of Strings to store our three city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // Create a two-dimensional array of integers to hold the exact sales numbers from the test paper
        // Row 0 = Cape Town, Row 1 = Port Elizabeth, Row 2 = Pretoria
        int[][] salesMatrix = {
            {1000, 2000, 3000}, // Sales for PS5, XBOX, and SWITCH in Cape Town
            {2000, 3000, 4000}, // Sales for PS5, XBOX, and SWITCH in Port Elizabeth
            {1500, 1100, 1200}  // Sales for PS5, XBOX, and SWITCH in Pretoria
        };

        
        // =========================================================================
        // PRINTING ROWS AND COLUMNS IN THE REPORT 
        // =========================================================================
        
        // Print the top design borders and the main header exactly as requested
        System.out.println("-----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------");
        
        // Print the column headers for our console types using tab spacing (\t) to keep things clean
        System.out.println("\t\t\tPS5\t\tXBOX\t\tSWITCH");
        
        // Loop through each city row to display the city name and its matching sales figures
        for (int i = 0; i < cities.length; i++) {
            
            // Print the city name, aligned neatly with tabs
            System.out.print(cities[i] + "\t\t");
            
            // Loop through the columns of the current city row to pull out each console's sales number
            for (int j = 0; j < salesMatrix[i].length; j++) {
                System.out.print(salesMatrix[i][j] + "\t\t");
            }
            
            // Move down to a brand new line after finishing the current city's row of data
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");

        
        // =========================================================================
        // PRINTING DATA AND CALCULATION OF TOTALS (6 Marks)
        // =========================================================================
        
        // Print the section header for the upcoming totals
        System.out.println("\nCONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------");
        
        // Variables to help track which city has the highest overall sales volume
        int maxSales = 0;
        String topCity = "";

        // Loop through each city once again to calculate and show its total combined volume
        for (int i = 0; i < cities.length; i++) {
            
            // Start a running total for the current city at 0
            int currentCityTotal = 0;
            
            // Add up the values of all three consoles for this specific city row
            for (int j = 0; j < salesMatrix[i].length; j++) {
                currentCityTotal += salesMatrix[i][j];
            }
            
            // Output the calculated total alongside the city's name
            System.out.println(cities[i] + "\t\t" + currentCityTotal);

            
            // =========================================================================
            // DETERMINE AND DISPLAY THE CITY WITH MOST SALES (4 Marks)
            // =========================================================================
            
            // Check if the current city's total beats the highest total we have seen so far
            if (currentCityTotal > maxSales) {
                // If it is higher, update our maximum tracker to this new value
                maxSales = currentCityTotal;
                // Save the name of this city as our current frontrunner
                topCity = cities[i];
            }
        }
        System.out.println("-----------------------------------------------------------------");
        
        // Print the final result displaying the top-selling city explicitly
        System.out.println("\nCITY WITH THE MOST SALES: " + topCity);
        System.out.println("-----------------------------------------------------------------");
    }
}
