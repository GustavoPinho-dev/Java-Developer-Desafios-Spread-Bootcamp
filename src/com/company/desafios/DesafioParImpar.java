package com.company.desafios;

import java.util.Scanner;

public class DesafioParImpar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int x = leitor.nextInt();

            if (x % 2 == 0 && x != 0) System.out.print("EVEN ");
            else if (x != 0) System.out.print("ODD ");

            if (x > 0 && x != 0) System.out.println("POSITIVE\n ");
            else if (x != 0) System.out.print("NEGATIVE\n ");

            if (x == 0) System.out.print("NULL\n");
        }
    }
}
