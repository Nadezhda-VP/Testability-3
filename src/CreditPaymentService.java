public class CreditPaymentService {
    public double calculate(double percent, int loanAmount, int loanTerm) {
        double month;
        month = loanTerm * 12;
        double ppm;
        ppm = percent / 12 / 100;
        double ppmsum;
        ppmsum = Math.pow(1 + ppm, month) - 1;
        double monthlyPayment;
        monthlyPayment = loanAmount * ppm * Math.pow(1 + ppm, month) / ppmsum;
        return monthlyPayment;
    }
}
