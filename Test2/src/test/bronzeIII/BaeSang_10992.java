package test.bronzeIII;

import java.util.Scanner;

public class BaeSang_10992 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {

            if (i == 1) {

                for (int j = 1; j < N; j++) {

                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else if (i == N) {

                for (int j = 1; j < 2*N; j++) {

                     System.out.print("*");
                 }
            }
            else {

                 for (int j = 1; j < 2*N; j++) {

                     if (j == N-i+1 || j == N+i-1) {

                         System.out.print("*");
                     }
                     else {

                         System.out.print(" ");
                     }
                 }
            }

            System.out.println();
        }
        in.close();
    }
}