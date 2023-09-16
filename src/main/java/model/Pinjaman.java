package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Pinjaman {

    private String jenisKendaraan;
    private String kondisiKendaraan;
    private int tahunKendaraan;
    private double jumlahPinjaman;
    private int tenorPinjaman;
    private double jumlahDP;

    public Pinjaman(String jenisKendaraan, String kondisiKendaraan, int tahunKendaraan, double jumlahPinjaman, int tenorPinjaman, double jumlahDP) {
        this.jenisKendaraan = jenisKendaraan;
        this.kondisiKendaraan = kondisiKendaraan;
        this.tahunKendaraan = tahunKendaraan;
        this.jumlahPinjaman = jumlahPinjaman;
        this.tenorPinjaman = tenorPinjaman;
        this.jumlahDP = jumlahDP;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getKondisiKendaraan() {
        return kondisiKendaraan;
    }

    public void setKondisiKendaraan(String kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    public int getTahunKendaraan() {
        return tahunKendaraan;
    }

    public void setTahunKendaraan(int tahunKendaraan) {
        this.tahunKendaraan = tahunKendaraan;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(double jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    public int getTenorPinjaman() {
        return tenorPinjaman;
    }

    public void setTenorPinjaman(int tenorPinjaman) {
        this.tenorPinjaman = tenorPinjaman;
    }

    public double getJumlahDP() {
        return jumlahDP;
    }

    public void setJumlahDP(double jumlahDP) {
        this.jumlahDP = jumlahDP;
    }
    
    public double getSukuBunga() {
        if (jenisKendaraan.equals("Mobil")) {
            return  8;
        } else {
            return  9;
        }
    }
    
    public double getCicilanPerBulan(double bunga) {
        double pokokPinjaman = jumlahPinjaman - jumlahDP;
        double bungaPerTahun = bunga / 100;
        double bungaPerBulan = bungaPerTahun / 12;
        double angsuranPerBulan = pokokPinjaman / tenorPinjaman + bungaPerBulan;

        return angsuranPerBulan;
    }
}
