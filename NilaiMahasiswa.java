package com.company;

import java.util.Scanner;

public class NilaiMahasiswa {
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double hitungTotal(int parNilaiMhs, int parN) {
        for (int i = 1; i <= parN; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
        return totalNilaiMhs;
    }

    public double hitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total / jmlhMhs;
    }
}

