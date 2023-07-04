public class Main {
    public static void main(String[] args) {
CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        double rate = 9.99;
        int monht = 12;
        int payment = service.calculate(amount, rate, monht);
        System.out.println("Ежемесячный платеж ");
        System.out.println(service.calculate (amount = 1000000, rate = 9.99, monht = 12));

        System.out.println("Ежемесячный платеж ");
        System.out.println(service.calculate (amount = 1000000, rate = 9.99, monht = 24));

        System.out.println("Ежемесячный платеж ");
        System.out.println(service.calculate(amount = 1000000, rate = 9.99, monht = 36));



    }
}
