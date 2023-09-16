/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import model.Pinjaman;

/**
 *
 * @author LENOVO
 */
public class Input {
    public static Pinjaman readInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jenis Kendaraan: ");
        String jenisKendaraan = scanner.nextLine();

        System.out.println("Kondisi Kendaraan: ");
        String kondisiKendaraan = scanner.nextLine();

        System.out.println("Tahun Kendaraan: ");
        int tahunKendaraan = scanner.nextInt();

        System.out.println("Jumlah Pinjaman: ");
        double jumlahPinjaman = scanner.nextDouble();

        System.out.println("Tenor Pinjaman: ");
        int tenorPinjaman = scanner.nextInt();

        System.out.println("Jumlah DP: ");
        double jumlahDP = scanner.nextDouble();

        return new Pinjaman(jenisKendaraan, kondisiKendaraan, tahunKendaraan, jumlahPinjaman, tenorPinjaman, jumlahDP);
    }
}
