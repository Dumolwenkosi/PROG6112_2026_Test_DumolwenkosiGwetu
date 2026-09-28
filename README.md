# PROG6112 - 2026 Test 

## Project Description
This is my Java console application for Question 1 of the assignment. It generates a yearly sales report for a company called "Number 1 Electronics". 

The program takes sales numbers for three different gaming consoles (PS5, Xbox, and Nintendo Switch) across three specific cities: Cape Town, Port Elizabeth, and Pretoria.

## How it Works
1. **Data Arrays:** I stored the city names in a normal 1D String array. The actual sales figures from the test paper are saved inside a 2D integer array (matrix) where rows represent the cities and columns represent the consoles.
2. **Report Grid:** The application loops through these arrays to print out a clean, formatted table matching the sample screenshot.
3. **Calculations:** It loops a second time to add up all the console sales per city to show individual totals.
4. **Top City:** While calculating the totals, an if-statement checks which city has the highest overall sales value and prints it at the very bottom.

## Requirements Met
* Used both single and two-dimensional arrays.
* Calculated total sales for every city.
* Correctly found and displayed the city with the most sales (Port Elizabeth).

## How to Run It
You can open this project directly inside NetBeans. Since it uses Maven, just right-click the project folder and select **Run** or click the green play button at the top to see the output in the console window.

<img width="1920" height="1020" alt="PROG6112_2026_Test - Apache NetBeans IDE 29 28_09_2026 12_36_11" src="https://github.com/user-attachments/assets/a2f47681-6d7a-480f-b90a-3fd3fddd7364" />
