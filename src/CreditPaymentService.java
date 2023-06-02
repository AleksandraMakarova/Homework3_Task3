public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRatePerYear, int loanTermMonths) {
        int monthlyPayment;
        double interestRatePerMonth = interestRatePerYear / 12 / 100;
        monthlyPayment = (int) (loanAmount * (interestRatePerMonth + (interestRatePerMonth / (Math.pow(1 + interestRatePerMonth, loanTermMonths) - 1))));
        return monthlyPayment;
    }

}
