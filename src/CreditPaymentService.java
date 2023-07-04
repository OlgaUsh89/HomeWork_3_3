public class CreditPaymentService {

    public int calculate(int amount, double rate, int month) {
        int payment;
        if (amount > 0) {
            payment = (int) (amount * (rate / 12 / 100) * Math.pow(1 + (rate / 12 / 100),month) / (Math.pow(1 + (rate / 12 / 100),month) - 1));
        } else {
            payment = 0;
        }
        return payment;
    }
}
