package financialforecast;
public class ForecastCalculator {
public double forecast(double currentValue, double growthRate, int years) {
    if (years == 0) {
        return currentValue;
    }
    return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
}

public double forecastIterative(double currentValue, double growthRate, int years) {
    for (int i = 0; i < years; i++) {
        currentValue *= (1 + growthRate);
    }
    return currentValue;
}
}