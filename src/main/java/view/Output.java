/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Cicilan;

/**
 *
 * @author LENOVO
 */
public class Output {
    public static void printOutput(List<Cicilan> cicilan) {
        System.out.println("Jumlah Cicilan Per Tahun:");
        for (Cicilan cicilanBaru : cicilan) {
            System.out.println(String.format("Tahun: %d, Jumlah Cicilan: Rp%,.2f, Suku Bunga: %,.2f", cicilanBaru.getTahun(), cicilanBaru.getJumlahCicilan(), cicilanBaru.getSukuBunga()));
        }
    }
}
