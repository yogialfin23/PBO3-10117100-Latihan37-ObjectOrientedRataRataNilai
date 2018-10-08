package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * program ini berisi program untuk menampilkan rata rata
 * nilai yang inputannya berasal dari user dengan konsep oop
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NilaiMahasiswa mhs = new NilaiMahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mhs.hitungTotal(mhs.nilaiMhs, n);
        mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
        System.out.println();
        System.out.println("Developed by : Yogie Alfin Salim");
    }
}
