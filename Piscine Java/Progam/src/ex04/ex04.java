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
    
    public static int[] counting(int[] j, char[] store, char[] arr, int length) {
    	for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                if (store[i] == arr[k]) {
                    j[i]++;
                }
            }
        }
    	return j;
    }
    
    public static float findMax(int[] count) {
    	int ret = 0;
    	for (int i = 0; i < count.length; i++) {
    		if (count[i] > ret)
    			ret = count[i];
    	}
    	return ret;
    }
    
    public static void findValue(int cont) {
    	int ret = -1;
    	while (cont > 0) {
    		cont /= 10;
    		ret++;
    	}
    	for (int l = 0; l < ret; l++) {
			System.out.print(" ");
		}
    }
    
    public static void printSpace(int[] count, int n) {
    	if (findMax(count) > 100)
    		System.out.print("  ");
    	else if (findMax(count) < 100 && findMax(count) > 10)
    		System.out.print(" ");
    }
    
    public static void postTag(int []count, int[] numb, int k) {
    	if (findMax(count) >= 10 && numb[k] < 10)
			System.out.print(" ");
		else if (findMax(count) >= 100 && numb[k] < 100)
			System.out.print(" ");
		if (findMax(count) >= 100 && numb[k] < 10)
			System.out.print(" ");
    }
    
    public static void printer(char[] store, int[] count, float ratio) {
    	float max = findMax(count);
    	int[] many = new int[12];
    	int[] numb = new int[12];
    	char[] ordered = new char[11];
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	while (i < 10 && max > 0) {
    		while (j < count.length) {
	    		if (count[j] == max) {
	    			many[i]++;
	    			numb[i] = count[j];
	    			ordered[i] = store[j];
	    			i++;
	    		}
	    		j++;
	    	}
    		j = 0;
	    	if (many[i] != 0) {
	    		i++;
	    	}
	    	max--;
    	}
    	i = 0;
    	while (i < 11) {
			j = 0;
    		while (j < k) {
    			printSpace(count, numb[k]);
    			System.out.print("# ");
    			j++;
    		}
    		postTag(count, numb, k);
			while (numb[k] > 0 && numb[k] >= ratio * (10 - i)) {
				System.out.print(numb[k]);
				System.out.print(" ");
				postTag(count, numb, k);
				k++;
			}
				System.out.print("\n");
    		i++;			
    	}
    	i = 0;
    	j = 1;
    	while(i < 11) {
    		if(findMax(count) >= 100)
    			System.out.print("  ");
    		else if(findMax(count) >= 10)
    			System.out.print(" ");
    		System.out.print(ordered[i]);
    		System.out.print(" ");

    		i++;
    		j = 0;
    	}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        int[] count = new int[length + 1];
        char[] arr = s.toCharArray();
        char[] store = new char[length];
        float ratio;
        store = storing(store, arr, s.length());
        count = counting(count, store, arr, length);
        ratio = findMax(count) / 10.f;
        printer(store, count, ratio);
        scanner.close();
    }
}
