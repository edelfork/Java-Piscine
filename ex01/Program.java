import java.util.Scanner;

public class Program {

    public static int turn;

    public static boolean isPrime(int n){
        turn++;
         if (n <= 2)
            return true;
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= n; i++){
            turn++;
            if (n % i == 0)
                return false;
            if (i * i > n)
                break;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        if (n <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        } else
            System.out.println(isPrime(n) + " " + turn);
    }
}