public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount;
        double percent;
        int loanTerm;
        double monthlyPayment = service.calculate(9.99, 1000000, 1);
        System.out.println("Сумма ежемесячного платежа: " + (int)monthlyPayment + " руб");
        System.out.println();
        double monthlyPayment1 = service.calculate(9.99, 1000000, 2);
        System.out.println("Сумма ежемесячного платежа: " + (int)monthlyPayment1 + " руб");
        System.out.println();
        double monthlyPayment2 = service.calculate(9.99, 1000000, 3);
        System.out.println("Сумма ежемесячного платежа: " + (int)monthlyPayment2 + " руб");
    }


}