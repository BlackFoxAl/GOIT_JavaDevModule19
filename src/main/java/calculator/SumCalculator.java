package calculator;

public class SumCalculator {
    public int sum(int n) {
        int sumElem = 0;
        if (n < 1) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }
        for (int elem = 1; elem <= n; elem++)
        {
            sumElem += elem;
        }
        return sumElem;
    }
}
