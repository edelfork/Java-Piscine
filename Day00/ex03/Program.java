import java.util.Scanner;

public class Program {

    public static void errorHandler() {
        System.err.println("IllegalArgument");
        System.exit(-1);
    }
    public static int minValue() {
        int i = 0;
        int ret = 10;
        int control = 0;
        int numb;
        Scanner scan = new Scanner(System.in);
        while (i++ < 5) {
            numb = scan.nextInt();
            if (!(numb >= 1 && numb <= 9)) {
                errorHandler();
            }
            if (numb < ret)
                ret = numb;
            control = control * 10 + numb;
        }
        return ret;
    }

    public static void printing(long build) {

        long	reverse;
        long	numb;
        long	temp;
        int		i;
        int     nWeek = 1;

        reverse = 0;
        temp = build;
        while (temp != 0) {
            numb = temp % 10;
            reverse = reverse * 10 + numb;
            temp /= 10;
        }
        do {
            numb = reverse % 10;
            i = 0;
            System.out.print("Week ");
            System.out.print(nWeek);
            System.out.print(" ");
            while (i++ < numb)
                System.out.print("=");
            System.out.println(">");
            reverse = reverse / 10;
        } while (reverse > 0 && ++nWeek > 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        long buff = 0;
        int min;

        String week = scanner.next();
        if (week.equals("42"))
            return ;

        int i = 1;
        while (i <= 18) {
            if (!week.equals("Week " + i)) {
                errorHandler();
            }
            else {
                min = minValue();
                buff = buff * 10 + min;
            }
            week = scanner.next();
            if (week.equals("42")) {
                printing(buff);
                System.exit(0);
            }
            i++;
        }
        printing(buff);
    }
}