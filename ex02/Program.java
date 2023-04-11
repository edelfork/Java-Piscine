import java.util.Scanner;

public class Program {

    public static int prime;

    public static boolean isPrime(int n){
        if (n <= 2)
            return true;
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= n; i++){
            if (n % i == 0)
                return false;
            if (i * i > n)
                break;
        }
        return true;
    }

    public static int sumOfDigits(int n) {
        int ret;
        ret = 0;

        if (n < 0) {
            ret -= n % 10;
            n /= 10;
            n *= -1;
        }

        while (n > 10) {
            ret += n % 10;
            n = n / 10;
        }
        ret += n;
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 42) {
            if (isPrime(sumOfDigits((n))))
                prime++;
            n = scan.nextInt();
        }
        System.out.println("Count of coffee-request - " + prime);
    }
}