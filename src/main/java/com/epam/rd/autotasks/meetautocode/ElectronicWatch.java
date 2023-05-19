package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hrs = seconds / 3600;
        if (hrs >= 24){
            hrs = Math.abs(24-(seconds / 3600));
        }
        int min = (seconds % 3600) / 60;
        int sec = seconds % 60;

        System.out.printf("%d:%02d:%02d", hrs, min, sec);
    }
}
