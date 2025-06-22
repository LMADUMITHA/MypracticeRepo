public class FinancialForecast {
    public static double forecast(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        
        return forecast(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initial = 1000.0;
        double rate = 0.05; // 5% growth per period
        int years = 5;

        double futureValue = forecast(initial, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}