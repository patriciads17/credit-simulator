/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import controller.Controller;

/**
 *
 * @author LENOVO
 */
public class CreditSimulator {

    public static void main(String[] args) {
        if (args.length == 0) {
            Controller controller = new Controller();
            controller.createPinjaman();
        } else if (args.length == 1) {
            try {
                Controller controller = new Controller();
                controller.createPinjamanByTxt();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
