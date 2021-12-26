package com.company.desafios;

import java.util.Scanner;

public class DesafioFusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();
        int ajuste;

        if (horasaida == 0) {
            horasaida = 24;
        }

        ajuste = horasaida + tempoviagem + fuso;

        if (ajuste >= 24) {
            ajuste = ajuste - 24;
        }

        System.out.println(ajuste);

        sc.close();
    }
}
