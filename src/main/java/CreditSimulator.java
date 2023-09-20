/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import controller.Controller;
import java.io.File;

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
            String filePath = args[0];
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File " + filePath + " tidak ada.");
                return;
            }
            
            try {
                Controller controller = new Controller();
                controller.createPinjamanByTxt(filePath);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
