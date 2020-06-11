package com.company.input;

import java.util.Scanner;

public class ScannerSingleton {
    private static Scanner scan;

    public static Scanner getScanner() {
        if (scan == null){
            scan = new Scanner(System.in);
        }
        return scan;
    }
}
