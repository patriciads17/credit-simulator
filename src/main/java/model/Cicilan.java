/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Cicilan {
    private int tahun;
    private double jumlahCicilan;
    private double sukuBunga;

    public Cicilan(int tahun, double jumlahCicilan, double sukuBunga) {
        this.tahun = tahun;
        this.jumlahCicilan = jumlahCicilan;
        this.sukuBunga = sukuBunga;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getJumlahCicilan() {
        return jumlahCicilan;
    }

    public void setJumlahCicilan(double jumlahCicilan) {
        this.jumlahCicilan = jumlahCicilan;
    }

    public double getSukuBunga() {
        return sukuBunga;
    }

    public void setSukuBunga(double sukuBunga) {
        this.sukuBunga = sukuBunga;
    }
}
