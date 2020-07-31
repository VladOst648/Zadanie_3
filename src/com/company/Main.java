package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n, m  = 0;
        Scanner str = new Scanner(System.in);
        n = str.nextInt();
        int o = n;
        while (n != 0) {
            m *= 10;
            m += n%10;
            n = n/10;
        }
        System.out.println(m + " " + o);
        if (m == o) System.out.println(true);
        else System.out.println(false);
    }
}
