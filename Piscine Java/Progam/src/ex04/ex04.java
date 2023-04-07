package ex04;


import java.util.Scanner;

public class ex04 {

    public static boolean isStored(char[] store, char c) {
        for (int i = 0; i < store.length; i++)
            if (store[i] == c)
                return true;
        return false;
    }

    public static char[] storing(char[] store, char[] arr, int length) {
        int i = 0;
        int j = 0;
        store[i] = arr[i];
        while (i < length) {
            while (j < length) {
                if (store[i] == 0 && !isStored(store, arr[j]))
                    store[i] = arr[j];
                j++;
            }
            j = 0;
            i++;
        }
        return store;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        int i = 0;
        int k = 0;
        int[] j = new int[length + 1];
        char[] arr = s.toCharArray();
        char[] store = new char[length];
        store = storing(store, arr, s.length());
        i = 0;
        while (i < s.length()) {
            while (k < s.length()) {
                if (store[i] == arr[k]) {
                    j[i]++;
                }
                k++;
            }
            k = 0;
            i++;
        }
        i = 0;
        while (i < s.length())
        {
            System.out.println(j[i]);
            i++;
        }
        System.out.println(store);
    }
}
