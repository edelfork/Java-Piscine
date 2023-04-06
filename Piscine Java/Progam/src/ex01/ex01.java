package ex01;

import java.util.Scanner;

public class ex01 {

    public static int turn;

    public static boolean isPrime(int n){
        turn++;
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

        try {
            int n = scan.nextInt();
            if (n <= 1) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            } else
                System.out.println(isPrime(n) + " " + turn);
        } catch (Exception e) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
    }

}
