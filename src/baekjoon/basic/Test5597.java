package baekjoon.basic;

import java.util.Scanner;

public class Test5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[30];

        for (int i = 0; i < 28; i++) arr[sc.nextInt()-1] = true;
        for (int i = 0; i < 30; i++) if (!arr[i]) System.out.println(i+1);
    }
}
