package ex00;

public class ex00 {

    public static int sumOfDigits(int n) {
        int ret;
        ret = 0;

        ret += n % 10;
            n = n / 10;
        ret += n % 10;
            n = n / 10;
        ret += n % 10;
            n = n / 10;
        ret += n % 10;
            n = n / 10;
        ret += n % 10;
            n = n / 10;
        ret += n % 10;
            n = n / 10;

        return ret;
    }
    public static void main(String[] args) {
        int n = 479598;
        System.out.println("SUM: " + sumOfDigits(n));
    }
}
