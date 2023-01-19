public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditPaymentService1 = new CreditPaymentService();
        double result1 = creditPaymentService1.calculate(1_000_000, 9.99, 12);
        System.out.println((int) result1);
        System.out.println("=======");

        CreditPaymentService creditPaymentService2 = new CreditPaymentService();
        double result2 = creditPaymentService2.calculate(1_000_000, 9.99, 24);
        System.out.println((int) result2);
        System.out.println("=======");

        CreditPaymentService creditPaymentService3 = new CreditPaymentService();
        double result3 = creditPaymentService3.calculate(1_000_000, 9.99, 36);
        System.out.println((int) result3);
    }
}