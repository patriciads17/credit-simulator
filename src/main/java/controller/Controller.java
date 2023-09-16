/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import model.Cicilan;
import model.Pinjaman;
import view.Input;
import view.Output;

/**
 *
 * @author LENOVO
 */
public class Controller {
    private Pinjaman pinjaman;
    
    public void createPinjaman() {
        pinjaman = Input.readInput();
        validasiPinjaman(pinjaman);
        showCicilan(pinjaman);
    }
    
    public void createPinjamanByTxt() throws Exception {
        String[] data = readInputFromTxt();
        pinjaman = new Pinjaman(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), (int) Double.parseDouble(data[4]), Double.parseDouble(data[5]));
        validasiPinjaman(pinjaman);
        showCicilan(pinjaman);
    }
    
    public void showCicilan(Pinjaman pinjaman){
        List<Cicilan> cicilan = pinjaman.getCicilan();
        Output.printOutput(cicilan);
    }
    
    private String[] readInputFromTxt() throws Exception {

        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String[] data = new String[6];
        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextLine();
        }
        scanner.close();
        return data;
    }
    
    private void validasiPinjaman(Pinjaman pinjaman) {
        if (pinjaman.getKondisiKendaraan().equalsIgnoreCase("Baru") && pinjaman.getTahunKendaraan() < Calendar.getInstance().get(Calendar.YEAR) - 1) {
            System.out.println("Tahun kendaraan harus lebih besar atau sama dengan tahun sekarang.");
            return;
        }

        if (pinjaman.getTenorPinjaman() > 6) {
            System.out.println("Tenor pinjaman tidak boleh lebih dari 6 tahun.");
            return;
        }

        if (pinjaman.getJenisKendaraan().equalsIgnoreCase("Mobil")) {
            if (pinjaman.getJumlahDP() < (pinjaman.getJumlahPinjaman() * 0.35)) {
                System.out.println("Jumlah DP untuk mobil baru harus lebih besar atau sama dengan 35% dari jumlah pinjaman.");
                return;
            }
        } else {
            if (pinjaman.getJumlahDP() < (pinjaman.getJumlahPinjaman() * 0.25)) {
                System.out.println("Jumlah DP untuk motor baru harus lebih besar atau sama dengan 25% dari jumlah pinjaman.");
            }
        }
    }
}
