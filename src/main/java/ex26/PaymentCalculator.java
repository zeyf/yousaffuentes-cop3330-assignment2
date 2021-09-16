package ex26;
import java.lang.Math;

public class PaymentCalculator {

    public int calculateMonthsUntilPaidOff(double i, double b, int p) {
        return (int) Math.floor(-(1/30) * Math.log(1 + b/p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i)) + 1;
    };

}
