/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Simbok_pc
 */
public class Nomor1 {

    /**
     * fungsi ini digunakan untuk menghitung perkalian
     * @param a integer
     * @param b integer
     * @return kali;
     */
    public int perkalian(int a, int b) {
        int kali;
        kali = a * b;
        return kali;
    }

    /**
     * Fungsi ini digunakan untuk menghitung bilangan berpangkat
     * @param nilai integer
     * @param pangkat integer
     * @return hasil;
     */
    public double pemangkatan(int nilai, int pangkat) {
        int i;
        double hasil = 1;
        if (pangkat < 0) {
            pangkat = pangkat * -1;

            for (i = pangkat; i > 0; i--) {
                hasil = perkalian((int) hasil, nilai);
            }

            hasil = 1 / hasil;

        } else {
            for (i = 0; i < pangkat; i++) {
                hasil = perkalian((int) hasil, nilai);
            }
        }
        return hasil;
    }

    /**
     * fungsi ini digunakan untuk menghitung bilangan faktorial
     * @param angka integer
     * @return (angka * faktorial(angka - 1));
     */
    public int faktorial(int angka) {
        if (angka == 0) {
            return 1;
        } else {
            return (angka * faktorial(angka - 1));
        }
    }

    /**
     * fungsi ini digunakan untuk menghitung permutasi
     * @param n integer
     * @param r integer
     * @return permutasi;
     */
    public int permutasi(int n, int r) {
        int permutasi;
        permutasi = faktorial(n) / faktorial(n - r);

        return permutasi;
    }

    /**
     * fungsi ini digunakan untuk menghitung kombinasi
     * @param k integer
     * @param l integer
     * @return kombinasi;
     */
    public int kombinasi(int k, int l) {
        int kombinasi;
        kombinasi = faktorial(k) / (faktorial(l) * (faktorial(k - l)));

        return kombinasi;
    }
}
