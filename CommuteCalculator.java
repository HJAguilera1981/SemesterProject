
/**
 * SemesterProject_Herman_Aguilera
 *
 * For my semester project I will determine how many miles I travel to and from work
 * daily, weekly, monthly, and yearly. One way is 23 miles
 * I will also determine the amount of gas used by establishing a miles-per-gallon
 * rate of 16 MPG.
 * Finally, I will calculate the cost of gas using an average price of $2.50 per gallon.
 *
 * Herman Aguilera
 * December 6, 2025
 */

public class CommuteCalculator 
{

    public static void main(String[] args) 
    {
        double oneWay = 23;
        double mpg = 16;
        double gasPrice = 2.50;

        calculate("Daily", 1, oneWay, mpg, gasPrice);
        calculate("Weekly", 5, oneWay, mpg, gasPrice);
        calculate("Monthly", 22, oneWay, mpg, gasPrice);
        calculate("Yearly", 260, oneWay, mpg, gasPrice);
    }

    public static void calculate(String label, int days, double oneWay, double mpg, double gasPrice) 
    {
        double miles = oneWay * 2 * days;
        double gallons = miles / mpg;
        double cost = gallons * gasPrice;

        System.out.printf("%s: %.0f miles, %.2f gallons, $%.2f%n",
                label, miles, gallons, cost);
    }
}


