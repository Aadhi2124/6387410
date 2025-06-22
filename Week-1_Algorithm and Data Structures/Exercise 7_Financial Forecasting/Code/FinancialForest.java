package algorithm_data_structures.financial_forcasting;

public class FinancialForest {
	
	public static double predictFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue; 
        return predictFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double currentRevenue = 100000;
        double annualGrowthRate = 0.10;
        int years = 5;

        double futureValue = predictFutureValue(currentRevenue, annualGrowthRate, years);
        System.out.printf("Predicted revenue after %d years: $%.2f\n", years, futureValue);
    }
}
