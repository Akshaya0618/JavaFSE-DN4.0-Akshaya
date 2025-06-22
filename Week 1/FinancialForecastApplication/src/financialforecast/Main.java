package financialforecast;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ForecastCalculator calculator = new ForecastCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the currrentValue: ");
        double currentValue = sc.nextDouble();    
        double growthRate = 0.05;  
        System.out.println();
        System.out.print("Enter the year: ");
        int years = sc.nextInt();
        System.out.println();
        double futureValue = calculator.forecast(currentValue, growthRate, years);

        System.out.printf("Future value after %d years: ₹%.2f%n", years, futureValue);
    }
}
